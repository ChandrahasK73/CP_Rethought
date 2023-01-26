import java.util.*;
class Node<T> {

	T data;
	Node<T> left;
	Node<T> right;
	
	public Node(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
class Solution
{
	public static int oddEvenLevel(Node root)
	{
		if(root==null) return 0;
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		int level=0;
		int evenSum=0,oddSum=0;
		while(q.size()!=0)
		{
			int size=q.size();
			level++;
			while(size>0)
			{
				Node temp=q.remove();
				if(level%2==0) evenSum+=(Integer)temp.data;
				else oddSum+= (Integer)temp.data;
				if(temp.left!=null) q.add(temp.left);
				if(temp.right!=null) q.add(temp.right);
				size--;
			}
		}
		return (oddSum-evenSum);
	}

	public static Node<Integer> createTree() {
		Node<Integer> root = null;
		Scanner in = new Scanner(System.in);
		Map<Integer, Node<Integer>> map = new HashMap<Integer, Node<Integer>>();
		int n = in.nextInt();
		
		for(int i=0; i<n; i++) {
			int parent = in.nextInt();
			int child = in.nextInt();
			String pos = in.next();
			
			if(i==0) {
				root = new Node<Integer>(parent);
				map.put(parent, root);
			}
			
			Node<Integer> parentNode = map.get(parent);
			Node<Integer> childNode = new Node<Integer>(child);
			if(pos.equals("L")) parentNode.left = childNode;
			else if(pos.equals("R")) parentNode.right = childNode;
			
			map.put(child, childNode);
			
		}
		in.close();
		return root;
	}
	public static void main(String args[])
	{
		System.out.println(Solution.oddEvenLevel(Solution.createTree()));
	}
}