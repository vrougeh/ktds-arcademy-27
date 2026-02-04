package com.ktdsuniversity.edu.inheritance;

public class VehicleTest {
	public static void main(String[] args) {
		Vehicle test0 = new Vehicle("1");
		Vehicle test1 = new SportsCar("sports");
		Vehicle test2 = new EV("ev",76f);
		Vehicle test3 = new BatMobile("batcar");
		
		test0.startMoter();
		test1.startMoter();
		test2.startMoter();
		test3.startMoter();
		
	}

}
