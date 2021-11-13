//节点
class NodeCode{
    public int value;
    public NodeCode next;

    public NodeCode(int value){
        this.value = value;
    }
}
//单链表
public class MyLinkedList {
    NodeCode head = null;

    //尾插法
    public void addLast(int data){
        NodeCode node = new NodeCode(data);
        if(this.head == null){
            this. head = node;
        }else{
            NodeCode cur = this.head;
            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = node;
        }
    };
   //打印链表
    public void display(){
        NodeCode cur = this.head;
        while(cur!= null){
            System.out.print(cur.value+" ");
            cur = cur.next;
        }
    }

    //判断单链表是否为回文结构
    public boolean chkPalindrome(NodeCode head) {
        if(head == null) return false;
        //1.找中间节点
        NodeCode fast = head;
        NodeCode low = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            low = low.next;
        }
        //2.翻转后半段
        NodeCode cur = low.next;
        while(cur != null){
            NodeCode curNext = cur.next;
            cur.next = low;
            low = cur;
            cur = curNext;
        }
        //判断是否回文(注意节点的个数为奇数或者是偶数)
        while(head!=low && head.next!=low){
            assert low != null;
            if(head.value != low.value){
                return false;
            }
            head = head.next;
            low = low.next;
        }
        return true;
    }
}
