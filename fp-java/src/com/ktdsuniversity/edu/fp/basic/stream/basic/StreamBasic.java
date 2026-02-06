package com.ktdsuniversity.edu.fp.basic.stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.fp.basic.stream.object.Dish;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishList;
import com.ktdsuniversity.edu.fp.basic.stream.object.DishType;
import com.ktdsuniversity.edu.fp.basic.stream.object.FoodType;

public class StreamBasic {
	
	public void printDishUseFor() {
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인  && food.type== meat - for");
		
		List<Dish> dishList= DishList.makeDishList();
		for(Dish dish : dishList) {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT) {
				System.out.println(dish);
				
			}
		}
		
	}
	
	public void printDishUseForEach() {
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && dish.getFoodType() == FoodType.MEAT - List.forEach");
		List<Dish> dishList= DishList.makeDishList();
		
		dishList.forEach(dish -> {
			if(dish.getCalories() < 500 && dish.getFoodType() == FoodType.MEAT) {
				System.out.println(dish);
			}
		});
//		dishList.forEach(System.out::println);
		
	}
	public void printDishUseStream() {
		System.out.println("전체 요리 목록 - 칼로리가 500 미만인 && dish.getFoodType() == FoodType.MEAT && dish.getDishType() == DishType.FISH - Stream");
		//stream을 사용할 수 있는 대상 -> List, Set
		
		List<Dish> dishList= DishList.makeDishList();
		dishList //List<Dish>
				.stream() //Stream<Dish>
//				.peek(dish -> {
//					System.out.println("첫번째 filter를 수행하기 이전의 인스턴스값");
//					System.out.println("1. " + dish.getName());
//					System.out.println("1. " + dish.getCalories());
//					System.out.println("1. " + dish.getFoodType());
//					System.out.println("1. " + dish.getDishType());
//				}) // STream<Dish> (현재 반복중인 인스턴스를 확인- 디버깅용도
				.filter(dish -> dish.getCalories() < 500 ) //Stream<Dish>
//				.peek(dish -> {
//					System.out.println("두번째 filter를 수행하기 이전의 인스턴스값");
//					System.out.println("2. " + dish.getName());
//					System.out.println("2. " + dish.getCalories());
//					System.out.println("2. " + dish.getFoodType());
//					System.out.println("2. " + dish.getDishType());
//				}) // STream<Dish> (현재 반복중인 인스턴스를 확인- 디버깅용도
				.filter(dish -> dish.getFoodType() == FoodType.MEAT) //Stream<Dish>
				.peek(dish -> {
					System.out.println("세번째 filter를 수행하기 이전의 인스턴스값");
					System.out.println("3. " + dish.getName());
					System.out.println("3. " + dish.getCalories());
					System.out.println("3. " + dish.getFoodType());
					System.out.println("3. " + dish.getDishType());
				}) // STream<Dish> (현재 반복중인 인스턴스를 확인- 디버깅용도
				.filter(dish -> dish.getDishType() == DishType.FISH) //Stream<Dish>
//				.peek(dish -> {
//					System.out.println("네번째 filter를 수행하기 이전의 인스턴스값");
//					System.out.println("4. " + dish.getName());
//					System.out.println("4. " + dish.getCalories());
//					System.out.println("4. " + dish.getFoodType());
//					System.out.println("4. " + dish.getDishType());
//				}) // STream<Dish> (현재 반복중인 인스턴스를 확인- 디버깅용도
				.forEach(dish -> System.out.println(dish));
		
	}
	
	public void printEvenNumbdrs() {
		
		List<Integer> numbers = Arrays.asList(3,213,5,46,1,3,189,398,132,321,3216,457894);
		
		//numbers에 있는 값을 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers.stream().map(num -> num*2).forEach(System.out::println);
		
		System.out.println("=".repeat(50));
		//numbers에 있는 값에서 중복된 숫자는 모두 제거하고 나머지 숫자에 전부 2를 곱해서 짝수로 만들어 출력한다.
		numbers
		.stream() // Stream<Integer>
		.distinct() // 중복제거 Stream<Integer>
		.map(num -> num*2) // Stream<Integer>
		.forEach(System.out::println);
	}
	
	public String makeString() {
		
		//모든 BAGETABLES 메뉴의 이름들을 ","로 연결한 문자열을 반환한다.
		List<Dish> dishList = DishList.makeDishList();
		
		String dishName = dishList
							.stream()
							.filter(dish -> dish.getFoodType() == FoodType.VEGETABLES)
							.map(Dish::getName)
							.collect(Collectors.joining(", "));
		
		return dishName;
	}
	
	public List<Dish> getHealthyDishes() {
		// 변경 불가능한 리스트 (add 불가)
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes
								.stream()
								.filter(dish -> dish.getCalories() < 400)
								.toList();
		return result;
	}
	
	
	public List<Dish> getHealthyDishes2() {
		// 변경 가능한 리스트
		List<Dish> dishes = DishList.makeDishList();
		
		List<Dish> result = dishes
								.stream()
								.filter(dish -> dish.getCalories() < 400)
								.collect(Collectors.toList());
		return result;
	}
	
	
	public static void main(String[] args) {
		
		StreamBasic basic = new StreamBasic();
		
		basic.printDishUseFor();

		basic.printDishUseForEach();
		
		basic.printDishUseStream();
		
		basic.printEvenNumbdrs();
		
		String dishName = basic.makeString();
		System.out.println(dishName);
		
		List<Dish> result = basic.getHealthyDishes();
		System.out.println(result);
		//error
//		result.add(new Dish("곱창", FoodType.MEAT, 2000, DishType.MEAT));
		
		
		List<Dish> result2 = basic.getHealthyDishes2();
		System.out.println(result2);
		result2.add(new Dish("곱창", FoodType.MEAT, 2000, DishType.MEAT));
		System.out.println(result2);
	}

}
