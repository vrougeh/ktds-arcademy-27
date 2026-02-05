package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.time.Period;

public class KakaoTalk {
	public static void main(String[] args) {
		
		FriendList fl = new FriendList();
		
		fl.add(new Friend("A", "2026-02-01"));
		fl.add(new Friend("B", "2026-01-29"));
		fl.add(new Friend("C", "1996-02-05"));
		fl.add(new Friend("D", "2025-02-11"));
		fl.add(new Friend("김가나", "2020-02-05"));
		fl.add(new Friend("이다라", "2000-02-01"));
		fl.add(new Friend("박마바", "1998-01-28"));
		fl.add(new Friend("최사아", "2002-02-10"));
		
		System.out.println("7일 이내에 생일을 맞이하는 친구 목록");
//		fl.printSpecialFriends(birthdate -> birthdate.isAfter(LocalDate.now()) && birthdate.isBefore(LocalDate.now().plusDays(8)));
		fl.printSpecialFriends2(friend -> {
			LocalDate birthdate = friend.getBirthdate().withYear(LocalDate.now().getYear());
			return birthdate.isAfter(LocalDate.now()) && birthdate.isBefore(LocalDate.now().plusDays(8));
		});
		
		System.out.println("오늘이 생일인 친구 목록");
//		fl.printSpecialFriends(birthdate -> birthdate.equals(LocalDate.now()));
		
		fl.printSpecialFriends2(friend -> {
			LocalDate now = LocalDate.now();
			LocalDate birthdate = friend.getBirthdate().withYear(now.getYear());
			return birthdate.isEqual(now);
		});
		
		
		System.out.println("7일 이내에 생일이 지난 친구 목록");
//		fl.printSpecialFriends(birthdate -> birthdate.isBefore(LocalDate.now()) && birthdate.isAfter(LocalDate.now().minusDays(8)));
		fl.printSpecialFriends2(friend -> {
			LocalDate birthdate = friend.getBirthdate().withYear(LocalDate.now().getYear());
			return birthdate.isBefore(LocalDate.now()) && birthdate.isAfter(LocalDate.now().minusDays(8));
		});
		
		System.out.println("오늘 만 30세가 된 친구 목록");
		fl.printSpecialFriends2(friend -> {
			Period period = Period.between(friend.getBirthdate(), LocalDate.now());
			return period.getYears() == 30 && period.getMonths()==0 && period.getDays() ==0;
		});
		
		System.out.println("이름이 A인 친구목록");
		fl.printSpecialFriends2(friend -> friend.getName() == "A");
		
		System.out.println("이름이 김으로 시작하는 친구목록");
		fl.printSpecialFriends2(friend -> friend.getName().startsWith("김"));
		
		
		System.out.println("이름이 이로 시작하면서 나인가 20세 이상인 친구 목록");
		fl.printSpecialFriends2(friend -> friend.getName().startsWith("이") && Period.between(friend.getBirthdate(), LocalDate.now()).getYears() > 20);
		
		
		System.out.println("전체 친구 목록");
//		System.out.println(fl);
		fl.printSpecialFriends(friend -> true);
	}
}
