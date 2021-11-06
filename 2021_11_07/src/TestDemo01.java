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
        //判断是否包含某个元素
        System.out.println("\n"+seqList.contains(2));
        //查找某个元素对应的位置
        System.out.println(seqList.search(3));
        //获取 pos 位置的元素
        System.out.println(seqList.getPos(3));
        //给 pos 位置的元素设为 value
        seqList.setPos(0,100);
        seqList.display();
        System.out.println();
        //删除第一次出现的关键字key
        seqList.remove(100);
        seqList.display();
        System.out.println();
        //获取顺序表长度
        System.out.println(seqList.size());
        //清空顺序表
        seqList.clear();
        seqList.display();
    }
}