package java_exam;

public class Variables1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (int long float double boolean)
		// 나이 계산기
		// 현재 연도 - 나의 생년
		System.out.println(2026-1998+1);
		{
			int nowYear = 2026;
			
			int myBirthYear = 1998;
			
			int myAge = nowYear - myBirthYear + 1 ;
			
			System.out.println(nowYear - myBirthYear + 1);
			System.out.println(myAge);
		}
		
		System.out.println("End");
		
		final long price = 1000; // 상수
		long buildingPrice = 10_000_000_000L; // L,l 없으면 에러나는 이유는 자바에서 정수는 int 이기 때문에 int의 값을 벗어나서 에러남
		
		
		float raito = 5.111F ; // f,F 없으면 에러나는이유는 자바에서 실수는 double이기 때문에 자료형이 맞이 않아 에러남
		
		double doubleRaito = 1.23456456789;
		
		// price = 10000;
		
		// int i = 1L; //묵시적 형변환 불가능 명시적 형변환 해야함
		
		int i = (int) 1L; // 명시적 형변환
		
		
		byte bNumber = (byte) (Byte.MAX_VALUE +1);
		
		
		
		System.out.println(Integer.MAX_VALUE); // 2147483647
	    int normalNumber = Integer.MAX_VALUE + 1; // -2147483648 정수 오버플로우
	    System.out.println(normalNumber); 

	    
	    
	    System.out.println(""+3+7); 
	    System.out.println(""+(3+7)); 
	    System.out.println(3+7);
	    System.out.println(3L+7.3f);
	    
	    System.out.println(10/3);
	    System.out.println(10/3f);
	    
	    
		
	}

}
