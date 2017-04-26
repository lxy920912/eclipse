package leetcode;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by lixiaoyan on 2017/4/6.
 */
public class LeetCode215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        return nums[len-k];
    }
}
