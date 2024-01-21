class node1 {
    int key;
    node1 left, right;

    public node1(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySTree {
    node1 root;

    BinarySTree() {
        root = null;
    }

    void printInorder(node1 node) {
        if (node == null)
            return;

        printInorder(node.left);

        System.out.print(node.key + " ");

        printInorder(node.right);
    }

    void printInorder() {
        printInorder(root);
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    node1 insertRec(node1 root, int key) {
        if (root == null) {
            root = new node1(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }
}

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySTree tree = new BinarySTree();

        tree.insert(500);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.printInorder();
    }
}
