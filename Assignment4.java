package pattern2;

public class Assignment4 {

	public static void main(String[] args) {
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n-1
				   || i==(3*n)/4+2
				   || i==(3*n)/4+1 && j<(n/2)-1
				   || i==(3*n)/4+1 && j>(n/2)
				   || i==(3*n)/4 && j<(n/2)-2
				   || i==(3*n)/4 && j>(n/2)+1
				   || i==(3*n)/4-1 && j<(n/2)-3
				   || i==(3*n)/4-1 && j>(n/2)+2
			       || i==(n/2)+1 && j<(n/2)-4
			       || i==(n/2)+1 && j>(n/2)+3
			       || i==n/2 && j<(n/2)-5
			       || i==n/2 && j>(n/2)+4
			       || i==(n/2)-1 && j<(n/2)-6
			       || i==(n/2)-1 && j>(n/2)+5)
					{
					System.out.print("*");
					}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
