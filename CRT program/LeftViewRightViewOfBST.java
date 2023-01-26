import java.util.*;
class Node1
{
	int data;
	Node1 right;
	Node1 left;
	Node1(int data)
	{
		this.data=data;
		this.right=null;
		this.left=null;
	}
}
class BinarySearchTree
{
	static int max_level=0;
	public Node1 insert(Node1 root,int data)
	{
		if(root==null) return new Node1(data);
		else if(data<root.data ) root.left= insert(root.left,data);
		else if(data>root.data ) root.right=insert(root.right,data);
		else return null;
		return root;
	}
	public void leftView(Node1 root,int level)
	{
		if(root==null) return;
		if(level>max_level)
		{
			System.out.print(root.data+" ");
			max_level=level;
		}
		leftView(root.left,level+1);
		leftView(root.right,level+1);
	}
	public void rightView(Node1 root,int level)
	{
		if(root==null) return;
		if(level>max_level)
		{
			System.out.print(root.data+" ");
			max_level=level;
		}
		rightView(root.right,level+1);
		rightView(root.left,level+1);
	}
	public void inOrder(Node1 root)
	{
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
}
class MainMethod
{
	public static void main(String args[])
	{
		Node1 root=null;
		Scanner s=new Scanner(System.in);
		BinarySearchTree bst=new BinarySearchTree();
		int n=s.nextInt();
		for(int i=0;i<n;i++) root=bst.insert(root,s.nextInt());
		bst.inOrder(root);System.out.println();
		System.out.println("Left view of a binary search tree is : ");
		bst.leftView(root,1);System.out.println();BinarySearchTree.max_level=0;
		System.out.println("RIght View of a ninary search tree is : ");
		bst.rightView(root,1);System.out.println();
	}
}