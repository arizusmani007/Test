package com.cg.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.bean.Invoice;



class SeviceTest {

	static InvoiceImplSer ob;
	static Invoice i;
	@BeforeAll      //in JUnit 4 @BeforeClass
	public static void beforeallTest()
	{
		ob=new InvoiceImplSer();
		i=new Invoice();
	}
	@Test
	void testcal() {
		
		
		assertTrue(ob.calculateInvoice(i)=0);
	}
	@AfterAll
	public static void afterallTest()
	{
		ob=null;
		i=null;
	}
}
