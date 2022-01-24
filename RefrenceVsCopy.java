package session2;

public class RefrenceVsCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=a; //value copy
		
		
		int[] a1= {10,20,30,40,50};
		int[] a2=a1;//refrence copy
		
		System.out.println("a is"+a);
		System.out.println("b is"+b);
		
		System.out.println("a1 is"+a1);
		System.out.println("a2 is"+a2);
		
		//update
		b=20;
		a2[2]=77;
		
		System.out.println("b is now "+b);
		System.out.println("a2[2] is"+a2[2]);
		System.out.println("a1[2] is"+a1[2]);
	}

}
