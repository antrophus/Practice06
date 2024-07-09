package com.javaex.ex04;

public class Customer extends User {

	// 필드
	private int point;

	// 생성자
	public Customer() {
		super();
	}

	public Customer(int point) {
		super();
		this.point = point;
	}

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	// 메소드 gs
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	// 메소드 일반 -toString

	@Override
	public String toString() {
		return "Customer id=" + id + ", password=" + password + ", name=" + name + ", point=" + point;
	}

	// 메소드 - showInfo
	public void showInfo() {
		System.out.println("#아이디: " + id + ", #패스워드: " + password + ", #이름:" + name + ", #포인트:" + point);
	}

}
