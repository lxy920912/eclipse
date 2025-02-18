package leetcode;
import java.util.Stack;

/**
 * Created by lixiaoyan on 2017/4/17.
 */
public class LeetCode150 {
    public int evalRPN(String[] tokens) {
//String[] tokens
        Stack<String> optStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        for(int i = 0;i < tokens.length;i++){
            try {
                int num = Integer.parseInt(tokens[i]);
                numStack.push(num);
            }catch (Exception e){
                int num2 = numStack.pop();
                int num1 = numStack.pop();
                String opt = tokens[i];
                numStack.push(optString(num1,num2,opt));
            }
        }
        return  numStack.pop();

    }
    public int optString(int num1,int num2,String opt){
        if(opt.equals("+")){
            return  num1+num2;
        }
        if(opt.equals("-")){
            return num1 - num2;
        }
        if(opt.equals("*")){
            return  num1 * num2;
        }
        if (opt.equals("/")){
            return  num1/num2;
        }
        return 0;
    }
}
