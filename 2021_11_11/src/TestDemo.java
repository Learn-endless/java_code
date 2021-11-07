/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-11-07
 * Time:  20:36
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(23);
        myLinkedList.addLast(23);
        myLinkedList.addLast(12);
        myLinkedList.addLast(23);
        myLinkedList.addLast(23);
        myLinkedList.clear();
        System.out.println();
    }
    public static void main_2(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(23);
        myLinkedList.addLast(23);
        myLinkedList.addLast(12);
        myLinkedList.addLast(23);
        myLinkedList.addLast(23);
        myLinkedList.display();
        System.out.println();
        myLinkedList.removeAllKey(23);
        myLinkedList.display();
    }
    public static void main_1(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(12);
        myLinkedList.addLast(23);
        myLinkedList.addLast(34);
        myLinkedList.addLast(45);
        myLinkedList.addLast(56);
        myLinkedList.display();
        System.out.println();
        myLinkedList.remove(12);
        myLinkedList.display();
        System.out.println();
        myLinkedList.remove(56);
        myLinkedList.display();
        System.out.println();
        myLinkedList.remove(34);
        myLinkedList.display();
        System.out.println();
        myLinkedList.remove(156);
    }
}
