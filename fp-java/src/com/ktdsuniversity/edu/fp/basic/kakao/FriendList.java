package com.ktdsuniversity.edu.fp.basic.kakao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FriendList {
	
	private List<Friend> friends;
	
	public FriendList() {
		this.friends = new ArrayList<>();
	}
	
	
	public void add(Friend friend) {
		this.friends.add(friend);
	}
	
	public void printSpecialFriends(Search search) {
		
		LocalDate tempBirthdate = null;
		
		for(Friend f : this.friends){
			// 아래 코드를 사용하여 년도 상관없이 날짜만으로 비교 할 수 있게 세팅을 해준다. 아래 코드 없으면 년도도 기준에 들어감 그래서 출력되지않음
//			tempBirthdate = LocalDate.parse(f.getBirthdate().toString());
//			tempBirthdate = tempBirthdate.withYear(LocalDate.now().getYear());
			
			if(search.check(f)) {
				System.out.println(f);
			}
		}
		System.out.println();
	}
	
	
	
	@Override
	public String toString() {
		
		StringBuffer buffer = new StringBuffer();
		
		if(this.friends.size() == 0) {
			buffer.append("등록된 친구가 없습니다.");
		}else {
			for(Friend f : this.friends) {
				buffer.append(f);
				buffer.append("\n");
			}
		}
		
		return buffer.toString();
	}

}
