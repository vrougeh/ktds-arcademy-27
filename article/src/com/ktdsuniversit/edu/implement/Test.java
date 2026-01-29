package com.ktdsuniversit.edu.implement;

public class Test {
	public static void main(String[] args) {
		
		LGSmartTV lgTv = new LGTV();
		LGRemoteController lgRemoteCon = new LGSmartRemoteController();
		lgRemoteCon.turnOn(lgTv);
		lgRemoteCon.changeChannel(lgTv, 234);
		
		SamsungSmartTV samsumgTv = new SamsungTV();
		lgRemoteCon.turnOn(samsumgTv);
		
		SamsungRemoteController samsungRemoteCon = new SamsungSmartRemoteController();
		samsungRemoteCon.runMenu(samsumgTv);
		samsungRemoteCon.turnOff(samsumgTv);
	}
}
