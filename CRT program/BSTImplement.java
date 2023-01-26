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
	public Node1 insert(Node1 root,int data)
	{
		if(root==null) return new Node1(data);
		else if(data<root.data ) root.left= insert(root.left,data);
		else if(data>root.data ) root.right=insert(root.right,data);
		else return null;
		return root;
	}
	public void inOrder(Node1 root)
	{
		if(root==null) return;
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	Node1 findLCA(Node1 root,int n1,int n2)
	{
		if(root==null) return null;
		if(root.data==n1 || root.data==n2) return root;
		Node1 left_lca= findLCA(root.left,n1,n2);
		Node1 right_lca=findLCA(root.right,n1,n2);
		if(left_lca!=null && right_lca!=null) return root;
		return (left_lca!=null) ?  left_lca: right_lca;
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
		System.out.println(bst.findLCA(root,s.nextInt(),s.nextInt()).data);
	}
}