package leetcode;
import java.util.Stack;

/**
 * Created by lixiaoyan on 2017/4/12.
 */
public class LeetCode207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] course = new int[numCourses];
        for(int i = 0;i < numCourses;i++){
            course[i] = i;
        }
        int count = numCourses;
        return false;
    }

}
