package pattern2;

public class Assignment5 {
	public static void main(String[] args) {
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0
			       || j==0
			       || i==n-1
			       || i==1 && j<(n/2)-1
			       || i==2 && j<(n/2)-2
			       || i==3 && j<(n/2)-3
			       || i==4 && j<(n/2)-4
			       || i==5 && j<(n/2)-5
			       || i==7 && j<(n/4)-1
			       || i==8 && j<(n/4)
			       || i==9 && j<(n/4)+1
			       || i==10 && j<(n/4)+2
			       || i==11 && j<(n/4)+3
			       || i==12 && j<(n/4)+4)
                   
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
