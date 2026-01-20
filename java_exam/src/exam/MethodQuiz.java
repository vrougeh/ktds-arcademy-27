package exam;

import java.util.Arrays;
import java.util.Random;

public class MethodQuiz {
	
	//1
	public static void printSum(int num) {
		int result = 0;
		for(int i = 1 ; i <= num ; i++) {
			result += i;
		}
		System.out.println(result);
	}
	
	
	//2
	public static void printPrime(int num) {
		int result = 0;
		boolean isPrime = true;
		for(int i = 4; i < num ; i++) {
			isPrime = true;
			for(int j = 2 ; j < i ; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(i + " ");
			}
			
		}
		System.out.println();
		
	}

	
	//3
	public static void printMax(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		}else if(num1 < num2){
			System.out.println(num2);
		}else {
			System.out.println("same");
		}
		
	}
	
	
	//4
	public static void printAge(int num) {
		if(num > 19) {
			System.out.println("성인");
		}else if(num >= 0) {
			System.out.println("미성년");
		}else {
			System.out.println("error");
		}
	}
	
	
	//5
	public static String getFizzBuzz(int num) {
		if(num % 15 == 0) {
			return "FizzBuzz";
		}else if(num % 3 == 0) {
			return "Fizz";
		}else if(num % 5 == 0) {
			return "Buzz";
		}else {
			return num + "";
		}
	}
	
	
	//6
	public static int[] getUniqueNumbers() {
		
		int[] intarr = new int[7];
		
		int uniqueNumber = 0;
		boolean existsNumber = false;
		
		for(int i = 0 ; i < intarr.length ; i ++) {
			existsNumber = false;
			uniqueNumber  = (int)(Math.random() *45+1);
			for(int j = 0 ; j < i ; j++) {
				if(intarr[j] == uniqueNumber) {
					existsNumber = true;
					break;
				}
			}
			
			if(!existsNumber) {
				intarr[i] = uniqueNumber;
			}else {
				i--;
			}
		}
		return intarr;
	}
	
	
	//7
	public static String getEvenOdd(int num1, int num2) {
		if((num1 * num2) % 2 ==0 ) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	
	
	//8
	public static int getSumOfFive(int num1,int num2,int num3,int num4,int num5) {
		int result = num1 +num2 +num3 +num4 +num5;		
		return result;
	}
	
	
	//9
	public static double getAverage(int sum, int num) {
		if (num == 0) return 0.00;
		return (double) sum/num;
	}
	
	
	//10
	public static String getGrade(int num) {
		if(num>=95) {
			return "A";
		}else if (num>= 85) {
			return "B";
		}else if (num>= 75) {
			return "C";
		}else if (num>= 65) {
			return "D";
		}else if (num < 65) {
			return "F";
		}else {
			return "";
		}
	}
	
	
	//11
	public static String nextChar(char chr) {
		char result = (char) (chr +1);
		return result + "";
	}
	
	
	//12
	public static String getCharacters(char chr1, char chr2) {
		String result = "";
		for(int i = chr1 ; i <= chr2 ; i++) {
			result += (char)i + "";
		}
		return result;
	}
	
	
	//13
	public static String getLowerCaseAlpha(char chr, int num) {
		char result = ' ';
		if(num >= 0 && num <= 25) {
			result = (char)(chr + num);
			return result+ "";
		}
		return "";
	}
	
	
	//14
	public static String convertUpperCase(char chr) {
		char result = ' ';
		if(chr>= 'a'&& chr <= 'z' ) {			
			result = (char)(chr - 32);
			return result + "";
		}else {
			return "";
		}
	}
	
	
	
	public static void main(String[] args) {
		printSum(10);
		printPrime(20);
		printMax(10,20);
		
		printAge(35);
		printAge(15);
		
		
		System.out.println(getFizzBuzz(9));
		System.out.println(getFizzBuzz(5));
		System.out.println(getFizzBuzz(315));
		System.out.println(getFizzBuzz(7));
		
		
		
		System.out.println(Arrays.toString(getUniqueNumbers()));
		
		
		
		System.out.println(getEvenOdd(4, 5));
		System.out.println(getEvenOdd(3, 5));
		
		
		
		System.out.println(getSumOfFive(1,2,3,4,5));
		
		
		
		System.out.println(getAverage(150, 3));
		
		
		
		System.out.println(getGrade(95));
		System.out.println(getGrade(85));
		System.out.println(getGrade(75));
		System.out.println(getGrade(65));
		System.out.println(getGrade(55));
		
		
		
		System.out.println(nextChar('a'));
		System.out.println(nextChar('c'));
		System.out.println(nextChar('ㄱ'));
		
		
		
		System.out.println(getCharacters('a','z'));
		System.out.println(getCharacters('A','Z'));
		System.out.println(getCharacters('가','나'));
		
		
		
		System.out.println(getLowerCaseAlpha('a',25));
		System.out.println(getLowerCaseAlpha('a',1));
		System.out.println(getLowerCaseAlpha('a',0));
		System.out.println(getLowerCaseAlpha('a',-1));
		System.out.println(getLowerCaseAlpha('a',26));
		
		
		
		System.out.println(convertUpperCase('a'));
		System.out.println(convertUpperCase('c'));
		
		
		
		System.out.println(convertUpperCase('1'));
		System.out.println(convertUpperCase('A'));
		System.out.println(convertUpperCase('^'));
		
		
	}
	
}
