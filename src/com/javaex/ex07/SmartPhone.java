package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str) {

		if ("앱".equals(str)) {
			playApp();

		} else if ("통화".equals(str)) {
			phoneCall();

		} else {
			super.execute(str);
		}
	}

	// 코드작성
	protected void playApp() {
		System.out.println("앱실행");
	}
	protected void phoneCall() {
		System.out.println("통화기능시작");
	}
	// 메소드작성

	// 메소드작성

}
