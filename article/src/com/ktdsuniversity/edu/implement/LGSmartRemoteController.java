package com.ktdsuniversity.edu.implement;

public class LGSmartRemoteController implements LGRemoteController {

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
	public void runNexflix(LGSmartTV tv) {
		tv.runNexflix();
	}

	@Override
	public void runInternet(LGSmartTV tv) {
		tv.runInternet();
	}

	@Override
	public void runYoutube(LGSmartTV tv) {
		tv.runYoutube();
	}

}
