package leetcode;
import java.util.Arrays;

/**
 * Created by lixiaoyan on 2017/4/19.
 */
public class LeetCode137 {
    public int singleNumber(int[] nums) {
        int one = 0;
        int two = 0;
        int three = 0;
        for(int i = 0;i < nums.length;i++){
            two |= one & nums[i];
            one ^= nums[i];

            three = one&two;

            one &= ~three;
            two &= ~three;
        }
        return one;
    }
}

