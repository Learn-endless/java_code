/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-11-11
 * Time:  20:22
 */
public class TestDemo {
    //合并两个有序的列表
    public static ListNode mergeTwoLists(ListNode headA, ListNode headB){
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        while(headA != null && headB != null){
            if(headA.val < headB.val){
                temp.next = headA;
                headA = headA.next;
            }else{
                temp.next = headB;
                headB = headB.next;
            }
            temp = temp.next;
        }
        if(headA != null){
            temp.next = headA;
        }
        if(headB != null){
            temp.next = headB;
        }
        return newHead.next;
    }

    public static void main_1(String[] args) {
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addLast(12);
        myLinkedList1.addLast(24);
        myLinkedList1.addLast(36);
        myLinkedList1.addLast(48);

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.addLast(13);
        myLinkedList2.addLast(23);
        myLinkedList2.addLast(38);

        MyLinkedList myLinkedList3 = new MyLinkedList();
        myLinkedList3.head = mergeTwoLists(myLinkedList1.head, myLinkedList2.head);
        myLinkedList3.display();

    }

    public static void main_2(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(24);
        myLinkedList.addLast(8);
        myLinkedList.addLast(36);
        MyLinkedList myLinkedList3 = new MyLinkedList();
        myLinkedList3.head = myLinkedList.partition(9);
        myLinkedList3.display();
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.addLast(4);
        myLinkedList.addLast(4);
        MyLinkedList myLinkedList3 = new MyLinkedList();
        myLinkedList3.head = myLinkedList.deleteDuplication();
        myLinkedList3.display();
    }
}
