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
	static Node last=null;
	public static void flatten(Node root)
	{
		if(root==null) return;
		Node left=root.left;
		Node right=root.right;
		if(root!=last)
		{
			(last).right=root;
			(last).left=null;
			last=root;
		}
		flatten(left);
		flatten(right);
		if(left==null && right==null) last=root;
	}
	public void inOrder(Node root)
	{
		if(root==null)return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	public void insert(int data)
	{
		this.root=insert(root,data);
	}
	public void flatten()
	{Tree.flatten(root);}
	public void inOrder()
	{inOrder(root);}
	public void inOrder1()
	{
		last=root;
		inOrder(root);
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
		System.out.println("Inorder before flattening ");
		tree.inOrder();
		System.out.println();
		tree.flatten();
		System.out.println("Inorder after flattening ");
		tree.inOrder1();
	}
}