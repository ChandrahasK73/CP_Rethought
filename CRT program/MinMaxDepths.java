import java.util.*;
class Node
{
	int data;
	Node left;
	Node right;
	Node(int data)
	{
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class Tree
{
	Node root;
	Tree()
	{this.root=null;}
	public Node insert(Node root,int data)
	{
		if(root==null) return new Node(data);
		else if(root.left==null) root.left=insert(root.left,data);
		else root.right=insert(root.right,data);
		return root;
	}
	public int minDepth(Node root)
	{
		if(root==null) return 0;
		if(root.left==null) return minDepth(root.right)+1;
		if(root.right==null) return minDepth(root.left)+1;
		if(root.left!=null && root.right!=null) return Math.min(minDepth(root.left),minDepth(root.right))+1;
		return 0;
	}
	public int maxDepth(Node root)
	{
		if(root==null) return 0;
		if(root.left==null) return maxDepth(root.right)+1;
		if(root.right==null) return maxDepth(root.left)+1;
		if(root.left!=null && root.right!=null) return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
		return 0;
	}
	public int minDepth()
	{
		return minDepth(root);
	}
	public int maxDepth()
	{
		return maxDepth(root);
	}
	public void insert(int data)
	{
		this.root=insert(root,data);
	}
}
class Main
{
	public static void main(String args[])
	{
		Tree tree=new Tree();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		tree.insert(s.nextInt());
		tree.insert(s.nextInt());
		s.next();
		for(int i=1;i<n;i++)
		{
			s.nextInt();
			tree.insert(s.nextInt());
			s.next();
		}
		System.out.println("Minimum Depth of a tree is "+tree.minDepth());
		System.out.println("Maximum Depth of a tree is "+tree.maxDepth());
	}
}