package assignments;

import java.util.*;

public class ternaryop {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);  
		
		System.out.println("enter the amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("enter promo code: ");
		int code = sc.nextInt(); 
		sc.close(); 
		
		System.out.println("amount is:"+amount);
		System.out.println("promoCode is: "+code);
		
		// IF ELSE :-
		
		int  JUMBO =101;    //flat 50% off for item worth 200 or more
		int ZOMHELLO =201;  //flat 60% off for items worth 159 or more upto 120
		
		double discount=0;
		
//        if(code==JUMBO) {
//			
//			if(amount>=200) {
//				System.out.println("promocode JUMBO is applied");
//				discount = 0.5*amount;
//				System.out.println("discount is "+discount);
//				System.out.println("new amount is "+(amount-discount));
//			}
//			else System.out.println("insufficient amount, add "+(200-amount)+" more to use JUMBO");
//		}
//		else if(code==ZOMHELLO) {
//			
//			if(amount>=159) {
//				System.out.println("promocode ZOMHELLO is applied");
//				discount=0.6*amount;
//				 if(discount>=120) {
//					 discount=120;
//				 }
//				 System.out.println("discount is "+discount);
//				 System.out.println("new amount is "+(amount-discount));
//			}
//			else System.out.println("insufficient amount, add "+(159-amount)+" more to use ZOMHELLO");
//		}
//		else {
//			System.out.println("invalid promocode");
//			System.out.println("no discount is applied, TRY JUMBO or ZOMHELLO");
//		}
//		
		// TERNATY OPERATION-
		
		 if(code==JUMBO) {
			 
			String message = (amount>=200) ? "promocode JUMBO is applied" : "insuffiecient amount. add "+(200-amount)+" more to use JUMBO";
			System.out.println(message);
			discount = 0.5*amount;
			System.out.println("discount is "+discount);
			System.out.println("new amount is "+(amount-discount));
		 }
		 else if(code==ZOMHELLO) {
			 
			 String message = (amount>=159) ? "promocode ZOMHELLO is applied" : "insuffiecient amount. add "+(159-amount)+" more to use ZOMHELLO";
			 System.out.println(message);
			 discount= 0.6*amount;
			 if(discount>=120) {
				 discount=120;
			 }
			 System.out.println("discount is "+discount);
			 System.out.println("new amount is "+(amount-discount));
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
