package com.Inkyu.home0206;

public class Example_002 {

	public static void main(String[] args) {

		
		RPGgame_002 rpg = new RPGgame_002();
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.rightUpButton();
		rpg.rightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.rightDownButton();
		
		System.out.println("=========================");
		
		ArcadeGame_002 ag = new ArcadeGame_002();
		ag.leftUpButton();
		ag.rightUpButton();
		ag.changeMode();
		ag.rightUpButton();
		ag.rightDownButton();
		ag.leftDownButton();
		ag.changeMode();
		ag.rightDownButton();
		
		
		

	}

}
