package leetcode;

/**
 * Created by lixiaoyan on 2017/4/10.
 */
public class LeetCode173 {
    private TreeNode root;
    public LeetCode173(TreeNode root){
        this.root = root;
    }
    public boolean hasNext() {
        if(this.root == null){
            return false;
        }else{
            return false;
        }
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode p = root;
        if(p.left == null){
            return root.val;
        }
        while (p.left != null){
            p = p.left;
        }
        return p.val;
    }
}
