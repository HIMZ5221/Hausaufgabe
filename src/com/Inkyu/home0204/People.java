package com.Inkyu.home0204;

public class People {

	public static void main(String[] args) {

		
		Human people1 = new StandardWeightInfo("홍길동", 168, 45);
		Human people2 = new ObesityInfo("박돌이", 168, 90);
		
		//people1.info("홍길동", 168, 45);
		//people2.info("박돌이", 168, 90);
		
		people1.getInformation();
		people2.getInformation();
		
		

	}

}
