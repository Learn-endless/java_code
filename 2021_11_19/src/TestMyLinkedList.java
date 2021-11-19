public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(12);
        myLinkedList.addLast(12);
        myLinkedList.addLast(25);
        myLinkedList.addLast(23);
//        myLinkedList.addIndex(2,99);
//        myLinkedList.remove(23);
        myLinkedList.removeAllKey(12);
        myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();

//        System.out.println(myLinkedList.contains(45));
    }

    //将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode prev = node;
        ListNode cur = l1;
        ListNode next = l2;
        while(cur != null && next != null){
            if(cur.val < next.val){
                prev.next = cur;
                cur = cur.next;
            }else{
                prev.next = next;
                next = next.next;
            }
            prev = prev.next;
        }
        if(cur != null){
            prev.next = cur;
        }
        if(next != null){
            prev.next = next;
        }
        return node.next;
    }

    //给定一个数，把一个链表分割成小的在前，大的在后面
    public ListNode partition(ListNode pHead, int x) {
        if(pHead == null) return null;
        ListNode pf = null;
        ListNode lf = null;
        ListNode ps = null;
        ListNode ls = null;
        ListNode cur = pHead;

        while(cur != null){

            if(cur.val < x){
                if(pf == null){
                    pf = cur;
                    ps = pf;
                }else{
                    ps.next = cur;
                    ps = ps.next;
                }
            }else{
                if(lf == null){
                    lf = cur;
                    ls = lf;
                }else{
                    ls.next = cur;
                    ls = ls.next;
                }
            }
            cur = cur.next;
        }
        if(pf == null){
            return lf;
        }
        ps.next = lf;
        if(lf != null){
            ls.next = null;
        }
        return pf;
    }
}
