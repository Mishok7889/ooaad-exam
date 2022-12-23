package com.mishok.ooad.service;

import com.mishok.ooad.dto.UserInvoiceData;
import com.mishok.ooad.enums.PayType;
import com.mishok.ooad.model.Invoice;
import com.mishok.ooad.model.User;
import com.mishok.ooad.pay.ExternalPayService;
import com.mishok.ooad.repository.InvoiceRepository;

public class InvoiceService {
    private InvoiceRepository invoiceRepository;

    /**
     * Add invoice to db.
     *
     */
    public Invoice addInvoice(UserInvoiceData userInvoice) {
        Invoice invoice = new Invoice();
        return invoiceRepository.addInvoice(invoice);
    }

    public Invoice updateInvoice(Invoice invoice){
        return invoiceRepository.updateInvoice(invoice);
    }

    public Invoice deleteInvoice(long id) {
        return invoiceRepository.deleteInvoice(id);
    }

    public Invoice getInvoice(long id) {
        return invoiceRepository.getInvoice(id);
    }

    /**
     * Get all invalid invoices during some period for a user.
     */
    public Invoice[] getInvalidInvoices(long period, User user){
        return invoiceRepository.getInvalidInvoices(period, user.getId());
    }
}