import java.util.*;
class TNode
{
	int data;
	TNode left;
	TNode right;
	TNode(int data)
	{
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
class TreeImplement
{	
	
	public TNode insert(TNode root,int data)
	{
		if(root==null) return new TNode(data);
		if(data<root.data) root.left= insert(root.left,data);
		else if(data>root.data) root.right=insert(root.right,data);
		return root;
	}
	
	public TNode delete(TNode root,int data)
	{
		if(root==null) return null;
		if(data<root.data) root.left=delete(root.left,data);
		else if(data>root.data) root.right=delete(root.right,data);
		else
		{
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			else
			{
				int minValue=getMinValue(root.right);
				root.data=minValue;
				root.right=delete(root.right,minValue);
			}
		}
		return root;
	}
	
	public int getMinValue(TNode root)
	{
		if(root==null) return -1;
		if(root.left==null) return root.data;
		else return getMinValue(root.left);
	}
	
	public void inOrder(TNode root)
	{
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public void levelOrder(TNode root)
	{
		if(root==null) return;
		Queue<TNode> queue=new LinkedList<TNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TNode node=queue.poll();
			System.out.print(node.data+" ");
			if(node.left!=null) queue.add(node.left);
			if(node.right!=null) queue.add(node.right);
		}
	}

	public void leftView(TNode root)
	{
		if(root==null) return;

		Queue<TNode> queue=new LinkedList<TNode>();
		queue.add(root);

		while(!queue.isEmpty())
		{
			int i=0;
			int size=queue.size();
			while(i<size)
			{
				i++;
				TNode node=queue.poll();
				if(i==1) System.out.print(node.data+" ");
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
			}
		}
	}

	public void rightView(TNode root)
	{
		if(root==null) return;

		Queue<TNode> queue=new LinkedList<TNode>();
		queue.add(root);

		while(!queue.isEmpty())
		{
			int i=0;
			int size=queue.size();
			while(i<size)
			{
				i++;
				TNode node=queue.poll();
				if(i==1) System.out.print(node.data+" ");
				if(node.right!=null) queue.add(node.right);
				if(node.left!=null) queue.add(node.left);
			}
		}
	}

	public boolean search(TNode root,int data)
	{
		if(root==null) return false;
		if(root.data==data) return true;
		else if(data<root.data) return search(root.left,data);
		else return search(root.right,data);
	}
}

class MainMethod
{
	public static void main(String args[])
	{
		TNode root=null;
		Scanner s=new Scanner(System.in);
		TreeImplement tree=new TreeImplement();
		int n=s.nextInt();
		for(int i=0;i<n;i++) root=tree.insert(root,s.nextInt());
		tree.inOrder(root); System.out.println();
		System.out.print("Enter an element to delete : ");
		root=tree.delete(root,s.nextInt());
		tree.inOrder(root); System.out.println();
		System.out.print("Enter an element to search : ");
		if(tree.search(root,s.nextInt())) System.out.println("Element found");
		else System.out.println("Element not found ");
		tree.levelOrder(root);System.out.println();
		tree.leftView(root);System.out.println();
		tree.rightView(root);System.out.println();
	}
}