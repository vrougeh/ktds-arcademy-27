package com.ktdsuniversit.edu.implement;

public class SamsungSmartRemoteController implements SamsungRemoteController{

	@Override
	public void turnOn(TV tv) {
		tv.turnOn();
	}

	@Override
	public void turnOff(TV tv) {
		tv.turnOff();
	}

	@Override
	public void changeChannel(TV tv, int channelNumber) {
		tv.changeChannel(channelNumber);
	}

	@Override
	public void changeVolume(TV tv, int volume) {
		tv.changeVolume(volume);
	}

	@Override
	public void runNexflix(SamsungSmartTV tv) {
		tv.runNexflix();
	}

	@Override
	public void runMenu(SamsungSmartTV tv) {
		tv.runMenu();
	}

	@Override
	public void runCoupangPlay(SamsungSmartTV tv) {
		tv.runCoupangPlay();
	}

}
