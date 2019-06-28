package com.cg.dao;

import java.util.Map;

import com.cg.bean.Invoice;

public interface InvoiceRepo {
	int saveInvoice(Invoice bean);
	public Map<Integer,Invoice> getAllInvoice();

}
