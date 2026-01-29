package com.ktdsuniversit.edu.abstracts;

public class ConvenienceStore extends AbstractMart{

	public ConvenienceStore(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		int point =guest.getPoint();
		if(point >= 100) {
			guest.usePoint(point);
			return point;
		}
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		int point = (int) (amount *0.01);
		guest.addPoint(point);
	}

	@Override
	public int discount(Guest guest, int amoutn) {
		return 0;
	}

}
