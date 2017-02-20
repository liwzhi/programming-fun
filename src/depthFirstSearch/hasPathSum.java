package depthFirstSearch;

/**
 * Created by weizhi on 2/19/17.
 */
public class hasPathSum {
    public boolean hasPathSum(TreeNode root, int sum){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null){
            if(root.val==sum)
                return true;
        }
        if(root.left!=null){
            hasPathSum(root.left, sum - root.val);
        }
        if(root.right!=null){
            hasPathSum(root.right, sum - root.val);
        }
        return false;
    }
}
