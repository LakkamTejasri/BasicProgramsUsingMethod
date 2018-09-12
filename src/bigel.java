
public class bigel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=bigN(6,3,4);
		

	}
	public static int bigN (int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>c && b>a)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
		return a;
}
}