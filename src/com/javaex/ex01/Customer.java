package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	
	private int no;
	private int point;
	//생성자
	public Customer() {
		super();
	}
	public Customer(String name, String hp, int no, int point) {
		super.name = name;
		super.hp = hp;
		this.no = no;
		this.point = point;
	}
	
	//메소드 gs
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드 일반 - toString
	@Override
	public String toString() {
		return "Customer [no=" + no + ", point=" + point + ", name=" + name + ", hp=" + hp + "]";
	}
	
	//메소드 일반 - showInfo
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp+" ,#고객번호:"+no+", #포인트점수:"+point);
	}

	
}
