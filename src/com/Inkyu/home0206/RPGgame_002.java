package com.Inkyu.home0206;

public class RPGgame_002 implements Keypad_002{

	//필드
	private int now = 0;
	
	//생성자
	public RPGgame_002(){
		now = Keypad_002.NORMAL_MODE;
		System.out.println("RPGgame실행");
	}
	
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로이동");
		
	}

	@Override
	public void leftDownButton() {
			System.out.println("캐릭터가 아래쪽으로이동");
	}

	@Override
	public void rightUpButton() {
		if(now == NORMAL_MODE) {
			System.out.println("캐릭터가 한칸단위로 점프");		
		}else if(now == HARD_MODE) {
			System.out.println("캐릭터가 두칸단위로 점프");
		}		
	}

	@Override
	public void rightDownButton() {
		switch(now) {
		case Keypad_002.NORMAL_MODE:
			System.out.println("캐릭터가 일반공격");
			break;
		
		case Keypad_002.HARD_MODE:
			System.out.println("캐릭터가 HIT공격");
			break;
		}
	}
//		System.out.println();
//		if(now == NORMAL_MODE) {
//			System.out.println("캐릭터가 일반 공격.");	
//		}else if(now == HARD_MODE) {
//			System.out.println("캐릭터가 HIT 공격.");
//		}		
//	}

	@Override
	//모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
	public void changeMode() {
		if(now == NORMAL_MODE) {
			now = Keypad_002.HARD_MODE;	
			System.out.println("현재 모드 : HardMode");
		}else if(now == HARD_MODE) {
			now = Keypad_002.NORMAL_MODE;	
			System.out.println("현재 모드 : NormalMode");
		}	
//		sum = ( sum == Keypad_002.HARD_MODE) ? Keypad_002.NORMAL_MODE
	}

}
