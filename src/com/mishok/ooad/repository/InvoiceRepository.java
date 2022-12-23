package com.mishok.ooad.repository;

import com.mishok.ooad.model.Invoice;

public class InvoiceRepository {
    /**
     * Add invoice to db.
     */
    public Invoice addInvoice(Invoice invoice) {
        return new Invoice();
    }

    /**
     * Delete invoice by id.
     */
    public Invoice deleteInvoice(long id) {
        return new Invoice();
    }

    /**
     * Get invoice by id.
     */
    public Invoice getInvoice(long id) {
        return new Invoice();
    }

    public Invoice[] getInvalidInvoices(long period, long id) {
        return new Invoice[5];
    }

    public Invoice updateInvoice(Invoice invoice) {
        return new Invoice();
    }
}