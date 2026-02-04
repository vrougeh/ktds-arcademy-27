package com.ktdsuniversity.edu.implement;

public class LGTV implements  LGSmartTV{

	public void turnOn() {
		System.out.println("LGTV를 킵니다");
	}

	@Override
	public void turnOff() {
		System.out.println("LGTV를 끕니다");
	}

	@Override
	public void changeChannel(int channelNumber) {
		System.out.println("LGTV의 체널을 바꿉니다. : " + channelNumber);
	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("LGTV의 볼륨을 바꿉니다. : " + volume);
	}

	@Override
	public void runNexflix() {
		System.out.println("LGTV의 넷플릭스를 킵니다.");
	}

	@Override
	public void runInternet() {
		System.out.println("LGTV의 인터넷을 킵니다.");
	}

	@Override
	public void runYoutube() {
		System.out.println("LGTV의 유튜브를 킵니다.");
	}

}