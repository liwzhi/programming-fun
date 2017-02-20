package depthFirstSearch;

/**
 * Created by weizhi on 2/19/17.
 */
public class leetCode {

    public static void main(String [] args)
    {
        hasPathSum obj = new hasPathSum();
        TreeNode root = new TreeNode(1);
        TreeNode left_1 = new TreeNode(2);
        TreeNode left_1_left = new TreeNode(4);
        TreeNode left_1_right = new TreeNode(7);

        root.left = left_1;
        left_1.left = left_1_left;
        left_1.right = left_1_right;

        System.out.println(obj.hasPathSum(root,10));
    }

}
