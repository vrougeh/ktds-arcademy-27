package exam;

public class Q10807 {

	public static void main(String[] args) {
		
		int arrnum = 11;
		int[] arr = new int[arrnum];
		
		int findnum = 2;
		
		int count = 0;
		
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int) (Math.random()*10);
		}
		
		for (int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == findnum) {
				count++;
			}
		}
		
		System.out.println(count);
		
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
