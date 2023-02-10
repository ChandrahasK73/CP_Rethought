import java.util.Queue;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

class TNode {
    int data;
    TNode left;
    TNode right;

    TNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BSTImplementation {
    public static TNode insert(TNode root, int data) {
        if (root == null)
            return new TNode(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }

    public TNode delete(TNode root, int data) {
        if (root == null)
            return root;
        if (data < root.data)
            root.left = delete(root.left, data);
        else if (data > root.data)
            root.right = delete(root.right, data);
        else {
            if (root.right == null)
                return root.left;
            else if (root.left == null)
                return root.right;
            else {
                int minVal = getMinValue(root.right);
                root.data = minVal;
                root.right = delete(root.right, minVal);
            }
        }
        return root;
    }

    public static boolean search(TNode root, int data) {
        if (root == null)
            return false;
        if (data == root.data)
            return true;
        else if (data < root.data)
            return search(root.left, data);
        else
            return search(root.right, data);
    }

    public static int getMinValue(TNode root) {
        if (root == null)
            return -1;
        if (root.left == null)
            return root.data;
        else
            return getMinValue(root.left);
    }

    public static void preOrderTraversal(TNode root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(TNode root) {
        if (root == null)
            return;
        inOrderTraversal(root.left);
        System.out.print(root.data + " ");
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TNode root) {
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrderTraversal(TNode root) {
        if (root == null)
            return;
        Queue<TNode> queue = new LinkedList<TNode>();
        queue.add(root);
        while (queue.size() != 0) {
            TNode node = queue.poll();
            System.out.print(node.data + " ");
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
    }

    public static void leftView(TNode root) {
        if (root == null)
            return;

        Queue<TNode> queue = new LinkedList<TNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int i = 0;
            int size = queue.size();
            while (i < size) {
                i++;
                TNode node = queue.poll();
                if (i == 1)
                    System.out.print(node.data + " ");
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
        }
    }

    public static void rightView(TNode root) {
        if (root == null)
            return;

        Queue<TNode> queue = new LinkedList<TNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int i = 0;
            int size = queue.size();
            while (i < size) {
                i++;
                TNode node = queue.poll();
                if (i == 1)
                    System.out.print(node.data + " ");
                if (node.right != null)
                    queue.add(node.right);
                if (node.left != null)
                    queue.add(node.left);
            }
        }
    }
}

class MainMethod {
    public static void main(String args[]) throws java.io.IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        TNode root = null;
        while (st.hasMoreTokens()) {
            root = BSTImplementation.insert(root, Integer.parseInt(st.nextToken()));
        }
        BSTImplementation.inOrderTraversal(root);
        System.out.println(" -> Inorder");
        BSTImplementation.preOrderTraversal(root);
        System.out.println(" -> PreOrder");
        BSTImplementation.postOrderTraversal(root);
        System.out.println(" -> Postorder");
        BSTImplementation.levelOrderTraversal(root);
        System.out.println(" -> levelOrder");
        BSTImplementation.leftView(root);
        System.out.println(" -> LeftView");
        BSTImplementation.rightView(root);
        System.out.println(" -> RightView");
        System.out.println(BSTImplementation.getMinValue(root) + " -> MinValue");
    }
}
