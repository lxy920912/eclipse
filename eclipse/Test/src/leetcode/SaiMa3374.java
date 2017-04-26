package leetcode;

import java.util.*;

/**
 * Created by lixiaoyan on 2017/3/30.
 */
public class SaiMa3374 {
    public void solution( List<Integer>list1,List<Integer>list2){
        Map map = new HashMap();
        List<Integer> result = new ArrayList<>();
        list1.addAll(list2);
        for(int i = 0;i < list1.size();i++){
            String key = list1.get(i)+"";
            if(!map.containsKey(key)){
               map.put(key,1);
               result.add(Integer.parseInt(key));
            }
        }
        Collections.sort(result);
        for(int i = 0; i< result.size()-1;i++){
            System.out.print(result.get(i)+" ");
        }
        System.out.print(result.get(result.size()-1));
        System.out.println();

    }
}
