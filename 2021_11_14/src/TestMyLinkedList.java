public class TestMyLinkedList {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(45);
        myLinkedList.addLast(23);
        myLinkedList.addLast(45);
        myLinkedList.addLast(45);
        myLinkedList.clear();
        System.out.println();
    }

    public static void main_1(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(45);
        myLinkedList.addLast(23);
        myLinkedList.addLast(45);
        myLinkedList.addLast(45);
        myLinkedList.display();
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.contains(12));
        myLinkedList.addIndex(4,100);
        myLinkedList.display();
    }
}
