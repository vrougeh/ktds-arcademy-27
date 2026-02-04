package com.ktdsuniversity.edu.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		
		int month = now.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int date = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(date);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		
		String[] weekDays = {"일","월","화","수","목","금","토"};
		System.out.println(weekDays[week - 1]+"요일");
		
		
		Calendar birthdate = Calendar.getInstance();
		birthdate.set(1998, 9 - 1 , 07);
		week = birthdate.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDays[week - 1]+"요일");
		
		
		// 오늘 날짜부터 56일 후는 몇월 몇일 무슨요일일까
		Calendar now2 = Calendar.getInstance();
		
		now2.add(Calendar.DAY_OF_MONTH, 56);
		//now2에서 연월일 요일 추출 출력
		year = now2.get(Calendar.YEAR);
		month = now2.get(Calendar.MONTH) + 1;
		date = now2.get(Calendar.DAY_OF_MONTH);
		week = now2.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 " + date+"일 " + weekDays[week- 1]+"요일");
		
		
		
		// 2025년 2월 4일은 2026년 2월 4일보다 과거인가
		Calendar now3 = Calendar.getInstance();
		
		Calendar past = Calendar.getInstance();
		past.set(2025, 2-1, 4);
		
		//now3, past의 시간이 1970년 1월 1일 0시 0분 0초 부터 얼마나 흘렀나 확인
		Long nowTime = now3.getTimeInMillis();
		System.out.println(nowTime);
		Long pastTime = past.getTimeInMillis();
		System.out.println(pastTime);
		
		if(pastTime < nowTime) {
			System.out.println("더 과거입니다.");
		}
		System.out.println(now3.after(past));
		System.out.println(now3.before(past));
		
		
		
		//2026년 2월 4일 부터 2026년 7월 14일까지 며칭리 걸리나?
		Calendar now4 = Calendar.getInstance();
		int daysCount = 0;
		while(true) {
			now4.add(Calendar.DAY_OF_MONTH, 1);
			daysCount++;
			if(now4.get(Calendar.YEAR) == 2026 && now4.get(Calendar.MONTH) == 6 && now4.get(Calendar.DAY_OF_MONTH) == 14 ) {
				break;
			}
		}
		System.out.println(daysCount+"일 걸렸습니다.");
		
		
		
		//오늘부터 7영업일 이후는 몇월 며칠 무슨요일 인가
		Calendar now5 = Calendar.getInstance();
		int num = 7;
		while(num > 0) {
			now5.add(Calendar.DAY_OF_MONTH, 1);
			week = now5.get(Calendar.DAY_OF_WEEK);
			if(weekDays[week- 1] != "토" && weekDays[week- 1] != "일") {
//			if(week != 1 && week != 7){
				num--;
			}
		}
		year = now5.get(Calendar.YEAR);
		month = now5.get(Calendar.MONTH) + 1;
		date = now5.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "년 " + month + "월 " + date+"일 " + weekDays[week- 1]+"요일");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일");
		Date dateTime = now5.getTime();
		String dateString = sdf.format(dateTime);
//		dateString += " " + weekDays[week- 1]+"요일";
		System.out.println(dateString);
		
		
	}
}