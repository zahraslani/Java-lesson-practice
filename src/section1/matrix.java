package section1;

public class matrix {

	public static void main(String[] args) {
		int n = 5;
		printmatrix(n);

	}
	public static void printmatrix(int n) 
	{
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			System.out.print((int)( Math.random()*2));	
			}
			System.out.println();
		}
	}
}
