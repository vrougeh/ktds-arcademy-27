package com.ktdsuniversit.edu.exceptions;

public class RandomExtractNumbers {

	private String[] numbers;
	
	
	public RandomExtractNumbers() {
		this.numbers = new String[100];
		
		int index = 0;
		for(int i = 0 ; i < 20 ; i++) {
			index = (int)(Math.random() * this.numbers.length);
			this.numbers[index] = (int)(Math.random() * 1_000_000) + "";
			
		}
		
		for(int i = 0 ; i < 20 ; i++) {
			//0-99중 하나
			index = (int)(Math.random() * this.numbers.length);
			// 122 = 'z' 97 = 'a'
			this.numbers[index] = (char)((Math.random() * 26) + 97) + "";
		}	
	}
	
	public void printNumber(int index) {
		//this.numbers 의 index에 존제하는 값을 출력한다
		//값이 숫자인경우 그대로 출력하고
		//숫자가 아닌경우 0을 출력한다
//		System.out.println(index);
//		System.out.println(this.numbers.length);
		int result = 0;
		String str = "";
		
		if(index < this.numbers.length) {
			if(this.numbers[index] != null) {
				String value = this.numbers[index];
				
				if(value.matches("^[0-9]+$")) {
					//System.out.println(this.numbers[index]);
					System.out.println("index : " + index + "\t -  " +"Value : " + value);
					int num = Integer.parseInt(value);
					str = "correct value     ";
					result = num;
					
				}else if(value.matches("^[a-z]+$")){
					System.out.println("index : " + index + "\t -  " +"Value : " + value);
					str = "not number format";
					result = 0;
				}
			}else {
				//System.out.println(this.numbers[index]);
				str= "null error     ";
			}
		}else {
			str= "out of length";
		}
		
		System.out.println("index : " + index + "\t -  " + str + "\t -  result : " + result);
		
	}
	
	public static void main(String[] args) {
		
		RandomExtractNumbers ren = new RandomExtractNumbers();
		int index = 0;
		for(int i = 0; i< 50 ; i++) {
			index = (int) (Math.random() * 200);
			ren.printNumber(index);			
		}
		
	}
}
