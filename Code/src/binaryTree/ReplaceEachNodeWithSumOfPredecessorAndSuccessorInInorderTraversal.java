package binaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class ReplaceEachNodeWithSumOfPredecessorAndSuccessorInInorderTraversal {

    private static int index = 0;

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        List<Integer> list = new ArrayList<>();

        inorder(root);
        inorderTraversal(root, list);

        System.out.println();
        List<Integer> newList = new ArrayList<>();
        newList.add(list.get(0));
        for(int i=1;i<list.size()-1;i++){
            newList.add(list.get(i-1)+list.get(i+1));
        }
        newList.add(list.get(list.size()-1));

        inorderTraversalToReplaceWithSum(root, newList);
        inorder(root);

    }

    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void inorderTraversal(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        inorderTraversal(root.left,list);
        list.add(root.data);
        inorderTraversal(root.right,list);
    }

    public static void inorderTraversalToReplaceWithSum(TreeNode root, List<Integer>list){
        if(root == null){
            return;
        }

        inorderTraversalToReplaceWithSum(root.left, list);
        root.data = list.get(index++);
        inorderTraversalToReplaceWithSum(root.right,list);
    }


}
