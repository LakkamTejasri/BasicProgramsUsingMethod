
public class sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={10,29,3,2};
		sortedA(a);
	
	}
	public static void sortedA(int[] a)
	{
		//int temp;
		for(int i=0;i<a.length;i++)
		{
			int temp;
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
				System.out.println(a[j]);
				
}
		
}
}

	

