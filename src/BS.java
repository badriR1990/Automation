
public class BS 
{
	static int toFind;
	static boolean flag = false;
	static int start,end,mid;
	
	public static void linearSearch(int[] arr,int toFind)
	{
		for(int element : arr)
		{
			if(toFind == element)
			{
				flag = true;
			}
		}
		if(flag)
		{
			System.out.println("Linear Search : Element Found");
		}
	}
	
	public static void binarySearch(int[] arr, int toFind)
	{
		start = 0;
		end = arr.length-1;
		mid = (start+end)/2;
		
		while(start<=end)
		{
			if(toFind == arr[mid])
			{
				System.out.println("Element Found");
				break;
			}
			else if(toFind < arr[mid])
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			mid = (start + end)/2;
			
			if(start>end)
			{
				System.out.println("Element not Found");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		toFind = 10;
		linearSearch(arr, toFind);
		binarySearch(arr, toFind);
	}

}
