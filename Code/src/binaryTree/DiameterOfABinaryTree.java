package binaryTree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class DiameterOfABinaryTree {

    class Height{
        int height;

    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//        root.left.left.left = new TreeNode(8);
//        root.left.left.right = new TreeNode(9);
//        root.left.right.left = new TreeNode(10);
//        root.left.right.right = new TreeNode(11);

        List<Integer> list = new ArrayList<>();
        System.out.println(diameter(root, list));


    }

    public static int diameter(TreeNode root, List<Integer> list){
        if(root == null){
            list.add(0);
            return 0;
        }

        List<Integer> lh = new ArrayList<>();
        List<Integer> rh = new ArrayList<>();

        int leftDiameter = diameter(root.left, lh);
        int rightDiameter = diameter(root.right, rh);

        list.add(1+Math.max(lh.get(0), rh.get(0)));

        return Math.max(rh.get(0)+lh.get(0)+1, Math.max(leftDiameter, rightDiameter));
    }
}
