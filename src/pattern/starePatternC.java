package pattern;

public class starePatternC {
	public static void main(String[]arg) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
		          {
				System.out.print(i);
		          }
			
		System.out.println();
		}
		 for(int i=1;i<=n;i++) {
             for(int j=4;j>=i;j--)
             {
            	 System.out.print(j );
             }
             System.out.println();
		 }
		
	}

}
