class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}

public class MyLinkedList {
    ListNode head = null;
    ListNode last = null;

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
            this.last = node;
        }else{
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }

    //找到需要插入位置的节点
    private  ListNode searchNode(int index){
        ListNode cur = this.head;
        while(index > 0){
            cur = cur.next;
            index -- ;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index < 0 || index > size()){
            return;
        }
        if(index == 0){
            addFirst(data);
        }else if(index == size()){
            addLast(data);
        }else{
            ListNode cur = searchNode(index);
            ListNode node = new ListNode(data);
            cur.prev.next = node;
            node.next = cur;
            node.prev = cur.prev;
            cur.prev = node;
        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if(this.head == null){
            return false;
        }
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                //处理当前链表只有一个节点，且它就是要删除的节点
                if (this.head == this.last) {
                    this.head = null;
                    this.last = null;
                    //处理头节点为要删除的节点时
                } else if (cur == this.head) {
                    this.head.next.prev = this.head.prev;
                    this.head = this.head.next;
                    //处理尾结点为要删除的节点时
                } else if (cur == this.last) {
                    this.last.prev.next = this.last.next;
                    this.last = this.last.prev;
                } else {//中间的节点为要删除的节点时
                    cur.next.prev = cur.prev;
                    cur.prev.next = cur.next;
                }
                return;
            }
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (this.head == null) {
            return;
        }
        ListNode cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                //处理当前链表只有一个节点，且它就是要删除的节点
                if (this.head == this.last) {
                    this.head = null;
                    this.last = null;
                    //处理头节点为要删除的节点时
                } else if (cur == this.head) {
                    this.head.next.prev = this.head.prev;
                    this.head = this.head.next;
                    //处理尾结点为要删除的节点时
                } else if (cur == this.last) {
                    this.last.prev.next = this.last.next;
                    this.last = this.last.prev;
                } else {//中间的节点为要删除的节点时
                    cur.next.prev = cur.prev;
                    cur.prev.next = cur.next;
                }
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while(cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    public void display(){
        if(this.head == null) return;
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
    public void clear(){
        while(this.head != null){
            ListNode nextNode = this.head.next;
            this.head.prev = null;
            this.head.next = null;
            this.head = nextNode;
        }
        this.last = null;
    }
}
