import java.util.Arrays;

//顺序表
public class ArraysList {

    private int[] elem;
    private int countSize;

    public ArraysList(){
        this.elem = new int[3];
    }

    //打印顺序表
    public void display(){
        for (int i = 0; i < this.countSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }

    //获取顺序表的长度
    public int getCountSize(){
        return this.countSize;
    }

    //在pos处插入data数据
    public void add(int pos, int data){
        //如果已满，扩容
        if(this.countSize==this.elem.length){
            this.elem = Arrays.copyOf(this.elem,this.countSize+3);
        }
        //pos下标不能为负数，插入的位置之前必须要有元素
        if(pos>=0 || pos>this.countSize){
            for (int i = this.countSize-1; i >= pos; i--) {
                this.elem[i+1] = this.elem[i];
            }
            this.elem[pos] = data;
            this.countSize++;
        }else{
            System.out.println("插入位置不合法！！！");
            return;
        }
    }

    //判断某个数是否在这个顺序表里面
    public boolean contains(int toFind){
        for (int i = 0; i < this.countSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    //找到某个元素，返回下标，找不到返回-1
    public int search(int toFind){
        for (int i = 0; i < this.countSize; i++) {
            if(this.elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    //找到pos下标的值
    public int getPos(int pos){
        if(pos < 0 || pos > this.countSize-1){
            System.out.println("位置不合法！！！");
            return -1;
        }else{
            return this.elem[pos];
        }
    }
}
