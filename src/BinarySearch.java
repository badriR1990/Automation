
public class BinarySearch
{
	static int start,end,mid;
	public static void binarySearch(int toFind,int[] arr)
	{
		start = 0;
		end = arr.length-1;
		mid = (start+end)/2;
		while(start<=end)
		{
			if(arr[mid] == toFind)
			{
				System.out.println("Element found at the position : "+arr[mid]);
				//break;
			}
			else if(toFind<arr[mid])
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
			mid = (start+end)/2;
		}
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int toFind = 9;
		binarySearch(toFind,arr);
		
	}

}
