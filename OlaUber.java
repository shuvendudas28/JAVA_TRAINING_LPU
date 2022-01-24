package assignments;

import java.util.*;

public class OlaUber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mode of payment");
		int mode = sc.nextInt();
		 
		
		int CASH = 101;
		int eWallet = 201;
		int cabFare = 300;
		
		if(mode==eWallet) {
			
			System.out.println("balance in wallet");
			int balance = sc.nextInt();
			
			if(balance>=cabFare) {
				System.out.println("cab is booked");
				System.out.println("remaining balance "+(balance-cabFare));
				System.out.println("Your Ride will be arriving soon:)");
			}
			else System.out.println("insuffisient balance, please pay via CASH");
		}
		else if (mode==CASH) {
			System.out.println("cab is booked");
			System.out.println("Please pay "+cabFare+" after your ride is complete");
		    System.out.println("Your Ride will be arriving soon:)");
		}
		else {
			System.out.println("Please select either CASH or eWallet for mode of payment");
		}

	}

}
