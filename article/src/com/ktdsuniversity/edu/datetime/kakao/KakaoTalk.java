package com.ktdsuniversity.edu.datetime.kakao;

public class KakaoTalk {
	public static void main(String[] args) {
		
		FriendList fl = new FriendList();
		
		fl.add(new Friend("A", "2026-02-01"));
		fl.add(new Friend("B", "2026-01-29"));
		fl.add(new Friend("C", "2026-02-04"));
		fl.add(new Friend("D", "2026-02-11"));
		fl.add(new Friend("E", "2020-02-04"));
		fl.add(new Friend("F", "2018-02-01"));
		fl.add(new Friend("G", "1998-01-28"));
		fl.add(new Friend("H", "2002-02-10"));
		
		fl.printSpecialFriends(Base.FUTURE); // 생일이 다가오는 친구
		fl.printSpecialFriends(Base.NOW); // 오늘이 생일인 친구
		fl.printSpecialFriends(Base.PAST); // 생일이 지난 친구
		
		
		System.out.println(fl);
	}
}
