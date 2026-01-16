package java_exam;

public class TypeCasting {

	public static void main(String[] args) {
		
		//84p
		int num = 10;
		float fnum = num;
		double dnum = num;
		
		System.out.println(num);
		System.out.println(fnum);
		System.out.println(dnum);
		
		
		//85p
		fnum = 10.0f;
		num = (int)fnum;
		System.out.println(fnum);
		System.out.println(num);
		
		dnum = 11.15;
		num = (int)dnum;
		System.out.println(num);
		System.out.println(num);
		
		
		//86p
		dnum = 10.1;
		dnum = Math.ceil(dnum);
		System.out.println(dnum);	
		
		dnum = 10.9;
		dnum = Math.floor(dnum);
		System.out.println(dnum);	
		
		dnum = 15.18;
		dnum = Math.round(dnum);
		System.out.println(dnum);	
		
		dnum = 10.56;
		dnum = Math.round(dnum);
		System.out.println(dnum);
		
		
		//87p
		dnum = 29.37;
		double dnum2 = dnum*10;
		System.out.println(dnum2);
		
		dnum2 = Math.round(dnum2);
		System.out.println(dnum2);
		
		double dnum3 = dnum2 / 10;
		System.out.println(dnum3);
		

	}

}
