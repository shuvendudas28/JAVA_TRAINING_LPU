package session2;

public class nestedLoops {

	public static void main(String[] args) {
		int sq = 1;
		for(int i=1;i<=8;i++) {
			if(i%2==0) {
				sq=0;
			}
			else sq=1;
			
			for(int j=1;j<=8;j++) {
				System.out.print(sq%2+ " ");	
				sq++;
			}
			System.out.println();
		}
	}

}
