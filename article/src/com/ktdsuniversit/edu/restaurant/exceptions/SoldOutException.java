package com.ktdsuniversit.edu.restaurant.exceptions;

//품절 예외
public class SoldOutException extends Exception {
    public SoldOutException(String message) { super(message); }
}