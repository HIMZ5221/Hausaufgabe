package com.Inkyu.home0206;

import java.util.Scanner;

public class RandomGame {
	
	public static Keypad_002 getRandomeGame() {
		Keypad_002 game = null;
		//random data출력
		int random = (int)(Math.random()*2)+1;
		//random ==1일 경우 rpggame실행
		//random ==2일 경우 arcadegame실행
		return (random == 1) ? new RPGgame_002() : new ArcadeGame_002();
		//if(random ==1){
		//	game = new RPGgame();
		//}else{
		//	game = new ArcadeGame_002();
	}	//}
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		Scanner sc = new Scanner(System.in);
		//다형성, 자동타입변환 - > 하나의 객체로 두개또는 여러개의 객체 만들어 사용
		Keypad_002 game = getRandomeGame();  //☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		
		while(run) {
			System.out.println("=====================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("=====================================================================");
			System.out.println("입력>");
			int menuNo = Integer.parseInt(sc.nextLine());
			
			switch(menuNo) {
			case 1:
				game.leftUpButton();
				break;
			case 2:
				game.leftDownButton();
				break;
			case 3:
				game.rightUpButton();
				break;
			case 4:
				game.rightDownButton();
				break;
			case 5:
				game.changeMode();
				break;
			case 0:
				getRandomeGame();
				break;
			case 9:
				run = false;
				break;
			}
		}
		
//			( RPGgame or ArcadeGame )
//		2) 다음과 같이 메뉴를 구성한다.
//			<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>
//		3) 아래와 같이 출력결과가 나오도록 실행코드를 구현한다.
//		- 출력결과
		
		
		
		
		
	}
}
