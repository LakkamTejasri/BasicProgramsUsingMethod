import java.util.*;
 class Pattern3
 {
	 public static void main(String[] args)
	 {
		
	 int k=1,c=4;
	  for(int i=1;i<=5;i++)
	  {
		for(int j=i;j>=k;j--)
		{
			System.out.print(k);
			//k=k+c;
		//	c--;
		}
		System.out.println();
		k++;
	
		//c--;
	}
	 }
}
