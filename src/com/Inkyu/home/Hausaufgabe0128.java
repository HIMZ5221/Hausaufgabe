package com.Inkyu.home;

public class Hausaufgabe0128 {
	public static void main(String[] args) {
		
	//문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
		int A = 37;
		int B = 91;
		
		System.out.println("A의값 : " + A + "  B의값 : " + B);
		
	//문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A /(double) B);
		
	//문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
		
		int var1 = 128;
		String var2 = "B";
		char var3 = 44032;
		long var4 = 100000000000L;
		float var5 = 43.93106f;
		double var6 = 301.3;
		
		System.out.printf("int : %d | String : %s | char : %s | long : %d | flat : %f | dobule : %f \n", var1, var2, var3, var4, var5, var6);
		
	//문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
		byte a = 35;
		byte b = 25;
		int c = 463;
		long d = 1000L;
		
	//4-1
		int result1 = 0;
		result1 = a + b + c + (int)d ;
		System.out.println(result1);
	
	//4-2
		int result2 = 0;
		result2 = a + b + c;
		System.out.println(result2);
	
	//4-3
		double result3 = 0;
		double e = 45.31;
		result3 = c + d + e;
		System.out.println(result3);
		
	//문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
		int intValue1 = 24;
		int intValue2 = 3;
		int intValue3 = 8;
		int intValue4 = 10;
		char charValue = 'A';
		String strValue = charValue+String.valueOf(intValue1)+intValue2 +"번지" + intValue3 + "." + intValue4 ;
		
		
		
		System.out.println(strValue);
		
	//추가문제) 아래와 같이 변수 값이 주어질 경우 각 자리의 합을 구해 출력하세요.
		int value = 485; 
		int sum = 0;
		
		
		while(value > 0) {
			sum += value%10 ;
			value /= 10;
		}
		
		System.out.println(sum);
		
		
		
	}
}
