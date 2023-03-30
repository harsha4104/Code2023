package binaryTree;

import java.util.Stack;

public class InorderWithoutRecursion {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        inorderTraversalWithoutRecursion(root);

    }

    public static void inorderTraversalWithoutRecursion(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);
        TreeNode current = root.left;

        while(current != null || !stack.isEmpty()){

            while(current != null){
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.data+" ");
            current = current.right;
        }
    }
}
