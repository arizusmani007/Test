package com.cg.service;

public interface ValidatorSer {

	public static boolean validatedata(int data)
	{
		if(data<100 && data>1)
			return true;
		else 
			return false;
	}
}
