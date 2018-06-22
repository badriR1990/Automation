import java.util.ArrayList;

public class CharCount
{
	public static boolean flag = false;
	//declaring ArrayList with initial size n
    public static ArrayList<Character> arrli = new ArrayList<Character>();
	
	public static boolean check(ArrayList<Character> arrli,int value)
	{
		flag = false;
		for(char element : arrli)
		{
			if(element == value)
			{
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str = "Selenium";
		/*int count = 0;
		for(int i=0;i<str.length();i++)
		{
			boolean val = check(arrli,str.charAt(i));
			if(val==false)
			{
				count = 1;
				for(int j=i+1;j<str.length();j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						count = count + 1;
					}
				}
				System.out.println(str.charAt(i)+" Count is "+count);
				arrli.add(str.charAt(i));
			}
		}*/
		//String[] arr = str.split("i");
		//System.out.println(arr.length);
		
		for(int i=0;i<str.length();i++)
		{
			/*str.split
			String[] arr = str.split(str.charAt(i));
			System.out.println("The count of "+str.charAt(i)+" is "+arr.length);*/
		}
	}

}
