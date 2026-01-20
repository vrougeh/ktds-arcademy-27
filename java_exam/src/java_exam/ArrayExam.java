package java_exam;

public class ArrayExam {

	public static void main(String[] args) {
		
		int[] scoreArr = new int[7]; // 공식
		
//		int scor2[] = new int[7]; // c 스타일
		
//		System.out.println(scoreArr);
		
		scoreArr[0] = 11;
		scoreArr[1] = 22;
		scoreArr[2] = 33;
		scoreArr[3] = 44;
		scoreArr[4] = 55;
		scoreArr[5] = 66;
		scoreArr[6] = 777;
		
		for(int i = 0 ; i < scoreArr.length ; i++) {
			scoreArr[i] = (int)(Math.random() * 45 + 1);
		}
		
		
		
//		System.out.println(scoreArr[0]);
//		System.out.println(scoreArr[1]);
//		System.out.println(scoreArr[2]);
//		System.out.println(scoreArr[3]);
//		System.out.println(scoreArr[4]);
//		System.out.println(scoreArr[5]);
//		System.out.println(scoreArr[6]);
		
//		for(int i = 0 ; i < scoreArr.length ; i++) {
//			System.out.println(scoreArr[i]);
//		}
		
//		int j = 0;
//		while(j < scoreArr.length) {
//			System.out.println(scoreArr[j++]);
//		}
		
		for(int i = 0 ; i < scoreArr.length ; i++) {
			scoreArr[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i ; j++) {
				if(scoreArr[i] == scoreArr[j]) {
//						System.out.println(scoreArr[i] + " "+ scoreArr[j]);
					scoreArr[i] = (int)(Math.random() * 45 + 1);
					j = 0;
				}
			}
		}
		for(int i = 0 ; i < scoreArr.length ; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		
		for(int i = 0 ; i < scoreArr.length ; i++) {
			scoreArr[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i ; j++) {
				if(scoreArr[i] == scoreArr[j]) {
					i--;
				}
			}
		}
		for(int i = 0 ; i < scoreArr.length ; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		
		for(int i = 0 ; i < scoreArr.length ; i++) {
			scoreArr[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i ; j++) {
				while(scoreArr[i] == scoreArr[j]) {
//					System.out.println(scoreArr[i] + " "+ scoreArr[j]);
					scoreArr[i] = (int)(Math.random() * 45 + 1);
					j = 0;
				}
			}
		}
		for(int i = 0 ; i < scoreArr.length ; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		
		
		// 서로 다른 숫자 7개가 배열에 할당될 때 까지 반복
		int[] lottoNums = new int[7];
		
		int count = 0; // 배열에 채워진 숫자의 개수.
		boolean existsNumber = false; // 새롭게 만든 숫자가 배열내에 존재하는지 여부.
		int randomNumber = 0; // 새롭게 만들 숫자 1 ~ 45중 하나.
		
		while (count < 7) { // 배열에 숫자가 7개가 채워질 때까지 반복.
			randomNumber = (int) (Math.random() * 45 + 1);
			existsNumber = false;
			
			// 새롭게 만든 숫자가 배열에 존재하는지 확인.
			for (int i = 0; i < count; i++) {
				if (lottoNums[i] == randomNumber) {
					existsNumber = true;
					break;
				}
			}
			
			// 새롭게 만든 숫자가 배열에 없다면, 배열에 추가한다.
			if (!existsNumber) { 
				lottoNums[count] = randomNumber;
				count++; // 배열에 채운 숫자 하나 증가.
			}
		}
		
		for (int i = 0; i < lottoNums.length; i++) {
			System.out.print(lottoNums[i] + " ");
		}
		System.out.println("");
		
		
		
	}
}