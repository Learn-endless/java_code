public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(12);
        myLinkedList.addLast(24);
        myLinkedList.addLast(36);

        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addLast(12);
        myLinkedList1.addLast(24);
        myLinkedList.head.next.next.next = myLinkedList1.head.next;

        NodeCode ret = getIntersectionNode(myLinkedList.head,myLinkedList1.head);
        System.out.println(ret.value);
    }
    //输入两个链表的头，找出第一个交叉节点
//    public static NodeCode getIntersectionNode(NodeCode headA, NodeCode headB) {
//        if(headA == null || headB == null) return null;
//        //1.遍历每个链表的长度
//        NodeCode pl = headA;
//        NodeCode ps = headB;
//        int lenA = 0;
//        int lenB = 0;
//        while(pl != null){
//            pl = pl.next;
//            lenA++;
//        }
//        pl = headA;
//        while(ps != null){
//            ps = ps.next;
//            lenB++;
//        }
//        ps = headB;
//        //让pl始终指向最长的链表
//        if(lenA-lenB<0){
//            pl = headB;
//            ps = headA;
//            lenA = lenB-lenA;
//        }else{
//            lenA = lenA - lenB;
//        }
//        while(lenA-- > 0){
//            pl = pl.next;
//        }
//        while(pl != ps){
//            pl = pl.next;
//            ps = ps.next;
//        }
//        return pl;
//    }


    //输入两个链表的头，找出第一个交叉节点(知名解法)
    public static NodeCode getIntersectionNode(NodeCode headA, NodeCode headB){
        NodeCode pl = headA;
        NodeCode ps = headB;
        while(pl != ps){
            pl = pl == null?headB:pl.next;
            ps = ps == null?headA:ps.next;
        }
        return pl;
    }
}
