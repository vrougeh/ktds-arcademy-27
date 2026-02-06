package com.ktdsuniversity.edu.fp.basic.stream.advanced;

import java.util.List;
import java.util.Optional;

public class CityTest {
	
	public static void main(String[] args) {
		List<City> cities = City.loadCityData();
		
		cities.forEach(System.out::println);
		
		
		// stateId가 3907번인 City의 CountryName을 출력
//		for(City city: cities) {
//			if(city.getStateId() == 3907) {
//				System.out.println(city.getCountryName());
//			}
//		}		
		// ==> Stream Code로 출력
		cities
		.stream()
		.filter(city -> city.getStateId() == 3907) //Stream<City>
		.distinct() //메모리 비교함으로써 효과 없음
		.forEach(city -> System.out.println(city.getCountryName()));
		
		System.out.println("=".repeat(30));
		
		cities
		.stream()
		.filter(city -> city.getStateId() == 3907) //Stream<City>
//		.map(city -> city.getCountryName()) //Stream<String>
		.map(City::getCountryName) //Stream<String>
		.distinct() //Stream<String> String 값 비교함으로써 적용됨
		.forEach(System.out::println);

		
		System.out.println("=".repeat(30));
		
		
		//countryName 이 "South Korea"인 City의 _native를 출력
		cities
		.stream()
		.filter(city -> city.getCountryName().equals("South Korea"))
		.forEach(city -> System.out.println(city.get_native()));
		
		
		System.out.println("================");
		
		//countryName 이 "South Korea"이면서 _native의 길이가 3이상인 City의 _native를 출력
		cities
		.stream()
		.filter(city -> city.getCountryName().equals("South Korea") && city.get_native().length() >= 3)
		.forEach(city -> System.out.println(city.get_native()));
		
		
		System.out.println("=".repeat(30));
		
		
		cities
		.stream()
		.filter(city -> city.getCountryName().equals("South Korea") && city.get_native().length() >= 3)
		.skip(3)	//위치중요
		.limit(3)	//위치중요
		.forEach(city -> System.out.println(city.get_native()));
		
		
		//_native의 값이 한글로만 이루어진 값 중에서 _navtive의 길이가 4글자 이상인 것의 name을 중복없이 조회한다.
		System.out.println("=".repeat(30));
		
		cities
		.stream()
		.filter(city -> city.get_native().matches("^[가-힣 ]{4,}+$"))
		.map(City::getName)
		.distinct()
//		.map(String::length)
//		.filter(length -> length >= 10)
//		.distinct()
		.forEach(System.out::println);
		
		//예시
//		String name = "가나다";
//		System.out.println(name + "은 한글로만 이루어져있다?" + name.matches("^[가-힣 ]{4,}+$"));
		// ^[가-힣 ]{4,}+$ 한글과 공백으로이루어진 4글자 이상
		
		
		//애월읍의 stateName을 출력한다.
		
		Optional<City> found = cities.stream() // Stream<City>
		.filter(city -> city.getName().equals("Gaigeturi")) //Stream<City>
		.findFirst(); //Optional<City>
		
		System.out.println(found.orElse(null).getStateName());
		
		
		Optional<City> found2 = cities.stream() // Stream<City>
				.filter(city -> city.getName().equals("sadfsadfasdf")) //Stream<City>
				.findFirst(); //Optional<City>
				
		//Exception 방지 1
		City city = found2.orElse(null);
		if(city != null) {
			System.out.println(found2.orElse(null).getStateName());	
		}
		//Exception 방지 2
		if(found2.isPresent()) {
			System.out.println(found2.orElse(null).getStateName());	
		}
		
		//Exception 방지 3
		City city2 = found2.orElse(new City(""));
		System.out.println(city2.getStateName());
		
		//최종함수 없는 코드
		cities.stream()
		.peek(_city -> System.out.println(_city.getCountryCode()))
		.filter(_city -> true)
		.map(_city -> city.get_native());
		
		System.out.println("=========");
		
	}

}
