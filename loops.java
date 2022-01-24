package session2;

public class loops {

	public static void main(String[] args) {
		
		char whiteSquare= '\u25A1';
		char blackSquare= '\u25A0';
		
		//int idx = 1;
		//while(idx<=4) {
			//System.out.print(whiteSquare+" ");
			//System.out.print(blackSquare+" ");
			//idx++;
		//}
		int x = 1;
		do {
			System.out.print(whiteSquare+" ");
			System.out.print(blackSquare+" ");
			x++;
		}
		while(x<=4);
		
		/*for(int x=1;x<=4;x++) {
			System.out.print(whiteSquare+" "+blackSquare+" ");
			//System.out.println(blackSquare+"");
		}*/
	}

}
