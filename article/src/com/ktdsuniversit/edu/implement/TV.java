package com.ktdsuniversit.edu.implement;

/**
 * TV
 * 	SamsungsmartTV
 * 		samsungTV
 * 	lgsmartTV
 * 		lgTV
 */

public interface TV {
//public abstract - 생략가능
	void turnOn();
	void turnOff();
	
	void changeChannel(int channelNumber);
	void changeVolume(int volume);
	
}
