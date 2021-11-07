/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-11-07
 * Time:  20:36
 */

//链表节点
class ListNode{
    public int value;
    public ListNode next;

    //创建一个节点
    public ListNode(int value){
        this.value = value;
    }
}

//单链表
public class MyLinkedList {
    //头
    private ListNode head;

    //头插
    public void addFirst(int value){
        ListNode node = new ListNode(value);
        node.next = this.head;
        this.head = node;
    }

    //尾插
    public void addLast(int value){
        ListNode node = new ListNode(value);

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

    //显示单链表
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
    }

    //查找index下标的位置
    private ListNode findIndex(int index){
        ListNode cur = this.head;
        while(index-1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index > size() || index < 0){
            System.out.println("插入位置不合法！！！");
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
        ListNode cur = findIndex(index);
        node.next = cur.next;
        cur.next = node;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        return false;
    }

    //找删除节点的前一个节点
    public ListNode findRemove(int key){
        ListNode cur = this.head;
        while(cur.next != null){
            if(cur.next.value == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null){
            System.out.println("单链表为空");
            return;
        }
        if(this.head.value == key){
            this.head = this.head.next;
            return;
        }
        ListNode cur = findRemove(key);
        if(cur == null){
            System.out.println("链表中没有该元素");
            return;
        }else{
            cur.next = cur.next.next;
            return;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(this.head == null){
            System.out.println("链表为空");
            return;
        }
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null){
            if(cur.value == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        //处理头节点为所需删除的数
        if(this.head.value == key){
            this.head = this.head.next;
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
    //清除单链表
    public void clear(){
        //粗暴写法:this.head = null;
        //温柔的
        while(this.head != null){
            ListNode temp = this.head.next;
            this.head.next = null;
            this.head = temp;
        }
    }
}
