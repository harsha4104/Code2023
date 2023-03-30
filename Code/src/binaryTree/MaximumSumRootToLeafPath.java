package binaryTree;

import java.util.ArrayList;
import java.util.List;

public class MaximumSumRootToLeafPath {

    private static List<Integer> maximumSumRootToLeafPath = new ArrayList<>();
    private static int maxSum = Integer.MIN_VALUE;
    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.left.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(7);
        root.right.left.right = new TreeNode(9);
        root.right.right.right = new TreeNode(5);

        maximuSumPath(root, 0, new ArrayList<>());

        for(int i= 0;i < maximumSumRootToLeafPath.size();i++){
            System.out.print(maximumSumRootToLeafPath.get(i)+" ");
        }
    }

    public static void maximuSumPath(TreeNode root, int sum, List<Integer> list){

        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            sum =sum+root.data;
            list.add(root.data);
            if(maxSum < sum){
                maxSum = sum;
                if(maximumSumRootToLeafPath.size() >0){
                    maximumSumRootToLeafPath.clear();
                }

                for(Integer v: list){
                    maximumSumRootToLeafPath.add(v);
                }
            }

            list.remove(list.size()-1);
            return ;
        }

        sum = sum+root.data;
        list.add(root.data);

        maximuSumPath(root.left, sum, list);
        maximuSumPath(root.right, sum, list);

        sum = sum-root.data;
        list.remove(list.size()-1);

    }
}
