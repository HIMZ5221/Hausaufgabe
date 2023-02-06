package com.Inkyu.home0204;

public class Human {
	
	//필드
	public String name;
	public int height; 
	public int weight;
	
	
	//생성자
	public void info(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//메소드
	public void getInformation() {
		System.out.print("NAME : " + name 
				+ " , HEIGHT : " + height 
				+ " , WEIGHT : " + weight); 
	}
	
	
}
