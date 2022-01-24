package session2;

public class whyArrays {

	public static void main(String[] args) {
		
		// Covid data in single value container for USA
		int usaTotalCases = 6548824;
		int usaNewCases = 554266;
		int recovered = 24658;
		
		// Covid data in single value container for INDIAA
		int inTotalCases = 5124866;
		int inaNewCases = 77266;
		int inrecovered = 35468;
		
		//need of array
		//whenever we have a lot of data in homogeneous profile
		
		int[] UsaCases= {6548824,554266,24658};
		int[] InCases= {5124866,77266,35468};
		
		System.out.println("UsaCases is "+UsaCases);
		System.out.println("indiaCases is "+InCases);
		
		//update the value in array->
		InCases[1]=56457; //will update data in index 1
		
		System.out.println();
		
		//read array data
		System.out.println("USA CASES");
		for(int idx=0;idx<UsaCases.length;idx++) {
			System.out.println(UsaCases[idx]+" ");	
		}
		
		System.out.println();
		
		System.out.println("INDIA CASES");
		for(int idx=0;idx<InCases.length;idx++) {
			System.out.println(InCases[idx]+" ");
		}
		
		

	}

}
