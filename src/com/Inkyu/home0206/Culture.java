package com.Inkyu.home0206;

public abstract class Culture {
	String title = null;
	int director = 0;
	int actor = 0;
	int audience = 0;
	int sum = 0;
	
	public Culture(String title, int director, int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
	//메소드
	
	//관객수와 총점을 누적시키는 기능
	public void setTotalScore(int score) {
		
	}
	
	//평점을 구하는 기능
	public String getGrade() {
		return null;
	}
	
	//정보를 출력하는 추상메소드
	//추상메소드는 생성자를 가질 수 있음.
	public abstract void getInformation();
	
}
