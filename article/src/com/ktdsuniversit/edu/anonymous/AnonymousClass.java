package com.ktdsuniversit.edu.anonymous;

import com.ktdsuniversit.edu.abstracts.AbstractMart;
import com.ktdsuniversit.edu.abstracts.Guest;
import com.ktdsuniversit.edu.implement.TV;

public class AnonymousClass {
	public static void main(String[] args) {
	
		AbstractMart mart = new AbstractMart(1500) { // 여기부터 닫히는 곳 까지 클래스임(익명클래스)

			@Override
			public int usePoint(Guest guest) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public void givePoint(Guest guest, int amount) {
				guest.addPoint(10_000_000);
				
			}

			@Override
			public int discount(Guest guest, int amount) {
				// TODO Auto-generated method stub
				return amount;
			}
		};
		
		Guest guest = new Guest(0,0);
		
		mart.sell(guest, 10000, 0);
		System.out.println(guest);
		
		
		TV emartTV = new TV() {

			@Override
			public void turnOn() {
				System.out.println("emart tv on");
			}

			@Override
			public void turnOff() {
				System.out.println("emart tv off");
			}

			@Override
			public void changeChannel(int channelNumber) {
				System.out.println("emart tv change channel : " + channelNumber);
			}

			@Override
			public void changeVolume(int volume) {
				System.out.println("emart tv change volume : " + volume);
			}
		};
		
		emartTV.turnOn();
		emartTV.changeChannel(123);
		
		System.out.println(mart);
		System.out.println(emartTV);
	}
}
