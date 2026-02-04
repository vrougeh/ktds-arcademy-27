package com.ktdsuniversity.edu.constants;

public class Calculator {
	
	public static final int ADD = 1;
	public static final int SUB = 2;
	public static final int MUL = 3;
	public static final int DIV = 4;

	private int num1;
	private int num2;
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int compute2(Operator operator) {
		if(operator == operator.ADD) {
			return this.num1 + this.num2;
		}else if(operator == operator.SUB) {
			return this.num1 - this.num2;
		}else if(operator == operator.MUL) {
			return this.num1 * this.num2;
		}else if(operator == operator.DIV) {
			return this.num1 / this.num2;
		}
		return 0;
	}
	
	
	public int compute(int operator) {
		if(operator == 1) {
			return this.num1 + this.num2;
		}else if(operator == 2) {
			return this.num1 - this.num2;
		}else if(operator == 3) {
			return this.num1 * this.num2;
		}else if(operator == 4) {
			return this.num1 / this.num2;
		}
		return 0;
	}
}
