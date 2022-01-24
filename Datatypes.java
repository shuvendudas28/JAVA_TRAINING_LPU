package session2; 

import java.util.*;

public class Datatypes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("adult");
		}
		
		else {
			System.out.println("not adult");
		}

	}

}
