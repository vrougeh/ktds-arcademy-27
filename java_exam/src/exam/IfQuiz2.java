package exam;

public class IfQuiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
	
		
		if (father > 19) {
			money = (money - adultOneWayFlightFare);
		}else {
			money = money - kidOneWayFlightFare;			
		}

		if (mother > 19) {
			money = money - adultOneWayFlightFare;
		}else {
			money = money - kidOneWayFlightFare;			
		}
		
		if (daughter > 19) {
			money = money - adultOneWayFlightFare;
		}else {
			money = money - kidOneWayFlightFare;			
		}
		
		System.out.println(money);
		
		if (money  > 0) {
			System.out.println("여행가자!");
		}else {
			System.out.println("다음에가자");
		}
		

	}

}
