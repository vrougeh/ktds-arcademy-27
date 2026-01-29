package com.ktdsuniversit.edu.abstracts;

public class MartTest {
	public static void main(String[] args) {
		
		int point = 1_000_000;
		int usePoint = (int) (Math.random() * point +1);
		System.out.println(usePoint);
		
		
		Guest guest = new Guest(200_000,0);
		Guest guest2 = new VIP(7000,300);
		Guest guest3 = new VVIP(0,12000);
		
		AbstractMart mart= new Mart(1500);
		AbstractMart convini = new ConvenienceStore(1500);
		
		convini.sell(guest, 5, 10000);
		convini.sell(guest2, 5, 7000);
		convini.sell(guest3, 5, 0);
		
		System.out.println(guest);
		System.out.println(guest2);
		System.out.println(guest3);
	}

}
