package com.ktdsuniversit.edu.generics;

public class ScoreListTest {
	public static void main(String[] args) {
		//JAVA 1.6 ver
		//ScoreList<Integer> list = new ScoreList<Integer>();
		
		ScoreList<Integer, Integer> list = new ScoreList<>();
		
		list.add(123_456);
		list.add(654_321);

		//아래 코드로 변경
//		int sum0= 0;
//		for(int i = 0 ; i< 2 ; i++) {
//			sum0 += list.get(i);
//		}
//		System.out.println(sum0);
		
		
		Reducer<Integer, Integer> listReducer = new Reducer<>() {

			@Override
			public Integer reduce(Integer input, Integer output) {
				return input+output;
			}
		};
		
		int sum = list.sum(listReducer, 0);
		System.out.println(sum);
		
		
		ScoreList<String,String> strList = new ScoreList<>();
		strList.add("asd123sdfff");
		strList.add("asdijsd456fpoxzcv");

		String concat = "";
		for(int i = 0 ; i < 2 ; i++) {
			concat += strList.get(i);
		}
		System.out.println(concat);
		
		
		ScoreList<String[],String> arrayList = new ScoreList<>();
		arrayList.add(new String[] {"asdfasdf","123456","123asd"});
		arrayList.add(new String[] {"asdsdff","123sdf6","1sddsfasd"});
		
//		String arrayConcat = "";
//		for(int i = 0 ; i< 2 ; i++) {
//			arrayConcat+= Arrays.toString(arrayList.get(i));
//		}
//		System.out.println(arrayConcat);
//		
//		
//		String[] arrayValue = arrayList.get(1);
//		System.out.println(arrayValue);

		
		Reducer<String[],String> arrayReducer = new Reducer<>() {

			@Override
			public String reduce(String[] input, String output) {
				for(int i = 0 ; i < input.length ; i++) {
					output += input[i];
				}
				return output;
			}
			
		};
		
		String arrayResult = arrayList.sum(arrayReducer, "");
		System.out.println(arrayResult);
		
		
		
	}

}