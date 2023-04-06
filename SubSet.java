
public class SubSet {

		  static boolean isSubset(int arr1[], int arr2[], int m,int n)
		  		{
			  		int i = 0;
			  		int j = 0;
			  		for (i = 0; i < n; i++) {
			  			for (j = 0; j < m; j++)
			  				if (arr2[i] == arr1[j])
			  					break;
			  				if (j == m)
			  					return false;
			  			}
			  		return true;
		  		}
		  public static void main(String args[])
		  		{
			  // TODO Auto-generated method stub
			  			int arr1[] = { 11,9,6,8,7,3,2,5,4};
			  			int arr2[] = { 11, 4, 6, 3,5 };

			  			int m = arr1.length;
			  			int n = arr2.length;

			  			if (isSubset(arr1, arr2, m, n))
			  			{
			  				System.out.print("arr2[] is "+ "subset of arr1[] ");
			  			}
			  			else
			  			{
			  				System.out.print("arr2[] is "+ "not a subset of arr1[]");
			  			}
}
}


