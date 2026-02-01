package com.ktdsuniversit.edu.restaurant;

import com.ktdsuniversit.edu.restaurant.exceptions.*;


public class RestaurantTest {
	public static void main(String[] args) {
		Menu[] menus = {
				new Menu("메뉴 1", 5000, 50, 200),
				new Menu("메뉴 2", 10000, 100, 200),
				new Menu("메뉴 3", 8000, 80, 200),
				new Menu("메뉴 4", 4000, 6.0, 200),
				new Menu("메뉴 5", 6000, 19.0, 200)
		};
		Menu[] menus2 = {
				new Menu("메뉴", 0, 50, 200),
				new Menu("메뉴", 0, 100, 200),
				new Menu("메뉴", 0, 80, 200),
				new Menu("메뉴", 0, 6.0, 200),
				new Menu("메뉴", 0, 19.0, 200)
		};
		
		Restaurant VIPS = new Restaurant("VIPS", 190, 19, 0, menus);
		Customer customer1 = new Customer("손님1", 0, 0, 30000);
		
		System.out.println("============== 영업 시작 ==============");
		
		// 1. 정상 주문들
		safeOrder(customer1, VIPS, menus, 4);
		safeOrder(customer1, VIPS, menus, 2);
		safeOrder(customer1, VIPS, menus, 1);

		
		System.out.println("\n--- 예외 테스트 구간 ---\n");
		//1. 생성한 Exception 확인
		safeOrder(customer1, VIPS, menus, 3);
		safeOrder(customer1, VIPS, menus, 0);
		// 2. 없는 인덱스 접근 시도 (ArrayIndexOutOfBoundsException)
		safeOrder(customer1, VIPS, menus, 10); 
		// 3. 다른 식당 메뉴 주문
		safeOrder(customer1, VIPS, menus2, 3);
		//4. null 확인
		safeOrder(null, VIPS, menus2, 3);
		
		
		VIPS.printInformation();
	}

	/**
     * [주문 수행 메서드]
     * 반복되는 try-catch 블록을 하나로 모아 관리합니다.
     */
	public static void safeOrder(Customer customer, Restaurant restaurant, Menu[] menuList, int index) {
		try {
			// 1. 배열 인덱스 검사 (가장 먼저 해야 함)
			if (index < 0 || index >= menuList.length) {
				throw new ArrayIndexOutOfBoundsException("존재하지 않는 메뉴 번호입니다: " + index);
			}

			// 2. 메뉴 꺼내기
			Menu selectedMenu = menuList[index];

			// 3. 주문 시도 (Customer.order에서 각종 예외 발생 가능)
			customer.order(restaurant, selectedMenu);
	
		} catch (ArrayIndexOutOfBoundsException e) { // 배열 에러
			System.out.println("[시스템 오류] " + e.getMessage());
			
		} catch (IllegalArgumentException e) { // restaurant에 menu가 없을때
			System.out.println("[잘못된 요청] " + e.getMessage());
			
		} catch (FullException | DrunkenException | InsufficientBalanceException | SoldOutException e) { 
			System.out.println("[주문 불가] " + e.getMessage());
			
		} catch (NullPointerException e) {
			System.out.println("[데이터 오류] 정보가 비어있습니다.");
			
		} catch (Exception e) {
			// 그 외 예상 못한 모든 에러 처리
			System.out.println("[알 수 없는 에러] " + e.getMessage());
		}
		System.out.println();
	}
}