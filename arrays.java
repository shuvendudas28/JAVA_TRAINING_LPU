package session2;

public class arrays {

	public static void main(String[] args) {
		
		// 1D arrays -> we can store multiples values in one container
		
		//IMPLICIT SYNTAXES -> here new int[] is take care by compiler->
		//Syntax 1
		int array1[] = {10,20,30,40,50};
		
		//Syntax 2
		int[] array2 = {10,20,30,40,50};
		
		//EXPLICIT SYNTAXES ->
		//Syntax 3
		int array3[] = new int[]{10,20,30,40,50};
		
		//syntax 4
		int[] array4 = new int[]{10,20,30,40,50};
		
		//WHEN WE DONT KNOW ELEMENTS OF ARRAY->
		//we initializw the array with size, so elements in array are all 0
		//Syntax 5
		int array5[] = new int[5];
		
		//Syntax 6
		int[] array6 = new int[5];
		
		System.out.println("array1 is "+array1);
		System.out.println("array2 is "+array2);
		System.out.println("array3 is "+array3);
		System.out.println("array4 is "+array4);
		System.out.println("array5 is "+array5);
		System.out.println("array6 is "+array6);
		
		int a1[],a2;
		a1 = new int[5]; //a1 can refer an array
		a2 = 256;       // a2 is a primitive integer
		
		int[] a3,a4;
		a3 = new int[5];
		a4 = new int[10];
		

	}

}
