import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 left, right;

    Node2(int item) {

        data = item;
        left = right = null;
    }
}

public class CompleteBinaryTree {
    Node2 root;

    // Function to check the completeness of a binary tree
    boolean isCompleteBT(Node2 root) {
        if (root == null)
            return true;

        Queue<Node2> queue = new LinkedList<>();
        queue.add(root);

        boolean flag = false;

        while (!queue.isEmpty()) {
            Node2 tempNode = queue.remove();

            if (tempNode.left != null) {
                if (flag == true)
                    return false;
                queue.add(tempNode.left);
            } else
                flag = true;

            if (tempNode.right != null) {
                if (flag == true)
                    return false;
                queue.add(tempNode.right);
            } else
                flag = true;
        }
        return true;
    }
    public static void main(String[] args) {
        CompleteBinaryTree tree = new CompleteBinaryTree();
        tree.root = new Node2(1);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(3);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(5);
        tree.root.right.left = new Node2(6);
//        tree.root.right.left.right = new Node2(7);

        if (tree.isCompleteBT(tree.root))
            System.out.println("The binary tree is complete");
        else
            System.out.println("The binary tree is not complete");
    }
}
