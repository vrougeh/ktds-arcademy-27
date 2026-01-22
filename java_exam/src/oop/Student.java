package oop;

public class Student {
	int java;
	int python;
	int cpp;
	int csharp;
	
	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}
	
	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}

	public double getAverage() {
		return (getSumAllScores()/(double)4);
	}
	
	public double getCourseCredit() {
		return ((getAverage() - 55) / (double) 10);
	}
	
	public String getABCDF() {
		if(getAverage() >= 4.1 && getAverage() < 4.5) {
			return "A+";
		}else if(getAverage() >= 3.6){
			return "A";
		}else if(getAverage() >= 3.1){
			return "B+";
		}else if(getAverage() >= 2.6){
			return "B";
		}else if(getAverage() >= 1.6){
			return "C";
		}else if(getAverage() >= 0.6){
			return "D";
		}else if(getAverage() >= 0.1){
			return "F";
		}else {
			return "error";
		}
	}
}
