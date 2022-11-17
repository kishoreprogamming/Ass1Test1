package pattern2;

public class Assignment3 {

	public static void main(String[] args) {
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0
				   || j==0
				   || i==n-1
				   || j==n-1
				   || (i==(n/4)-2 && j<(n/2)-1)
				   || (i==(n/4)-2 && j>=n/2)
				   || (i==(n/4)-1&& j<(n/2)-i)
				   || i==(n/4)-1 && j>n/2 && j<n-1
				   || (i==n/4&& j<(n/2)-i)
				   || i==n/4 && j-1>n/2 && j<n-1
				   || (i==(n/4)+1 && j<(n/2)-i)
				   || i==(n/4)+1 && j-2>n/2 && j<n-1
				   || (i==(n/4)+2 && j<(n/2)-i)
				   || i==(n/4)+2 && j-3>n/2 && j<n-1
				   ||  i==(n/4)+3 && j-4>n/2 && j<n-1)
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
