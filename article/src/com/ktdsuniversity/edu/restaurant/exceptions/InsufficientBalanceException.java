package com.ktdsuniversity.edu.restaurant.exceptions;

//잔액 부족 예외
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String message) { super(message); }
}