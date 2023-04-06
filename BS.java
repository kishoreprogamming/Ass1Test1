import java.util.Scanner;
public class BS {
public static void main(String[] args) 
         {
	       int [] a= {100,200,250,450,550,650,700,750,800};
	       Scanner scan =new Scanner(System.in);
	       System.out.println("Enter the key value for search");
	       int key=scan.nextInt();
	       int low=0;
	       int high=a.length-1;
	       while(low<=high)
	       {
	    	int mid=(low+high)/2;
	    	if(key==a[mid])
	    	{
	    		System.out.println("key "+key+"index of vlaue"+mid);
	    		break;
	    	}
	    	else if(key<a[mid])
	    	{
	          high=mid-1;	
	    	}
	    	else if(key>a[mid])
	    	{
	    	  low=mid+1;
	    	}
	       }
	       if(low>high)
	       {
	    	   System.out.println("key is not found");
	       }
	       
	       
         }
}
