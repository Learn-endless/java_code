package Test;
class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
public class MyLikedList {
    public ListNode head;//链表的头引用

    public void display() {
        //this.head.next != null
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            ListNode cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            //cur.next == null;
            cur.next = node;
        }
    }

    //删除所有值为key的节点
    public ListNode removeAllKey(int key){
        if(this.head == null) return null;
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
            }else {
                prev = cur;
            }
            cur = cur.next;
        }
        //最后处理头
        if(this.head.val == key) {
            this.head = this.head.next;
        }
        return this.head;
    }
}
