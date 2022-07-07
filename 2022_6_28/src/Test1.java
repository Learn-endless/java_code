class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val){
        this.val = val;
    }
}

public class Test1 {
    public boolean chkPalindrome(ListNode head) {
        // write code here
        if(head == null){
            return false;
        }
        //1.找中间节点
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //2.翻转后半部分
        ListNode cur = slow.next;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //3.检查前后两部分是否相同(注意奇数个数和偶数个数的情况)
        while(head != slow && head.next != slow){
            if(head.val != slow.val){
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
