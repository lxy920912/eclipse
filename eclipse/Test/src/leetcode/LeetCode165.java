package leetcode;
import java.util.regex.Pattern;

/**
 * Created by lixiaoyan on 2017/4/12.
 */
public class LeetCode165 {
    public int compareVersion(String version1, String version2) {
        String[] ver1Array = version1.split(Pattern.quote("."));
        String[] ver2Array = version2.split(Pattern.quote("."));
        int len1 = ver1Array.length;
        int len2 = ver2Array.length;

        for(int i = 0;i < len1 && i < len2;i++){
            int v1 = Integer.parseInt(ver1Array[i]);
            int v2 = Integer.parseInt(ver2Array[i]);
            if(v1 < v2){
                return -1;
            }
            if(v1 > v2){
                return 1;
            }
        }
        int key = 1;
        String[] temp = ver1Array;
        int shortlen = ver2Array.length;
        if(len1 < len2){
            temp = ver2Array;
            key = -1;
            shortlen = ver1Array.length;
        }
        for(int i = shortlen;i < temp.length;i++){
            int ver = Integer.parseInt(temp[i]);
            if(ver > 0){
                return key;
            }
        }
        return 0;
    }
}
