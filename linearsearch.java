import java.util.Scanner;

public class linearsearch {
	public static void main(String[] args) {
	int[] a= {80,69,46,38,10,6,30,25};
	boolean flag=false;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the key to be search");
	int key=scan.nextInt();
	for(int i=0;i<a.length;i++)
	{
		if(key==a[i])
		{
			System.out.println("key "+key +" found the index "+i);
		    flag=true;
			break;
		}
	}
	if(flag==false)
	{
		System.out.println("key is not found");
	}
}
}


