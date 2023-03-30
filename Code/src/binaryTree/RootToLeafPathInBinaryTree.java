package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPathInBinaryTree {

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

        rootToLeafPath(root, new ArrayList<>());

    }

    public static void rootToLeafPath(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            list.add(root.data);
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i)+" ");
            }
            list.remove(list.size()-1);

            System.out.println();
            return;
        }

        list.add(root.data);

        rootToLeafPath(root.left, list);
        rootToLeafPath(root.right, list);

        list.remove(list.size()-1);
    }
}
