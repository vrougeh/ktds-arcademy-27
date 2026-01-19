package exam;

public class PrimeNumber {

	public static void main(String[] args) {
		// 2~100,000 사이 소수 출력		
		for(int i = 2 ; i < 100_000 ; i++) {
			int count = 0;
			for(int j = 2 ; j < i ; j++) {
				if(i % (double)j == 0) {
					count++;
					j = i;
				}
			}
			if(count == 0) {
			System.out.println(i);
			}
		}
	}
}