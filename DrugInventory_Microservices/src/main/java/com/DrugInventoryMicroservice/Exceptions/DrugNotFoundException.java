package com.DrugInventoryMicroservice.Exceptions;



public class DrugNotFoundException extends RuntimeException  {



	private static final long serialVersionUID = 1L;

	public DrugNotFoundException(String s) {
		super(s);
	}
	
	

}