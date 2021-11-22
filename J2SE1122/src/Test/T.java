package Test;

public class T {
    public static void main(String[] args) {
        MyLikedList myLikedList = new MyLikedList();
        myLikedList.addLast(12);
        myLikedList.addLast(12);
        myLikedList.addLast(12);
        myLikedList.addLast(12);
        myLikedList.removeAllKey(12);
        myLikedList.display();
    }
}
