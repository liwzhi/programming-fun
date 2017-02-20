package depthFirstSearch;

/**
 * Created by weizhi on 2/19/17.
 */
import java.util.*;

public class binaryTreePaths {
            public List<String> binaryTreePaths(TreeNode root) {
            if(root==null){
                return null;
            }
            List<String> result = new ArrayList<String>();
            String currPath = Integer.toString(root.val);
            return help(root, result, currPath);

        }
        public List<String> help(TreeNode root, List<String> result, String currPath){
            if (root.left==null && root.right==null){
                result.add(currPath);
            }
            if(root.left!=null){
                currPath = currPath + "->" + Integer.toString(root.left.val);
                help(root.left, result, currPath );
            }
            if(root.right!=null){
                currPath = currPath + "->" + Integer.toString(root.right.val);
                help(root.right, result, currPath + "->" + Integer.toString(root.left.val));
            }
            return result;
        }

    }
