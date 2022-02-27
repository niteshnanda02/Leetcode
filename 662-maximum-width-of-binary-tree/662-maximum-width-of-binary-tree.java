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
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        queue.add(root);
        map.put(root, 0);
        int max=1;
        while(!queue.isEmpty()){
            int size = queue.size();
            int start = 0, end=0;
            for(int i=0;i<size;i++){
                TreeNode elem = queue.remove();
                if(i==0)
                    start = map.get(elem);
                if(i==size-1)
                    end = map.get(elem);
                if(elem.left!=null){
                    queue.add(elem.left);
                    map.put(elem.left, map.get(elem)*2+1);
                }
                if(elem.right!=null){
                    queue.add(elem.right);
                    map.put(elem.right, map.get(elem)*2+2);
                }
            }
            int diff = end - start+1;
            max = Math.max(max, diff);
        }
        return max;
    }
}