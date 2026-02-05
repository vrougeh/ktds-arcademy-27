package com.ktdsuniversity.edu.fp.basic.calc;

public class Test {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		//num1, num2 를 더해 반환한다.
		int result = calc.calc2(1, 2, (num1, num2) -> num1 + num2);
		System.out.println(result);
		
		// num1dml num2를 제곱한 수를 반환
		result = calc.calc2(2, 10, (num1, num2) -> Math.powExact(num1, num2));
		System.out.println(result);
		result = calc.calc2(2, 10, Math::powExact);
		System.out.println(result);
		
		// num1, num2 중 큰 수를 반한
		result = calc.calc2(642, 12354, (num1, num2) -> Math.max(num1,num2));
		System.out.println(result);
		result = calc.calc2(642, 12354, Math::max);
		System.out.println(result);
		
		// num1, num2 중 작은 수를 반한
		result = calc.calc2(632, 546, (num1, num2) -> Math.min(num1,num2));
		System.out.println(result);
		result = calc.calc2(632, 546, Math::min);
		System.out.println(result);
		
		// num1이 num2의 배수라면 0을 반환 아니라면 1을 반환
		result = calc.calc2(24, 3, (num1, num2) -> num1%num2 == 0 ? 0 : 1);
		System.out.println(result);
		
	}

}