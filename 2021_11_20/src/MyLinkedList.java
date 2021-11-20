class ListNode{
    public int val;
    public ListNode next;
    public ListNode prev;
    public ListNode(int val){
        this.val = val;
    }
}
//实现带傀儡节点的双链表
public class MyLinkedList {
    //头节点
    private ListNode head;
    //傀儡节点
    private final ListNode puppet = new ListNode(-1);

    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null){
            this.head = node;
            this.puppet.next = node;
            this.head.prev = this.puppet;

        }else{
            node.next = this.head;
            this.puppet.next = node;
            node.prev = this.puppet;
            this.head.prev = node;
            this.head = this.puppet.next;
        }
    }
    //尾插法
    public void addLast(int data){
        if(this.head == null){
            addFirst(data);
        }else{
            ListNode node = new ListNode(data);
            while(this.head.next != null){
                this.head = this.head.next;
            }
            this.head.next = node;
            node.prev = this.head;
            this.head = this.puppet.next;
        }
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(this.head == null) return;
        if(index == 0){
            addFirst(data);
        }else if(index == size()){
            addLast(data);
        }else{
            ListNode node = new ListNode(data);
            while(index-- > 0){
                this.head = this.head.next;
            }
            this.head.prev.next = node;
            node.next = this.head;
            node.prev = this.head.prev;
            this.head.prev = node;
            this.head = this.puppet.next;
        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        if(this.head == null) return false;
        while(this.head != null){
            if(this.head.val == key){
                this.head = this.puppet.next;
                return true;
            }
            this.head = this.head.next;
        }
        this.head = this.puppet.next;
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null) return;
        while(this.head !=null){
            if(this.head.val == key){
                if(this.head.next == null){
                    this.head.prev.next = null;
                }else{
                    this.head.next.prev = this.head.prev;
                }
                this.head.prev.next = this.head.next;
                break;
            }
            this.head = this.head.next;
        }
        this.head = this.puppet.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(this.head == null) return;
        ListNode cur = this.head;
        while(this.head != null){
            if(this.head.val == key){
                while(this.head.val == key){
                    if(this.head.next == null){
                        cur.next = null;
                        this.head = this.head.next;
                        break;
                    }else{
                        cur.next = this.head.next;
                        this.head.next.prev = cur;
                        this.head = this.head.next;
                    }
                }
            }else{
                cur = this.head;
                this.head = this.head.next;
            }
        }
        if(this.puppet.next.val == key){
            this.puppet.next = this.puppet.next.next;
        }
        this.head = this.puppet.next;
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        while(this.head != null){
            count++;
            this.head = this.head.next;
        }
        this.head = this.puppet.next;
        return count;
    }
    public void display(){
        while(this.head != null){
            System.out.print(this.head.val+" ");
            this.head = this.head.next;
        }
        this.head = this.puppet.next;
    }
    public void clear(){
        while(this.head != null){
            ListNode cur = this.head.next;
            this.head.next = null;
            this.head = cur;
        }
        this.puppet.next = null;
    }
}
