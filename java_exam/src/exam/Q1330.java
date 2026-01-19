package exam;

public class Q1330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1330
		int num1 = 1;
		int num2 = 2;
		
		if (num1 > num2) {
			System.out.println(">");
		}else if (num1 < num2) {
			System.out.println("<");
		}else {
			System.out.println("==");
		}
		
		
		//Q9498
		int score = 100;
		
		if (score >= 90 && score <= 100 ) {
			System.out.println("A");
		}else if(score >= 80 && score < 90 ) {
			System.out.println("B");
		}else if(score >= 70 && score < 80 ) {
			System.out.println("B");
		}else if(score >= 60 && score < 70 ) {
			System.out.println("B");
		}else {
			System.out.println("F");
		}
		
		
		
		//Q2753
		int year = 2000;
		
		int year400 = year % 400;
		System.out.println(year400);
		
		int year4 = year % 4 ;
		int year100 = year % 100;
		System.out.println(year4);
		
		
		if(year400 == 0) {
			System.out.println("1");
		}else if( year4 == 0 && year100 == 1) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
		
		//Q14681
		int x = 12;
		int y = 5;
		
		if(x > 0) {
			if (y > 0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		}else {
			if (y > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
		
		
		
		//Q2884
		int h = 0;
		int m = 30;
		int time = h * 60 + m - 45;
		System.out.println(time);
		if(time < 0) {
			time += 24*60;
		}
		System.out.println(time/60 +" "+ time%60);
		
		
		if (m >= 45) {
			System.out.println(h +" " + (m-45));
		}else {
			h -= 1;
			m += 15;
			if(h < 0) {
				h += 24;
			}
			System.out.println(h +" " + m);
		}

		
		
		
		//Q2525
		h = 17;
		m = 40;
		time = 80;
		
		m += time;
		if(h + (m/60) >= 24 ) {
			h %= 24;
		}
		System.out.println((h+(m/60)) +" " + (m%60));

		
		
		
		//Q2480
		int dice1 = 2;
		int dice2 = 2;
		int dice3 = 3;
		
		if(dice1 == dice2 && dice2 == dice3) {
			System.out.println(10000 + dice1 * 1000);
		}else if (dice1 == dice2) {
			System.out.println(1000 + dice1 * 100);
		}else if (dice1 == dice3) {
			System.out.println(1000 + dice1 * 100);
		}else if (dice2 == dice3) {
			System.out.println(1000 + dice2 * 100);
		}else {
			if(dice1 > dice2) {
				if (dice1 > dice3) {
					System.out.println(dice1 * 100);
				}else {
					System.out.println(dice3 * 100);
					}
			}else if (dice2 > dice3) {
				System.out.println(dice2 * 100);
			}else {
				System.out.println(dice3 * 100);
			}
		}
		
		
		
		//https://school.programmers.co.kr/learn/courses/30/lessons/120829
		int angle = 70;
		
		if(angle < 90 && angle > 0) {
			System.out.println(1);
		}else if(angle == 90) {
			System.out.println(2);
		}else if (angle < 180 && angle > 90) {
			System.out.println(3);
		}else if (angle == 180) {
			System.out.println(4);
		}else {
			System.out.println("error");
		}
		
		
		
		//https://school.programmers.co.kr/learn/courses/30/lessons/120830
		int n = 64;
		int k = 6;
		
		int result = n * 12000 + (k - n/10) * 2000;
		System.out.println(result);
	}
}
