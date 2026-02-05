package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;

public class Friend {
	
	private String name;
	private LocalDate birthdate;
	
	public Friend(String name , String birthdate) {
		this.name = name;
		this.birthdate = LocalDate.parse(birthdate);
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	@Override
	public String toString() {
		return "이름 : " + this.name + ", 생일 : " + this.birthdate;
	}
	
	

}
