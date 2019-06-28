package com.cg.dao;

import java.util.Map;

import com.cg.bean.Invoice;

public interface InvoiceService {
	int calculateInvoice(Invoice bean);
	public Map<Integer,Invoice> getAllInvoice();

}
