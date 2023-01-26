import java.util.*;
class MergeSort
{
	public static void merge(int[] a,int l,int m,int r)
	{
		int leftsize=m-l+1;
		int rightsize=r-m;
		
		int[] left=new int[leftsize];
		int[] right=new int[rightsize];
		
		for(int i=0;i<leftsize;i++)
			left[i]=a[l+i];
		for(int i=0;i<rightsize;i++)
			right[i]=a[m+1+i];

		int i=0;int j=0;int k=l;

		while(i<leftsize && j<rightsize)
		{
			if(left[i]<=right[j])
			{
				a[k++]=left[i++];
			}
			else
			{
				a[k++]=right[j++];
			}
		}
		while(i<leftsize)
		{
			a[k++]=left[i++];
		}
		while(j<rightsize)
		{
			a[k++]=right[j++];
		}
	}
	public static void mergeSort(int[] a,int l,int r)
	{
		int mid=(l+r)/2;
		if(l<r)
		{
			mergeSort(a,l,mid);
			mergeSort(a,mid+1,r);
			merge(a,l,mid,r);
		}
	}
	public static void printArray(int[] a)
	{
		for(int i:a)
			System.out.print(i+" ");
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
		System.out.println("Array before merging is : ");
		MergeSort.printArray(a);
		
		MergeSort.mergeSort(a,0,a.length-1);
		System.out.println("Array before merging is : ");
		MergeSort.printArray(a);
	}
}