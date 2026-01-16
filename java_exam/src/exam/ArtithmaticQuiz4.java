package exam;

public class ArtithmaticQuiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subjectA = 100;
		int subjectB = 80;
		int subjectC = 95;
		int subjectD = 68;
		
		int totalScore = subjectA+ subjectB + subjectC + subjectD;
		double average = (double)totalScore / 4;
		double score = (average - 55) / 10;
		
		System.out.println("점수 총합 : " + totalScore);
		System.out.println("점수 평균 : " + average);
		System.out.println("학점 결과 : " + score);

	}

}
