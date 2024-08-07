import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class inprepost1 {
    public void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }
    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(6);
        root.left.left.right = new TreeNode(9);
        root.right.right.left = new TreeNode(8);
        root.left.left.right.left = new TreeNode(1);
        inprepost1 Tree = new inprepost1();
        System.out.print("preorder Traversal:");
        Tree.preorder(root);
        System.out.println();
        System.out.print("inorder Traversal:");
        Tree.inorder(root);
        System.out.println();
        System.out.print("postorder Traversal:");
        Tree.postorder(root);
    }
}