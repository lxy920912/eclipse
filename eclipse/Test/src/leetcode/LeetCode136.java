/**
 * Created by lixiaoyan on 2017/4/19.
 */
package leetcode;
public class LeetCode136 {
    public int singleNumber(int[] nums) {
        int temp = nums[0];
        for(int i = 1;i < nums.length;i++){
            temp = temp ^ nums[i];
        }
        return temp;
    }
}
