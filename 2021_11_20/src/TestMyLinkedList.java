public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addFirst(45);
//        myLinkedList.addFirst(34);
//        myLinkedList.addFirst(23);
//        myLinkedList.addFirst(12);
        myLinkedList.addLast(12);
        myLinkedList.addLast(14);
        myLinkedList.addLast(16);
        myLinkedList.addLast(13);
//        System.out.println(myLinkedList.size());
//        myLinkedList.display();
//        System.out.println();
//        myLinkedList.clear();
//        myLinkedList.display();
//        System.out.println(myLinkedList.contains(11));
//        myLinkedList.display();

//        myLinkedList.addIndex(2,9900);
//        myLinkedList.remove(34);
        myLinkedList.removeAllKey(12);
        myLinkedList.display();
    }
}
