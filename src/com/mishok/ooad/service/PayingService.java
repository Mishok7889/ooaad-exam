package com.mishok.ooad.service;

import com.mishok.ooad.model.Invoice;
import com.mishok.ooad.model.PayData;
import com.mishok.ooad.pay.ExternalPayService;
import com.mishok.ooad.response.PayingResponse;

public class PayingService {
    public static int MAX_NUMBER_OF_UNPAID_INVOICES = 5;
    private ExternalPayService externalPayService;
    private InvoiceService invoiceService;
    private BlockingService blockingService;


    /**
     * The method is responsible for paying with external service.
     * Here we check whether user is suspended and return error if it is.
     *
     * Also, if we cannot pay some number of invoices, we would suspend the user.
     * If you want to unsuspend — update it with API.
     *
     */
    public PayingResponse payInvoice(Invoice invoice){
        //Extract data for paying from the invoice
        PayData payData = new PayData();
        PayingResponse payingResponse = externalPayService.pay(payData);
        //Get number of invalid invoices
        Invoice[] invalidInvoices = invoiceService.getInvalidInvoices(100, invoice.getUser());
        if(invalidInvoices.length > MAX_NUMBER_OF_UNPAID_INVOICES){
            blockingService.blockUser(invoice.getUser());
            return new PayingResponse("User blocked", false);
        }
        invoiceService.updateInvoice(invoice);
        return payingResponse;
    }
}
