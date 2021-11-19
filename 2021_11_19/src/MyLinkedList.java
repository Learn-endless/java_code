//节点
class ListNode{
    public int val;
    public ListNode next;
    //创建节点时，把val的值给定
    public ListNode(int val){
        this.val = val;
    }
}
// 1、无头单向非循环链表实现
public class MyLinkedList {
    //头节点
    private ListNode head;
    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
        }else{
            ListNode cur = this.head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }
    //找前驱
    private ListNode findListNode(int index){
        ListNode cur = this.head;
        index -= 1;
        while(index-->0){
            cur = cur.next;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index > size() || index < 0){
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size()){
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = findListNode(index);
        node.next = cur.next;
        cur.next = node;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if (this.head != null) {
            ListNode cur = this.head;
            while (cur != null) {
                if (cur.val == key) {
                    return true;
                }
                cur = cur.next;
            }
        }
        return false;
    }
    private ListNode searchPrev(int key){
        ListNode cur = this.head;
        while(cur.next != null){
            if(cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null){
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
            return;
        }
        ListNode cur = searchPrev(key);
        if(cur == null){
            System.out.println("没有该节点");
            return;
        }
        ListNode del = cur.next;
        cur.next = del.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(this.head == null) return;
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null){
            if (cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.val == key){
            this.head = this.head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        ListNode cur = this.head;
        int count = 0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
    //打印链表的元素
    public void display(){
        ListNode cur = this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
    //链表清空
    public void clear(){
        while(this.head!=null){
            ListNode curNext = this.head.next;
            this.head.next = null;
            this.head = curNext;
        }
    }
    //翻转单链表
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
    //给定一个头结点为 head 的非空单链表，返回链表的中间结点。
    public ListNode middleNode(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode last = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            last = last.next;
        }
        return last;
    }

    //输入一个链表，输出该链表中倒数第k个结点。
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null) return null;
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        if(count < k){
            return null;
        }
        count -= k;
        cur = head;
        while(count > 0){
            cur = cur.next;
            count--;
        }
        return cur;
    }

    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表 1->2->3->3->4->4->5  处理后为 1->2->5
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead == null) return null;
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        ListNode cur = pHead;
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                cur = cur.next;
            }else{
                temp.next = cur;
                cur = cur.next;
                temp = temp.next;
            }
        }
        temp.next = null;
        return newHead.next;
    }
}
