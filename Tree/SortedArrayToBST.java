/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null;
        TreeNode root = make(nums,0,nums.length-1);
        return root;
    }
    public TreeNode make(int[] nums, int low, int high){
        if(low>high){
            return null;
        }
        int mid = (high+low)/2;
        TreeNode node = new TreeNode(nums[mid],make(nums,low,mid-1),make(nums,mid+1,high));
        return node;
    }
}