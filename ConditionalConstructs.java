package session2;

import java.util.*;

public class ConditionalConstructs {

	public static void main(String[] args) {
		// reads data from Scanner
		Scanner sc = new Scanner(System.in);  // scanner onject construction
		
		System.out.println("enter the amount: ");
		double amount = sc.nextDouble(); //to read double
		
		System.out.println("enter promo code: ");
		int code = sc.nextInt(); //to read int
		
		sc.close(); // to release memory resourses
		
		System.out.println("amount is:"+amount);
		System.out.println("promoCode is: "+code);
		
		// IF ELSE :-
		
		int  JUMBO =101;    //flat 50% off for item worth 200 or more
		int ZOMHELLO =201;  //flat 60% off for items worth 159 or more upto 120
		
		/*if(amount>=159) {
			System.out.println("promocade available");
		}
		else {
			System.out.println("promocode not available");
		}*/
		
		double discount=0;
		 
		/*if(code==JUMBO && amount>=200) {
			System.out.println("promocode is applied");
			discount = 0.5*amount;
			System.out.println("discount is "+discount);
			System.out.println("new amount is "+(amount-discount));
		}
		else {
			System.out.println("invaild code or lesser amt");
			System.out.println("new amount is "+amount);
		}*/
		
		// NESTED IF/ELSE
		
		/*if(amount>=200) {
			
			if(code==JUMBO) {
				System.out.println("promocode JUMBO is applied");
				discount = 0.5*amount;
				System.out.println("discount is "+discount);
				System.out.println("new amount is "+(amount-discount));
			}
			else { System.out.println("invalid promocode try using JUMBO"); 
			}
			}
			
			else {
				System.out.println("invalid ammount, please add "+(200-amount)+" more to use promocode");
			}*/
		
		// LADDER IF/ELSE
		
		if(code==JUMBO) {
			
			if(amount>=200) {
				System.out.println("promocode JUMBO is applied");
				discount = 0.5*amount;
				System.out.println("discount is "+discount);
				System.out.println("new amount is "+(amount-discount));
			}
			else System.out.println("insufficient amount, add "+(200-amount)+" more to use JUMBO");
		}
		else if(code==ZOMHELLO) {
			
			if(amount>=159) {
				System.out.println("promocode ZOMHELLO is applied");
				discount=0.6*amount;
				 if(discount>=120) {
					 discount=120;
				 }
				 System.out.println("discount is "+discount);
				 System.out.println("new amount is "+(amount-discount));
			}
			else System.out.println("insufficient amount, add "+(159-amount)+" more to use ZOMHELLO");
		}
		else {
			System.out.println("invalid promocode");
			System.out.println("no discount is applied");
			System.out.println("new amount "+amount);
			
			if(amount>=159) System.out.println("try PromoCode ZOMHELLO");
			if(amount>=200) System.out.println("try promocode JUMBO");
			
		}
		}
		
		
		
	}


