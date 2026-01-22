package oop;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student(100,97,81,99);
		
		
		int sum = student.getSumAllScores();
		double average = student.getAverage();
		double courseCredit = student.getCourseCredit();
		String abcde = student.getABCDF();
		System.out.println("합계: " + sum); //377
		System.out.println("평균: " + average); // 94.25
		System.out.println("학점: " + courseCredit); // 3.92
		System.out.println("등급: " + abcde); // A


	}

}
