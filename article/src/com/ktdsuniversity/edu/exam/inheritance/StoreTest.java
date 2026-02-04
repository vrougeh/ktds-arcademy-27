package com.ktdsuniversity.edu.exam.inheritance;

//6. 실행 클래스 (StoreTest)
public class StoreTest {
	public static void main(String[] args) {

	// 구매자 생성
	Customer customer = new Customer("홍길동", 100000, 20000, "VVIP");
	Customer customer2 = new Customer("홍길", 100000, 0, "일반");
	System.out.println("초기 상태 1: " + customer);
	System.out.println("초기 상태 2: " + customer2);
	
	// 상점 객체 생성
	Store mart = new Mart("마트");
	Store cvs = new ConvenienceStore("GS25");
	Store dept = new DepartmentStore("현대백화점");
	
	// 1. 일반마트
	mart.sell(customer, 5000, 10000);
	mart.sell(customer2, 5000, 10000);
	
	// 2. 편의점
	// 홍길동: 20000포인트 > 3000원 -> 포인트 전액(20000) 사용 로직상 "보유포인트 0됨". 실제 결제 0원.
	cvs.sell(customer, 3000, 5000);
	cvs.sell(customer2, 3000, 5000);
	
	// 3. 백화점
	// 홍길동: VVIP할인(5000원) -> 45000원 결제. 포인트 0이라 사용불가.
	dept.sell(customer, 50000, 100000);
	dept.sell(customer2, 50000, 100000);
	
	System.out.println("\n--------------------------------");
	System.out.println("최종 상태 1: " + customer);
	System.out.println("최종 상태 2: " + customer2);
	
	}
}