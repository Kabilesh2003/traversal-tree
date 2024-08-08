import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int value) {
        val = value;
    }
}
class BinaryTree {
    public void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
    public void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }
    public void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.val + " ");
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
      root.left.left=new TreeNode(3);
      root.left.left.right=new TreeNode(9);
      root.left.left.right.left=new TreeNode(1);
      root.right=new TreeNode(5);
      root.right.left=new TreeNode(7);
      root.right.right=new TreeNode(6);
      root.right.right.left=new TreeNode(8);
       

        System.out.print("Pre-order traversal: ");
        tree.preOrderTraversal(root);
        System.out.println();

        System.out.print("Post-order traversal: ");
        tree.postOrderTraversal(root);
        System.out.println();

        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(root);
    }
}