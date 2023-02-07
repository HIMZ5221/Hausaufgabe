package com.Inkyu.home0206;

public class ArcadeGame_002 implements Keypad_002{
	//필드
	private int now = 0;
	
	//생성자
	public ArcadeGame_002(){
		now = Keypad_002.NORMAL_MODE;
		System.out.println("ArcadeGame실행");
	}
	
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒷쪽으로이동");		
	}
	@Override
	public void rightUpButton() {
		if(now == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");		
		}else if(now == HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}		
	}

	@Override
	public void rightDownButton() {
		if(now == NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격.");	
		}else if(now == HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격.");
		}	
		
	}

	@Override
	public void changeMode() {
		if(now == NORMAL_MODE) {
			now = Keypad_002.HARD_MODE;	
			System.out.println("현재 모드 : HardMode");
		}else if(now == HARD_MODE) {
			now = Keypad_002.NORMAL_MODE;	
			System.out.println("현재 모드 : NormalMode");
		}		
	}

}
