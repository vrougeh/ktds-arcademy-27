package exam;

public class IfQuiz2 {

	public static void main(String[] args) {
		
		int money = 1_000_000;
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
	
		int flightFare = 0;
		
		flightFare += getFlightFare(father);
		flightFare += getFlightFare(mother);
		flightFare += getFlightFare(daughter);
		
		System.out.println(money - flightFare);
		
		if (money > flightFare) {
			System.out.println("여행가자!");
		}else {
			System.out.println("다음에가자");
		}
		

	}
	
	public static int getFlightFare(int age) {
		if (age > 19) {
			return 330000;
		}else {
			return 100000;
		}
	}

}
