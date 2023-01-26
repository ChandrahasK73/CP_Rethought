import java.util.*;
class Node
{
	String data;
	Node left;
	Node right;
	Node(String data)
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
	{
		this.root=null;
	}
	Node insertIntoTree(Node root,String data)
	{
		if(root==null) root=new Node(data);
		else if(root.left==null)
			root.left=insertIntoTree(root.left,data);
		else
			root.right=insertIntoTree(root.right,data);
		return root;
	}
	public void isPalindrome(Node root)
	{
		if(root==null) return;
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		String str="";
		while(!queue.isEmpty())
		{
			Node node=queue.poll();
			str=str+node.data;
			if(node.left!=null)
				queue.add(node.left);
			if(node.right!=null)
				queue.add(node.right);
		}
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		if(str.equals(sb.toString()))
			System.out.println("Yes");
		else
			System.out.println("No");

	}
	public int countLeafNode(Node root)
	{
		if(root==null) return 0;
		if(root.left==null && root.right==null) return 1;
		else
			return countLeafNode(root.left)+countLeafNode(root.right);
	}
	public void insert(String data)
	{
		this.root=insertIntoTree(root,data);
	}
	public void levelOrder()
	{
		isPalindrome(root);
	}
	public void leafNode()
	{
		System.out.println(countLeafNode(root));
	}
	
}
class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Tree tree=new Tree();
		int n=s.nextInt();
		String r=s.next();
		tree.insert(r);
		tree.insert(s.next());
		String m=s.next();
		for(int i=1;i<n;i++)
		{
			String a=s.next();
			tree.insert(s.next());
			String c=s.next();
		}
		tree.levelOrder();
		tree.leafNode();
	}
}
