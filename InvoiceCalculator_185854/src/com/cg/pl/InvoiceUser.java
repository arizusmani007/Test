package com.cg.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import com.cg.bean.Invoice;
import com.cg.service.InvoiceImplSer;
import com.cg.service.ValidatorSer;

public class InvoiceUser {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InvoiceImplSer service=new InvoiceImplSer();
		Map<Integer,Invoice> mp=new TreeMap<Integer,Invoice>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String choice="";
		while(true)
		{
			System.out.println("Menu");
			System.out.println("==========");
			System.out.println("1 Enter New Details");
			System.out.println("2 Calculate Invoice");
			System.out.println("3 Display all records");
			System.out.println("4 Exit");
			choice=br.readLine();
			switch(choice)
			{
			case "1":int id=0;
					int weight=0;
					int distance=0;
					double amount=0.0;
					double cgst=0.0;
					double sgst=0.0;
						System.out.println("Generate ID");
						double i=Math.random()*1000;
						id=(int)i;
						System.out.println(id);
						System.out.println("Enter weight in KG");
						while(true)
						{
							weight=Integer.parseInt(br.readLine());
							boolean ch1=ValidatorSer.validatedata(weight);
							if(ch1==true)
							{
								try {
									break;
								}catch(NumberFormatException e) {
									System.out.println("Weight should be more than 1 KG");
								}
							}
							else
							{
								System.out.println("Weight should be more than 1 KG.Re-enter weight");
							}
						}
						System.out.println("Enter distance in KM");
						while(true)
						{
							distance=Integer.parseInt(br.readLine());
							boolean ch1=ValidatorSer.validatedata(distance);
							if(ch1==true)
							{
								try {
									break;
								}catch(NumberFormatException e) {
									System.out.println("Distance should be more than 100 KM");
								}
							}
							else
							{
								System.out.println("Distance should be more than 100 KM.Re-enter distance");
							}
						}
						Invoice ob=new Invoice(id,weight,distance,amount,cgst,sgst);
						mp.put(ob.getId(),ob);
						break;
			case "2":	System.out.println("Enter ID");
							int idd=Integer.parseInt(br.readLine());
			            	service.calculateInvoice(mp.get(idd));
			            	break;
			case "3":	Collection<Invoice> vc=mp.values();
						List<Invoice> acclist=new ArrayList<Invoice>(vc);
						//Collections.sort(acclist);

						for(Invoice o:acclist)
						{
							//System.out.println(o);
							service.printStatement(o);
						}
						break;
			case "4":	System.out.println("Exiting Program");
						System.exit(0);
			default:	System.out.println("Invalid choice");
					
					
			}
		}
	}

}
