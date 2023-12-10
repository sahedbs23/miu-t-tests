package leetcode.DailyChellange;

import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        t2.left = new TreeNode(4);
        t.left = t2;
        t.right = new TreeNode(3);
        System.out.println(tree2str(t));

    }

    // recursion solution
    public static String tree2str(TreeNode root) {
        if(root == null){
            return "";
        }
        String r = String.valueOf(root.val);
        if(root.left == null && root.right != null){
            r+= "()";
        }
        r += root.left == null ? "" : "(" + tree2str(root.left) +")";
        r += root.right == null ? "" : "(" + tree2str(root.right) +")";
        return r;
    }
}