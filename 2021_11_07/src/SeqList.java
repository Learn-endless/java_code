import java.util.Arrays;

//顺序表
public class SeqList {
    private int[] arrayList;  //存放顺序表里的数据
    private int userSize;     //记录顺序表里数据的个数

    //初始化数组
    public SeqList(){
        this.arrayList = new int[3];
    }

    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.userSize; i++) {
            System.out.print(this.arrayList[i]+" ");
        }
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //扩容
        if(this.userSize == this.arrayList.length){
            this.arrayList = Arrays.copyOf(this.arrayList,this.userSize+3);
        }
        if(pos < 0 || pos > this.userSize){
            System.out.println("位置不合法");
            return;
        }
        //插入元素
        for (int i = this.userSize-1; i >= pos ; i--) {
            this.arrayList[i+1] = this.arrayList[i];
        }
        this.arrayList[pos] = data;
        this.userSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.userSize; i++) {
            if(this.arrayList[i] == toFind){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.userSize; i++) {
            if(this.arrayList[i] == toFind){
                return i;
            }
        }
        System.out.println("未发现该元素");
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos < 0 || pos >= this.userSize){
            System.out.println("位置不合法");
            return -1;
        }
        return this.arrayList[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0 || pos >= this.userSize){
            System.out.println("位置不合法");
            return;
        }
        this.arrayList[pos] = value;
        return;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int num = -1;
        for (int i = 0; i < this.userSize; i++) {
            if(this.arrayList[i] == toRemove){
                num = i;
                break;
            }
        }
        if(num == -1){
            System.out.println("该数不存在");
        }

        for (int i = num; i < this.userSize-1; i++) {
            this.arrayList[i] = this.arrayList[i+1];
        }
        this.userSize--;

    }
    // 获取顺序表长度
    public int size() {
        return this.userSize;
    }
    // 清空顺序表
    public void clear() {
        this.userSize = 0;
    }

}