package com.cg.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Invoice;

public class InvoiceImpl implements InvoiceService,InvoiceRepo {
	static Map<Integer,Invoice> mp=new HashMap<Integer,Invoice>();

	@Override
	public int saveInvoice(Invoice bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculateInvoice(Invoice bean) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<Integer, Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return null;
	}
}
