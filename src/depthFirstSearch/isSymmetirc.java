package depthFirstSearch;


/**
 * Created by weizhi on 2/18/17.
 */
public class isSymmetirc {
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return help(root.left, root.right);

    }

    public boolean help(TreeNode left, TreeNode right) {
        if (left==null && right==null){
            return true;
        }
        if (left==null || right==null){
            return false;
        }
        return left.val==right.val && help(left.left, right.right) && help(left.right, right.left);
    }


}