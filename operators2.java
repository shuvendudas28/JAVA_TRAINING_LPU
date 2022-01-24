package session2;

public class operators2 {

	public static void main(String[] args) {
		// bitwise operator
		// & , | , ^
		
		/*int a = 7;
		int b = 57;
		
		int result1= a & b; // prints a
		int result2= a | b; // prints b
		int result3= a ^ b; // prints a-b
		
		System.out.println("result 1 is "+result1);
		System.out.println("result 2 is "+result2);
		System.out.println("result 3 is "+result3);
		
		
		
		
		
		
		// shift operators
		// >> , << , >>>
		
		int x=-11;
		int y=2;
		int z=x>>y;   // x/2powery  ---- 8/2^3= 8/8=1
     
		System.out.println(z);
		
		z= x<<y;     // x * 2powery  ---- 8*2^3=8*8=64 
		System.out.println(z);*/
		
		// ternary operators-
		
		String name = "tony stark";
		int eWallet = 300;
		int cabfare = 500;
		
		/*String message = (eWallet >= cabfare) ? "cab booked" : "recharge your wallet";
			System.out.println("message is "+message);
			System.out.println("amount left "+(eWallet-cabfare));*/
		if(eWallet>=cabfare) {
			System.out.println("cab booked");
			System.out.println("rem balance is "+(eWallet-cabfare));
		}
		else {
			System.out.println("rechare your wallet");
		}
		
		
	}

}
