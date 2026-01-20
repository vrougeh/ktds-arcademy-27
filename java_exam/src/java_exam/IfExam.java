package java_exam;

public class IfExam {

	public static void main(String[] args) {
		
		int randomNumber = (int)(Math.random() * 100);
		System.out.println(randomNumber);

		
		System.out.println(randomNumber/10*10 + " 범위의 숫자가 나왔습니다");
		
		
		if (randomNumber/10*10 == 0) {
			System.out.println("0 범위의 숫자가 나왔습니다");
			
		}else if (10 <= randomNumber && randomNumber < 20) {
			System.out.println("10 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 20) {
			System.out.println("20 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 30) {
			System.out.println("30 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 40) {
			System.out.println("40 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 50) {
			System.out.println("50 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 60) {
			System.out.println("60 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 70) {
			System.out.println("70 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 80) {
			System.out.println("80 범위의 숫자가 나왔습니다");
			
		}else if (randomNumber/10*10 == 90) {
			System.out.println("90 범위의 숫자가 나왔습니다");
			
		}else {
			System.out.println("error");
		}
		
		
		
		if (randomNumber >= 90) {
			System.out.println("90 범위의 숫자가 나왔습니다");
		}else if (randomNumber >= 80) {
			System.out.println("80 범위의 숫자가 나왔습니다");
		}else if (randomNumber >= 70) {
			System.out.println("70 범위의 숫자가 나왔습니다");
		}else if (randomNumber >= 60) {
			System.out.println("60 범위의 숫자가 나왔습니다");
		}else if (randomNumber >= 50) {
			System.out.println("50 범위의 숫자가 나왔습니다");
		}
	}

}
