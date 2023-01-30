package com.Inkyu.home;

import java.util.Scanner;

public class Hausaufgabe0130 {
	public static void main(String[] args) {
		
	//문제1) 차례대로 x와 y의 값이 주어졌을 때 어느 사분면에 해당되는지 출력하도록 구현
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이거슨 사분면을 측증하는 것이여");
		System.out.println("x값을 입력하쇼");
		int x = sc.nextInt();
		System.out.println("y값을 입력하쇼");
		int y = sc.nextInt();
		
		if(x == 0 || y == 0) {
			System.out.println("값이 좌표축 위에 있다!!!!");
		}else if(x >0) {
			if(y > 0) {
				System.out.println("제 1 사분면 입니다.");
			}else{
				System.out.println("제 4 사분면 입니다.");
			}
		}else if(y > 0){
			System.out.println("제 2 사분면 입니다.");
		}else if(y < 0){
			System.out.println("제 3 사분면 입니다.");
		}
		
		
		
	//문제2) 연도가 주어졌을 때 해당 년도가 윤년인지를 확인해서 출력하도록 하세요.
		
		System.out.println("===========================");
		System.out.println("윤년 측정기 잉께 보고싶은 년도를 입력하이소");
		//값을 주워담기
		double year = sc.nextDouble();
		//100으로 나누어지면 거짓, but 400으로 나누어진다면 참
		boolean result = (year % 100 != 0 || year % 400 == 0);
		
		if(year % 4 == 0 && result) {
				System.out.println("으악 윤년이다!");	
		}else {
			System.out.println("윤년이 아니다 !");
		}
		
		
		
	//문제3) switch문을 이용하여 가위, 바위, 보 중 하나가 주어졌을 때 사용자 어떤 값을 가져야 이길 수 있는 지를 출력하도록
		
		System.out.println("===========================");
		System.out.println("이거슨 가위바위보 답안지여. (가위/바위/보) 중 하나를 정확히 차분하게 입력하쇼 잉");
		String A = sc.next();
		
		switch(A){
		case "가위" :
			System.out.println("주먹을 내십쇼");
			break;
		case "바위" :
			System.out.println("보자기를 내십쇼");
			break;
		case "보" :
			System.out.println("가위를 내십쇼");
			break;
		default :
			System.out.println("잘못 입력하셧다!!!!");
			System.out.println("하지만 남자는 '주먹'이다");
		}
		
		
	//문제4) 차례대로 m과 n을 입력받아 m단을 n번째까지 출력하도록 하세요.
		
		System.out.println("===========================");
		System.out.println("자자자~ 원하는 구구단을 보여주겠다 해");
		System.out.println("★원하는 '단' 을 입력하라 해★");
		int num1 = sc.nextInt();
		System.out.println("★후딱후딱 보고싶은 범위값을 입력하라 해!!!!★");
		int num2 = sc.nextInt();
		
		System.out.println("★★★두두두두둥장!!! ==");
		for(int i = 1;i <=num2; i++) {
			System.out.println(num1 + " X " + i + " = " + (num1*i));
		}
		
		
		
	//호수에서 살고 있는 얼음요정이 곱셈을 공부하기로 했다. 근데 이 요정은 너무 멍청해서 9라는 숫자 이외에는 헷갈려서 잘 쓰지 못한다고 한다. 그래서 사람과는 곱셈방식이 좀 다르다.
		
//		System.out.println("===========================");
//		System.out.println("★멍청한오팔얼음요정의 곱셈시간이야!★");
//		System.out.println("숫자를 입력해!!");
//		int N = sc.nextInt();
//		
//		
//		int num9 = 9;
//		
//		for(int i = 1 ; i<=N ; i++) {
//			for(int j = 1 ; j<=N ; j++) {
//				int a = i * j ;
//				int sum1 = i* j ;
//				boolean bool = true;
//				while (bool) {
//					
//					if(a%10 == 9) {
//						a /= 10;
//						sum1 = 9;
//					}
//				}
//				while (b>0) {
//					b /= 10;
//					if(b%10 == 9) {
//						sum1 = 9;
//					}
//				}
//					
//				System.out.print(i + " * " + j + " = " + sum1);
//		
//			}
//			System.out.println();
//		}
//		
//		
////		while(a%10 != 9 ||)
		
		
		
		
		
		
	}
}
