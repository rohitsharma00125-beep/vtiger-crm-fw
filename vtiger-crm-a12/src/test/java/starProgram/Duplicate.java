package starProgram;

public class Duplicate 
{
	
	    public static void main(String[] args) 
	    {

	        int[] a = {1, 2, 3, 2, 1};
	        int n = a.length;

	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] == a[j]) 
	                {
	                    a[j] = a[n - 1];
	                    n--;
	                    j--;
	                }
	            }
	        }

	        for (int k = 0; k < n; k++) 
	        {
	            System.out.print(a[k] + " ");
	        }
	    }
}
	


