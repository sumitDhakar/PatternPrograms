package pattern;

public class StarPatternB {

	
	public  static void main(String[]arg) {

		int n=5;
		for(int i=1; i<=n;i++)
		{
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}
