package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PostOrderTraversalWithoutRecursion {

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        postOrderTraversalWithoutRecursion(root);
    }

    public static void postOrderTraversalWithoutRecursion(TreeNode root){

        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        Stack<Integer> stack2 = new Stack<>();
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            stack2.push(temp.data);

            if(temp.left != null){
                stack.push(temp.left);
            }

            if(temp.right != null){
                stack.push(temp.right);
            }
        }

        while(!stack2.isEmpty()){
            System.out.print(stack2.pop()+" ");
        }
    }
}
