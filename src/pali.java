
public class pali {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pali(100,200);
	}
	
	public static void pali(int s,int e)
	{
		int temp=0,n,a;
		for(int i=s;i<=e;i++)
		{
			n=i;
			temp=0;
			while(n!=0)
			{
				a=n%10;
				temp=temp*10+a;
				n=n/10;
			}
			if(i==temp)
			{
				System.out.println(i);
			}

		}
		//System.out.println("jhbj");
	}
}
