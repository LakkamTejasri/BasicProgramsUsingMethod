import java.util.*;


public class merge1 {

	/**
	 * @param args
	 * 
	 */
	public static int mergeA(int[] a,int[] b)
	{
	//	char[] c=new char[a.length+b.length];
		int[] c = new int[a.length+b.length];
		{
		 int i;
		  for( i=0; i<a.length; i++)
		  {
		     c[i] = a[i];
		  }
		  int k=0;
		   for(int j=0; j<b.length; j++)
		    {
		       c[i]=b[j];
		       k++;
		     }
		    return k;
		       
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] c=new int[a.length+b.length];
		int[] a={1,2,4};
		int[] b={2,3,4};
		int[] c=new int[a.length+b.length];
		for(int i=0;i<c.length;i++)
		System.out.println(c[i]);
	
		
		

	}

}
