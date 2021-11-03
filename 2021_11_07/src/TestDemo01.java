public class TestDemo01 {
    public static void main(String[] args) {
        //new一个顺序表
        SeqList seqList = new SeqList();
        //打印顺序表的内容
        seqList.display();
        //插入元素
        seqList.add(0,1);
        seqList.add(1,2);
        seqList.add(2,3);
        seqList.add(3,4);
        seqList.display();
        System.out.println(seqList.contains(2));
        System.out.println(seqList.search(3));
        System.out.println(seqList.getPos(3));
        seqList.setPos(0,100);
        seqList.display();
        seqList.remove(100);
        seqList.display();
        System.out.println(seqList.size());
        seqList.clear();
        seqList.display();


    }
}