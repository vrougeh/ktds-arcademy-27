package com.ktdsuniversity.edu.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalSeriesExam {
	
	public static void main(String[] args) {
		
		/* LocalDate		: 날짜만 처리
		 * LocalTime		: 시간만 처리
		 * LocalDateTime	: 날짜와 시간 모두 처리
		 */
		//현재 날짜를 출력한다.
		LocalDate nowDate = LocalDate.now();
		System.out.println(nowDate);
		//현재 시간을 출력한다.
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime); //15:19:56.003951300 > 15:19:56.00
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss.SS"); // 포멧 변경 방법
		String formattedTime = dtf.format(nowTime);
		System.out.println(formattedTime);
		//현재 날짜와 시간을 출력한다.
		LocalDateTime nowDateTime = LocalDateTime.now(); //2026-02-04T15:25:18.657126500 >2026-02-04T15:25:18
		System.out.println(nowDateTime);
		dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd E HH:mm:ss");
		String formattedDateTime = dtf.format(nowDateTime);
		System.out.println(formattedDateTime);
		
		
		//태어난 일이 무슨 요일인가
		LocalDate birthdate3 = LocalDate.of(1998,9,07);
		System.out.println(birthdate3);
		
		DayOfWeek week = birthdate3.getDayOfWeek();
		System.out.println(week);
		
		dtf = DateTimeFormatter.ofPattern("E요일");
		String weekString = dtf.format(birthdate3);
		System.out.println(weekString);
		
		
		LocalDate birthdate = LocalDate.parse("1998-09-07");
		System.out.println(birthdate);
		int birthyear =birthdate.getYear();
		System.out.println(birthyear);
		
		LocalDate birthdate2 = LocalDate.parse("1998년 09월 07일", DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
		System.out.println(birthdate2);
		
		
		//오늘날짜부터 19일 후가 언제인가
		LocalDate afterDate = LocalDate.now().plusDays(19);
		System.out.println(afterDate);
		//오늘날짜부터 35년 후가 언제인가
		LocalDate afterYear = LocalDate.now().plusYears(35);
		System.out.println(afterYear);		
		//오늘날짜부터 97년 전은 언제인가
		LocalDate beforeDate = LocalDate.now().minusDays(97);
		System.out.println(beforeDate);
		//오늘날짜부터 1300개월 이후는 언제인가
		LocalDate afterMonth = LocalDate.now().plusMonths(1300);
		System.out.println(afterMonth);
		
		//2025년 1월 1일은 2026년 1월 1일보다 과거인가
		LocalDate date1 = LocalDate.parse("2025-01-01");
		LocalDate date2 = LocalDate.parse("2026-01-01");
		System.out.println(date1.isBefore(date2));
		
		//2026년 12월 11일은 2025년 2월 5일보다 미래인가
		LocalDate date3 = LocalDate.parse("2026-12-11");
		LocalDate date4 = LocalDate.parse("2025-02-05");
		System.out.println(date3.isAfter(date4));
		
		Period period = Period.between(date3, date4);
		System.out.println(period); //P-1Y-10M-6D
		System.out.println(period.getYears()); //-1
		System.out.println(period.getMonths()); //-10
		System.out.println(period.getDays()); //-6
		
		Long betweenDays = ChronoUnit.DAYS.between(date3, date4);
		System.out.println(betweenDays); //-674
		
		
		Long betweenYear = ChronoUnit.YEARS.between(date3, date4);
		System.out.println(betweenYear); //-1
	}

}
