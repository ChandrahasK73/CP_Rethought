import java.util.*;
class BubbleSort
{
	public static void bubbleSort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{	boolean isSwapped=false;
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					isSwapped=true;
				}
			}
			if(!isSwapped)
				break;
		}
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}
}
class SelectionSort
{
	public static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int minIndex=i;
			for(int j=i;j<a.length;j++)
			{
				if(a[j]<a[minIndex]) minIndex=j;
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}
}
class InsertionSort
{
	public static void insertionSort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j]=a[j+1];
				j=j-1;
			}
			a[j+1]=key;
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class MainMethod
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		BubbleSort.bubbleSort(a);
		SelectionSort.selectionSort(a);
		InsertionSort.insertionSort(a);
	}
}