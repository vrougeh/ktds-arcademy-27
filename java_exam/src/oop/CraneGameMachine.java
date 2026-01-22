package oop;

import java.util.Random;

public class CraneGameMachine {
	boolean isInsertCoin;
	int dolls;
	
	public CraneGameMachine(int dolls) {
		this.dolls = dolls;
	}
	
	public void insertCoin() {
		if(dolls > 0) {
			isInsertCoin = true;
		}
	}
	
	
	public int doGame() {
		if(isInsertCoin) {
			int randomNumber = (int)(Math.random() * 100+1) - 50;
//			System.out.println(randomNumber);
			if(randomNumber >0) {
				dolls -= 1;
				isInsertCoin = false;
				return 1;
			}
		}
		return 0;
	}

}
