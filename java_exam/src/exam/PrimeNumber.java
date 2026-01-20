package exam;

public class PrimeNumber {

	public static void main(String[] args) {
		// 2~100,000 사이 소수 출력		
		boolean isPrime = true;
		for(int i = 2 ; i < 100_000 ; i++) {
			isPrime = true;
			for(int j = 2 ; j*j < i ; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
			System.out.println(i);
			}
		}
		
		
	}
}