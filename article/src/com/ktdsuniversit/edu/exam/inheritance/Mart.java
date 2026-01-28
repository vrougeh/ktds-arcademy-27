package com.ktdsuniversit.edu.exam.inheritance;

//3. Mart (일반마트: 기본 판매/거스름돈)
class Mart extends Store {
 
 public Mart(String storeName) {
     super(storeName);
 }

 @Override
 public int sell(Customer customer, int price, int moneyPaid) {
     System.out.println("\n--- [" + this.storeName + "] 에서 판매 시작 ---");
     
     if (moneyPaid < price) {
         System.out.println("지불 금액이 부족합니다.");
         return moneyPaid;
     }

     // 실제 계산 로직
     int change = moneyPaid - price;
     customer.money -= price;

     System.out.println("상품 가격: " + price + "원");
     System.out.println("지불 금액: " + moneyPaid + "원");
     System.out.println("거스름돈: " + change + "원");

     return change;
 }
}