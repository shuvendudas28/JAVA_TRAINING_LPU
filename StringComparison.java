package session2;

public class StringComparison {
	
	public static void main(String[] args) {
	
		//interned string
		
		String S1 = "jonh";
		String S2 = "jonh";
		
		//string objects
		
		String S3 = new String("jonh");
		String S4 = new String("Jonh");
		
		if(S1==S2) {
			System.out.println("1. S1= S2");
		}
		else {System.out.println("1. S1 != S2");
	}

	if(S3==S4) {
		System.out.println("2. S3 = S4");
	}
	else {System.out.println("2. S3 != S4");
}
if(S2==S4) {
	System.out.println("3. S2 = S4");
}
else {System.out.println("3. S2 != S4");
}
	if(S3.equals(S4)) {
		System.out.println("4. S3 equals S4");
	}
	else {System.out.println("4. S3 not equals S4");
}
	if(S2.equals(S4)) {
		System.out.println("5. S3 equals S4");
	}
	else {System.out.println("5. S3 not equals S4");
}
	if(S3.compareTo(S4)==0) {
		System.out.println("6. S3 compare to S4");
	}
	else {System.out.println("6. S3 not compare to S4");
}
	if(S3.equalsIgnoreCase(S4)) {
		System.out.println("7.S3goreCaseequals S4");
	}
	else {System.out.println("4. S3 not equals S4");
}


	}
}
