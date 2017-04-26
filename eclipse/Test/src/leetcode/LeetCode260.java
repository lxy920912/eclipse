package leetcode;
import java.util.Arrays;

/**
 * Created by lixiaoyan on 2017/4/19.
 */
public class LeetCode260 {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[2];
        int index = 0;
        int i = 0;
        for(i = 0;i < nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                i++;
                continue;
            }else {
                result[index] = nums[i];
                index++;
            }
        }
        if(i <= nums.length-1){
            result[index] = nums[i];
        }
        System.out.println(result[0]+","+result[1]);
        return result;
    }
}
