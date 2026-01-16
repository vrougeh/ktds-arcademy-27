package java_exam;

public class CompareExam {

	public static void main(String[] args) {
		
		int age = 10;
		
		//age 가 10대인가
		// 10 <= age <20
		
		boolean teanage = 10 <= age && age < 20;
		System.out.println(teanage);
		System.out.println(10 <= age && age < 20);
		
		
		//age가 20대인가
		//20 <= age < 30
		boolean twenage = 20 <= age && age < 30;
		System.out.println(twenage);
		
		
		int customerAge = 15;
		
		int customerWallet = 3000;
		
		boolean isBuy = customerAge >= 19 && customerWallet >= 1500;
		System.out.println(isBuy);
		
		
		// b >= 19 , b = 2000    (B% 3 == 0) = true
		
		customerAge = 23;
		customerWallet = 1300;
		
//		boolean three = customerAge % 3 == 0;
//		System.out.println(three);
		
		
		
		isBuy = ((customerAge % 3 == 0) || customerWallet >= 2000) && customerAge >= 19;
		System.out.println(isBuy);
		
		
		boolean isAdult = customerAge >= 19;
		boolean buyAble = (customerAge % 3 == 0) || customerWallet >= 2000;
		
		isBuy = isAdult && buyAble;
		System.out.println(isBuy);
		

	}

}
