package pattern;

public class StarePatternE {
	public static void main(String[] args) {
	int 	n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=4;k>=i;k--) {
				System.out.print(k*i);
			}

			System.out.println();
}
	}
}
