package depthFirstSearch;

/**
 * Created by weizhi on 2/20/17.
 */
public class invertTree {
    public TreeNode inverTree(TreeNode root){
        if(root==null){
            return root;
        }

        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        inverTree(root.left);
        inverTree(root.right);

        return root;

    }
}
