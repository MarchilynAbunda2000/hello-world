package MidtermDSA;

import java.util.*;

class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {

    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Insert a value into the binary tree
    public void insert(int data) {
        root = insertRec(root, data);
    }

    // Recursive helper method for insertion
    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Pre-order traversal to display data values
    public void displayData(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " "); // Display the data value
            displayData(node.left);
            displayData(node.right);
        }
    }
  // Post-order traversal to display data values
    public void displayDataPostOrder(TreeNode node) {
        if (node != null) {
            displayDataPostOrder(node.left);
            displayDataPostOrder(node.right);
            System.out.print(node.data + " "); // Display the data value
        }
    }
    // Inorder traversal (left-root-right)
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }
    
    // Breadth-First Search (BFS) to display data values
    public void displayDataBFS(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            System.out.print(currentNode.data + " "); // Display the data value

            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Insert some values into the binary tree
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);

        // Perform a pre-order traversal to display data values
        System.out.println("Data values in the binary tree (not sorted):");
        tree.displayData(tree.root);
        
        // Perform a post-order traversal to display data values
        System.out.println("\n\nData values in the binary tree (post-order):");
        tree.displayDataPostOrder(tree.root);

        // Perform an inorder traversal to print the elements in sorted order
        System.out.println("\n\n Inorder traversal:");
        tree.inorderTraversal(tree.root);
        
        // Perform BFS to display data values
        System.out.println("\n\nData values in the binary tree (BFS):");
        tree.displayDataBFS(tree.root);
    }
}
