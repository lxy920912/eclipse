package leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiaoyan on 2017/4/19.
 */
public class LeetCode114 {
    public void flatten(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        trace(root,result);
        TreeNode temp = root;
        for(int i = 1;i < result.size();i++){
         temp.right = result.get(i);
         temp.left = null;
         temp = result.get(i);
        }
    }
    public void trace(TreeNode root,List<TreeNode> result){
        if(root == null){
            return;
        }
        result.add(root);
        trace(root.left,result);
        trace(root.right,result);
    }


}
