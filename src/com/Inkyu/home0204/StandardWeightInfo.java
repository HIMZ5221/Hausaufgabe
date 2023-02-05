package com.Inkyu.home0204;

public class StandardWeightInfo extends Human {

	//필드
	
	
	
	//생성자
	
	
	//메소드
	
	@Override
	public void getInformation() {
		System.out.println("NAME : " + name 
				+ " , HEIGHT : " + height 
				+ " , WEIGHT : " + weight 
				+ " , StandardWeight : " +getStandardWeight());
	}
	
	
	public double getStandardWeight() {
			return ((height - 100)*0.9);
		
	}
	
	
	
	
	
	
	
	
	
}
