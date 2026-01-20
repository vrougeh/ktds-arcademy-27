package java_exam;

public class MethodExam {

	public static void main(String[] args) {
		
		printName("a");
		printName("b");
		printName("c");
		printName("d");
		printName("sas");
		
		System.out.println(computeAdd(1,2));
		
	}
	
	public static int ex() {
		return 0;
	}
	
	public static void printName(String name) {
		System.out.println("my name is " + name);
		if(name.length() < 3) {
			return;
		}
		System.out.println("my name's length is " + name.length());
	}
	
	public static int computeAdd(int a, int b) {
		return a+b;
	}

}
