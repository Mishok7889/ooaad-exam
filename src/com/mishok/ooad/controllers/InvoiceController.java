package com.mishok.ooad.controllers;

import com.mishok.ooad.dto.UserInvoiceData;
import com.mishok.ooad.model.Invoice;
import com.mishok.ooad.response.HTTPResponse;
import com.mishok.ooad.service.InvoiceService;
import com.mishok.ooad.pay.ExternalPayService;
import com.mishok.ooad.service.PayingService;
import com.mishok.ooad.service.UserService;

/**
 * User has 2 ways to pay: manual and automatic.
 *
 *
 */
public class InvoiceController{
    private InvoiceService invoiceService;
    private PayingService payingService;

    /**
     * Add a new invoice either automatic or manual.
     *
     * POST /api/invoice
     */
    public HTTPResponse addInvoice(String request){
        //Get data from user request for UserInvoiceData object
        UserInvoiceData userInvoiceData = new UserInvoiceData();
        invoiceService.addInvoice(userInvoiceData);
        return new HTTPResponse("Added");
    }

    /**
     * DELETE /api/invoice/{id}
     *
     * Delete an invoice from the system by id.
     */
    public HTTPResponse deleteInvoice(String request){
        //Get id from request
        long id = 0;
        invoiceService.deleteInvoice(id);
        return new HTTPResponse("Deleted");
    }

    /**
     * GET /api/invoice/{id}
     *
     * Get invoice data by id
     */
    public HTTPResponse getInvoice(String request){
        //Get id from request
        long id = 0;
        invoiceService.getInvoice(id);
        return new HTTPResponse("Invoice data");
    }

    /**
     * GET /api/invoice/{id}/auto-pay
     *
     * Retry paying for automatic invoice.
     * If invoice mod is "manual" error will be returned.
     */
    public HTTPResponse retry(String request){
        //Get invoice id from the request
        long invoiceId = 0;
        Invoice invoice = invoiceService.getInvoice(invoiceId);
        payingService.payInvoice(invoice);
        return new HTTPResponse("Paid");
    }
}