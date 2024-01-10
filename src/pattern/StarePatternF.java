package pattern;

public class StarePatternF {

	public static void main(String []arg) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		} 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=3  ;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
	}
