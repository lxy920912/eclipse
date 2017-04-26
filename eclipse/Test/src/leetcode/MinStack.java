package leetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by lixiaoyan on 2017/4/7.
 */
public class MinStack {
    List<Integer> stack;
    int len;
    public MinStack() {
        stack = new ArrayList<>();
        len = stack.size();
    }

    public void push(int x) {
        stack.add(x);
        len = stack.size();
    }
    public void pop() {
        stack.remove(len-1);len = stack.size();}

    public int top() {
        return stack.get(len-1);
    }

    public int getMin() {
        final ArrayList<Integer> list1 = new ArrayList<>(stack);
        List<Integer> list = list1;
        Collections.sort(list); return list.get(0);}

}


//Q
