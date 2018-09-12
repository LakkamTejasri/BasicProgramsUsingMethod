
public class vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
	char[] v={'h','e','l','l','o'};
	
    int r=vowel(v);
    System.out.print(r);
	}
	public static int vowel(char[] v)
	{
	int c=0;
    for(int i=0;i<v.length;i++)
    {
	if(v[i]=='a'||v[i]=='e'||v[i]=='i'||v[i]=='o'||v[i]=='u')
	{
		c++;
	}

}
    return c;
}
}
