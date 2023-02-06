package com.Inkyu.home0204;

public class StandardWeightInfo extends Human {

	//필드
	
	public String name;
	public int height; 
	public int weight;
	
	//생성자
	public StandardWeightInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//메소드
	
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(" , StandardWeight : " +getStandardWeight());
	}
	

	
	public double getStandardWeight() {
			return (double)((height - 100)*0.9);
		
	}

	
	
	
	
	
	
	
	
}
