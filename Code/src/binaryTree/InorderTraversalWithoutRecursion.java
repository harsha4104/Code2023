package binaryTree;

import java.util.Stack;

public class InorderTraversalWithoutRecursion {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        inorderWithoutRecursion(root);
    }

    public static void inorderWithoutRecursion(TreeNode root){

        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();

        while(!stack.isEmpty() || root != null){

            while(root != null){
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            System.out.print(root.data+" ");
            root = root.right;
        }
    }
}
