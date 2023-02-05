package com.Inkyu.home0204;

public class Employee {
	
	//필드
		public String name;
		public int salary;
		

		
	//생성자
		
		public void information(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}
		
		
		public String getName() {
			return name;
		}
		
		public int getSalary() {
			return salary;
		}
	
	
	
	
	//매소드
		
		public void getInformation() {
			
		};
		public void print() {
			System.out.println("수퍼클래스");
		}
		
	
}
