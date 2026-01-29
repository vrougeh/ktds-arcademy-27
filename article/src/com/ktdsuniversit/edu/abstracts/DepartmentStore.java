package com.ktdsuniversit.edu.abstracts;


/*
고객의 등급이 일반등급일 경우 할인 혜택은 제공받지 못하지만 포인트를 지급받습니다.
고객의 등급이 VIP등급일 경우 3% 할인 혜택을 제공받습니다. 하지만, 포인트를 지급받지 못합니다.
고객의 등급이 VVIP인 경우 10% 할인 혜택을 제공받고 3%의 포인트를 지급 받습니다.
고객의 포인트가 10000점이 넘어갈 경우, 현금처럼 사용할 수 있습니다.
 */
public class DepartmentStore extends AbstractMart{

	public DepartmentStore(int productPrice) {
		super(productPrice);
	}

	@Override
	public int usePoint(Guest guest) {
		return 0;
	}

	@Override
	public void givePoint(Guest guest, int amount) {
		//순서 반대로 되면 Guest에서 다 걸림
		if(guest instanceof VVIP vv) {
			
		}else if(guest instanceof VIP v) {
			
		}else if(guest instanceof Guest g) {
			guest.addPoint((int)(amount*0.05));
		}
	}

	@Override
	public int discount(Guest guest, int amoutn) {
		return 0;
	}

}
