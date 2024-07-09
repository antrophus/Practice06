package com.javaex.ex06;

public class MyBase extends Base {

	// 코드작성
	// 필드

	// 생성자
	public MyBase() {
		super();
	}
	// 메소드 gs
	// 메소드 일반

	public void service(String state) {

		if (state.equals("오후")) {
			noon();

		} else if (state.equals("낮")) {
			day();

		} else {
			night();
		}
	}

	public void noon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}

	public void day() {
		System.out.println("낮에는 열심히 수업 듣자");
	}
}
