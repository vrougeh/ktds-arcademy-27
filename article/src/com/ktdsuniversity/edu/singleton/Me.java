package com.ktdsuniversity.edu.singleton;

public class Me {
	
	//전역 => static
	private static Me me;
	
	private String name;
	
	private Me() {
		this.name = "내이름";
	}
	
	public static Me getInstance() {
		if(Me.me == null) {
			Me.me = new Me();
		}
		return Me.me;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
