package com.cg.service;

import java.util.Map;

import com.cg.bean.Invoice;
import com.cg.dao.InvoiceImpl;
import com.cg.dao.InvoiceRepo;
import com.cg.dao.InvoiceService;

public class InvoiceImplSer implements InvoiceServiceSer,InvoiceRepoSer {

	InvoiceRepo dao1=new InvoiceImpl();
	InvoiceService dao2=new InvoiceImpl();

	@Override
	public int saveInvoice(Invoice bean) {
		// TODO Auto-generated method stub
		dao1.saveInvoice(bean);
		return 0;
	}

	@Override
	public int calculateInvoice(Invoice bean) {
		// TODO Auto-generated method stub
		double transcharge=bean.getDistance()*bean.getWeight()*2;
		double cgst=transcharge*0.035;
		double sgst=transcharge*0.035;
		bean.setCgst(cgst);
		bean.setSgst(sgst);
		double totalcharge=cgst+sgst+transcharge;
		bean.setAmount(totalcharge);
		return (int)totalcharge;
	}

	@Override
	public Map<Integer, Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return dao1.getAllInvoice();
		//return dao2.getAllInvoice();
	}

	@Override
	public void printStatement(Invoice ob) {
		// TODO Auto-generated method stub
		InvoiceRepoSer.super.printStatement(ob);
	}

}
