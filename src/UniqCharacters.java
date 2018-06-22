
public class UniqCharacters
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "selenium";
		String c;
		for(int i=0;i<str.length();i++)
		{
			c = str.substring(i, i+1);
			System.out.println(c);
			String[] arr = str.split(c);
			System.out.println(arr.length);
		}
	}

}
