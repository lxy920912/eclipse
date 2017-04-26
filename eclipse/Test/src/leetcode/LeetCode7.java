
package leetcode;

import java.awt.geom.FlatteningPathIterator;

public class LeetCode7 {
	 public int reverse(int x) {
		 int flag = 1;
		 if( x < 0){
			 flag = -1;
		 }
		 x = Math.abs(x);
		 int temp = 0;
		 int max = 2147483647;
		 while(x >= 10){
			 if(temp <= max/10){
				 temp = temp*10+(x%10);
				 x = x/10;
			 }else{
				 temp = 0;
			 }
			
		 }
		 temp = (temp*10+x)*flag;
		 return temp;
	 }

}
