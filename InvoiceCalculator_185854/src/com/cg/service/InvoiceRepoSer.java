package com.cg.service;

import java.util.Map;


import com.cg.bean.Invoice;

public interface InvoiceRepoSer {
	int saveInvoice(Invoice bean);
	public Map<Integer,Invoice> getAllInvoice();
	public default void printStatement(Invoice ob) {
		 
		 System.out.println("========================================");
		 System.out.println("Statement for Item ID: "+ob.getId());
		 System.out.println("Weight: "+ob.getWeight());
		 System.out.println("Distance: "+ob.getDistance());
		 System.out.println("Amount: "+ob.getAmount());
		 System.out.println("CGST: "+ob.getCgst());
		 System.out.println("SGST: "+ob.getSgst());
		 System.out.println("========================================");
}
}