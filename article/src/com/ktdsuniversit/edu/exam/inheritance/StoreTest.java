package com.ktdsuniversit.edu.exam.inheritance;

//6. 실행 클래스 (StoreTest)
public class StoreTest {
 public static void main(String[] args) {
     
     // 구매자 생성
     Customer customer = new Customer("홍길동", 100000, 20000, "VVIP");
     Customer customer2 = new Customer("홍길", 100000, 0, "일반");
     System.out.println("초기 상태: " + customer);

     // 상점 객체 생성 (다형성 활용: 변수는 Store 타입)
     Store mart = new Mart("이마트");
     Store cvs = new ConvenienceStore("GS25");
     Store dept = new DepartmentStore("현대백화점");

     // 1. 일반마트 판매 테스트
     // 상품: 5,000원 / 지불: 10,000원
     mart.sell(customer, 5000, 10000);
     mart.sell(customer2, 5000, 10000);
     
     // 2. 편의점 판매 테스트
     // 상품: 3,000원 / 지불: 5,000원 (보유 포인트가 100넘으면 강제 전액사용됨)
     // 현재 포인트 20,000점 -> 전액 사용되어 0원 결제 예상
     cvs.sell(customer, 3000, 5000);
     cvs.sell(customer2, 3000, 5000);

     // 3. 백화점 판매 테스트
     // 상품: 50,000원 / 지불: 100,000원
     // VVIP(10% 할인) + 포인트(편의점에서 다 써서 0점이라 사용 안됨) + 3% 적립
     dept.sell(customer, 50000, 100000);
     dept.sell(customer2, 50000, 100000);

     System.out.println("\n최종 상태: " + customer);
 }
}