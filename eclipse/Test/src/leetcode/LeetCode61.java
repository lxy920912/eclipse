package leetcode;
/**
 * Created by lixiaoyan on 2017/3/31.
 */
public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0  || head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode q = head;
        for(int i = 0;i < k && (p.next!= null);i++){
            p = p.next;
        }
        while(p.next != null){
            q = q.next;
            p = p.next;
        }
        ListNode temp = q.next;
        q.next = null;
        p.next = head;
        head = temp;
        return head;
    }
}
