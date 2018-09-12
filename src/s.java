import java.util.*;
 class s 
 {
	public static void main(String[] args)
	{
	  int temp;
	  int[] a={1,4,2,5,3,8};
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					//System.out.println(a[j]);
				}
			}	
		}	
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j]);
				
}
	}
 }
