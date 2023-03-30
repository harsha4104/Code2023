package binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiagonalTraversal {

    private static int end = 0;


    public static void main(String[] args){

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(14);
        root.right.left.left = new TreeNode(4);
        root.right.left.right = new TreeNode(7);
        root.right.right.left = new TreeNode(13);
        Map<Integer, List<Integer>> map = new HashMap<>();

        diagonalTraversal(root, map, 0);

        for(int i=0 ;i >= end;i--){
            List<Integer> list = map.get(i);
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }

    }

    public static void diagonalTraversal(TreeNode root, Map<Integer, List<Integer>> map, int level){

        if(root == null){
            return;
        }

        if(level < end){
            end = level;
        }

        if(map.containsKey(level)){
            map.get(level).add(root.data);
        }
        else{
            List<Integer> list = new ArrayList<>();
            list.add(root.data);
            map.put(level, list);
        }

        diagonalTraversal(root.left, map,level-1);
        diagonalTraversal(root.right,map, level);
    }
}
