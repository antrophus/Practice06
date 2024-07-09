package com.javaex.ex05;

public class Depart extends Employee{

	 //코드작성
	//필드
	private String depart;

	//생성자
	public Depart() {
		super();
	}

	public Depart(String depart) {
		super();
		this.depart = depart;
	}
	
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	//메소드 gs

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
	//메소드 일반 -toString
	@Override
	public String toString() {
		return "Depart [depart=" + depart + ", toString()=" + super.toString() + "]";
	}
	
	//메소드 일반 -showInfo
	public void showInfo() {
		System.out.println("이름:" + super.getName() + "  연봉:" + super.getSalary() + "  부서:" + depart);
	}

	
	

}
