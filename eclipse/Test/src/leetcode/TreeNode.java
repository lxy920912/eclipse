package leetcode;
/**
 * Created by lixiaoyan on 2017/4/10.
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x){
        this.val= x;
    };
    public void travel(TreeNode root){
        if(root != null){
            System.out.print(root.val+"->");
            travel(root.left);
            travel(root.right);
        }

    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode(-1);
        trace(root,inorder,0,inorder.length-1,postorder,0,postorder.length-1,0);
        return root.left;
    }
    public static void trace(TreeNode root,int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd,int flag){
        if(inStart > inEnd || postStart > postEnd){
            return;
        }
        int val = postorder[postEnd];
        TreeNode temp = new TreeNode(val);
        int x = inStart;
        int leftLen = 0;
        int rightLen = 0;
        for(int i = inStart;i <= inEnd;i++){
            if(inorder[i] == val){
                x = i;
                leftLen = x - inStart;
                rightLen = inEnd - x;
                break;
            }
        }
        if(flag == 0){
            root.left = temp;
        }else{
            root.right = temp;
        }

        trace(temp,inorder,inStart,x-1,postorder,postStart,postStart+leftLen-1,0);
        trace(temp,inorder,x+1,inEnd,postorder,postStart+leftLen    ,postEnd-1,1);
    }

}
