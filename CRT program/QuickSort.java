import java.util.*;
class QuickSort
{
	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=(low-1);
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;

		return i+1;
	}

	public static void sort(int arr[],int low,int high)
	{
		if(low<high)
		{
			int pivotIndex=partition(arr,low,high);

			sort(arr,low,pivotIndex-1);
			sort(arr,pivotIndex+1,high);
		}
	}

	public static void printArray(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter "+n+" array elements");
		for(int i=0;i<n;i++) a[i]=s.nextInt();

		QuickSort.sort(a,0,n-1);

		System.out.println("Sorted Array is : ");
		printArray(a);
	}

}