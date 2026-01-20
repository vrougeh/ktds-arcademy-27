package exam;

public class ForQuiz {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		
		int sum = 0;
		for (i = 0; i < 101 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		sum = 0;
		for (i = 0; i < 101 ; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		
		for (i = 1; i < 101 ; i++) {
			if(i % 3 == 0 || i % 5 == 0 || i % 6 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		for(i = 0; i < 5 ; i++) {
			for(j = 0; j <= i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		for (i = 0 ; i < 5 ; i++) {
			System.out.println(i+1);
		}
		
		
		for (i = 5 ; i > 0 ; i--) {
			System.out.println(i);
		}
	}

}
