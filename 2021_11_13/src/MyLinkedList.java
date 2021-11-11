import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-11-11
 * Time:  19:10
 */
//ListNode代表一个节点
class ListNode {
    public int val;
    public ListNode next;//null

    public ListNode(int val) {
        this.val = val;
    }
}
public class MyLinkedList {

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

    /**
     * 从指定头节点开始进行打印
     * @param newHead
     */
    public void display2(ListNode newHead) {
        //this.head.next != null
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }


    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
        }else {
            ListNode cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    /**
     * 找到index-1位置的节点的地址
     * @param index
     * @return
     */
    public ListNode findIndex(int index) {
        ListNode cur = this.head;
        while (index-1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size()) {
            System.out.println("index位置不合法！");
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = findIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
    }

    /**
     * 找到 要删除的关键字的前驱
     * @param key
     * @return
     */
    public ListNode searchPerv(int key) {
        ListNode cur = this.head;
        while (cur.next != null) {
            if(cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null) {
            System.out.println("单链表为空，不能删除！");
            return;
        }
        if(this.head.val == key) {
            this.head = this.head.next;
            return;
        }
        ListNode cur = searchPerv(key);
        if(cur == null) {
            System.out.println("没有你要删除的节点！");
            return;
        }
        ListNode del = cur.next;
        cur.next = del.next;
    }

    //删除所有值为key的节点
    public ListNode removeAllKey(int key){
        if(this.head == null) return null;
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while (cur != null) {
            if(cur.val == key) {
                prev.next = cur.next;
                cur = cur.next;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        //最后处理头
        if(this.head.val == key) {
            this.head = this.head.next;
        }
        return this.head;
    }
    //清空单链表
    public void clear(){
        //this.head == null(暴力做法)
        while (this.head != null) {
            ListNode curNext = head.next;
            this.head.next = null;
            this.head = curNext;
        }
    }
    //反转单链表
    public ListNode reverseList() {
        if(this.head == null) {
            return null;
        }
        ListNode cur = this.head;
        ListNode prev = null;

        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return prev;
    }
    //找到单链表中间的那个节点(偏后的一个)
    public ListNode middleNode() {
        if(head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
//            if(fast == null) {
//                return slow;
//            }
            slow = slow.next;
        }
        return slow;
    }

    //返回倒数第k个节点的值
    public ListNode findKthToTail(int k) {
        if(k <= 0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (k-1 != 0) {
            fast = fast.next;
            //避免输入的k值超过单链表的节点个数
            if(fast == null) {
                return null;
            }
            k--;
        }
        //走到fast指向的节点的next值为null为止
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //找到了倒数的第k个节点的引用
        return slow;
    }
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(int x) {
        if(this.head == null) {
            return null;
        }
        //小于x的段
        ListNode bs = null;
        ListNode be = null;
        //大于x的段
        ListNode as = null;
        ListNode ae = null;

        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val < x) {
                if(bs == null){
                    bs = cur;
                    be = cur;
                }else{
                    be.next = cur;
                    be = be.next;
                }
            }else{
                if(as == null){
                    as = cur;
                    ae = cur;
                }else{
                    ae.next = cur;
                    ae = ae.next;
                }
            }
            cur = cur.next;
        }
        if(bs == null){
            return as;
        }
        be.next = as;
        if(as != null){
            ae.next = null;
        }
        return bs;
    }
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针
    public ListNode deleteDuplication(){
        ListNode cur = this.head;
        //建一个虚的节点
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;   //负责把删除后的部分连接起来
        while(cur != null){
            if(cur.next != null && cur.val == cur.next.val){
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                //多走一步,重复的一个不要
                cur = cur.next;
            }else{
                temp.next = cur;
                cur = cur.next;
                temp = temp.next;
            }
        }
        //加上尾节点
        temp.next = null;
        return newHead.next;
    }

    public boolean chkPalindrome(ListNode A) {
        // write code here
        if(head == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //slow走到了中间位置-》反转

        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //反转完成
        while(head != slow) {
            if(head.val != slow.val) {
                return false;
            }
            if(head.next == slow) {
                return true;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }


    public boolean hasCycle() {
        if(head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if(head == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null;
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public void createLoop() {
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = head.next.next;
    }


}