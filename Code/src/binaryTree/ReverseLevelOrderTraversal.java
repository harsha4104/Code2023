package binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversal {

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(11);
        root.left.left.left.left = new TreeNode(12);
        root.left.left.left.right = new TreeNode(13);

        reverseLevelOrder(root);
    }

    public static void reverseLevelOrder(TreeNode root){

        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        if(root != null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            int size = queue.size();

            while(size >0){
                TreeNode temp = queue.poll();

                stack.push(temp.data);
                if(temp.left != null){
                    queue.add(temp.left);
                }

                if(temp.right != null){
                    queue.add(temp.right);
                }

                size--;
            }

            while(!stack.isEmpty()){
                System.out.print(stack.pop()+" ");
            }

            System.out.println();
        }


    }
}
