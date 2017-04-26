package leetcode;


import java.util.regex.Pattern;

/**
 * Created by lixiaoyan on 2017/4/6.
 */
public class LeetCode151 {
    public String reverseWords(String s) {

        String[] sAtrr = s.split(" ");
        int len = sAtrr.length;
        s = "";
        for(int i = len-1;i >= 0;i--){
            if(sAtrr[i].length() == 0){
                s = s+"";
            }else{
                s = s+sAtrr[i]+" ";
            }
      }
        System.out.print(s);
        return s;
    }
}
