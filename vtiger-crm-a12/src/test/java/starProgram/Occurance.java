package starProgram;

public class Occurance 
{

	public static void main(String[] args) 
	{
		
		int a[] = {1,2,2,3,3,3,4,4,4,4};
		 int n = a.length;
		for(int i =0; i<n;i++)
		{
			int x = a[i];
			int count =0;
			if(x==-1)continue;
			for(int j=0;j<n;j++)
			{
				if(a[j]==x)
				{
				count++;
				a[j]=-1;
				}
			}
		System.out.println("freq of " +x+ " is "+count);
		
		}
		
	}

}
