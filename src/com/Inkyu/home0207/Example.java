package com.Inkyu.home0207;

import java.io.UnsupportedEncodingException;

public class Example {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		#모든 문자열은 소문자로 받아서 진행 한다.
//		//1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
//		예시 )  입력> tiger
//		          입력> lion
//		          입력> rabbit
//		          출력> 가장 짧은 단어는 lion이며, 길이는 4 입니다.
		String animal[] = {"tiger","lion","rabbit"};
		int compare = 0;
		int main = 10;
		for(int i=0;i<3;i++) {
			if(animal[i].length()<main) {
				compare = i;
				main = animal[i].length();
			}
		}
		System.out.println("가장 짧은 단어는 "+animal[compare]+"이며, 길이는 "+ animal[compare].length() +"입니다.");
		

//		// 2) 문자열 개수 세기
//		-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
//		예시) 
//		-> 입력 : 1a2b3c4d 5e
//		-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개
		String str1 = "1a2b3c4d 5e";
		byte[] char1 = str1.getBytes("UTF-8");
		System.out.println(char1);
		
		
		
//
//		//3) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
//		조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
//		예시)
//		-> 입력 : "abcdefghijklmnopqrstuvwxyz"
//		-----------------------------------
//		-> 입력 : 첫번째 문자 : c
//		-> 입력 : 두번째 문자 : f
//		-> 출력 : 두 문자간의 거리 : 2
//		------------------------------------
//		-> 입력 : 첫번째 문자 : e
//		-> 입력 : 두번째 문자 : a
//		-> 출력 : 두 문자간의 거리 : 3
//
//		//4) 중복문자 제거
//		입력 : aaabbccceedddd
//		출력 : abcd
	}

}
