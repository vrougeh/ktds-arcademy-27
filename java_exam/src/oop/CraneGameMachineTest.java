package oop;

public class CraneGameMachineTest {
	public static void main(String[] args) {
		CraneGameMachine cgm = new CraneGameMachine(20);
		
		cgm.insertCoin();
		int result = cgm.doGame();

		
		System.out.println("isInsertCoin: " + cgm.isInsertCoin);
		System.out.println("남은 인형개수: " + cgm.dolls);
		System.out.println("뽑은 인형개수: " + result);

		
	}

}
