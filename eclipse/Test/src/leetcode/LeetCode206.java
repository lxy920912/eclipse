package leetcode;
/**
 * Created by lixiaoyan on 2017/4/12.
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode p = head;
        ListNode pNext = p;
        while(p != null){
            pNext = p.next;
            p.next = pre;
            pre = p;
            p = pNext;
        }
        head = pre;
        return  head;
    }
}
