package com.Inkyu.home0204;

public class EmpDept extends Employee{
	
	//필드
	public String department;

	
	
	
	//생성자
	
	public void departmentInfo(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("이름 : " + name + " , 연봉 : "+ salary + " , 부서 : " + department);
	}
	
	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	
	
	
	

}
