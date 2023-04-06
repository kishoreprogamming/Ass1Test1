
public class Duplicates {
	
	public static void main(String []args)
	{
		String arr[]= {"java","c","c++","python","java","python"};
		
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
			    if(arr[i]==arr[j])
			    {
			    	System.out.println("Duplicates String "+arr[i]);
			    }
			}
		}
	}

}
