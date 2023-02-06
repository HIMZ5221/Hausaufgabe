package com.Inkyu.home0204;

public class ObesityInfo extends StandardWeightInfo {

	//필드
	public String name;
	public int height; 
	public int weight;
	
	//생성자
	public ObesityInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	//메소드
	
	@Override
	public void getInformation() {
		System.out.println("NAME : " + name 
				+ " , HEIGHT : " + height 
				+ " , WEIGHT : " + weight 
				+ " , Obesity : " + getObesity());
		
	}
	
	
	public String getObesity() {
		if(weight>((weight-getStandardWeight())/getStandardWeight()*100)) {
			return "ㅈㄴ 비만입니다!";
		}else {
			return "정상입니다!";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
