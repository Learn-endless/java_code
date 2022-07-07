
class SingleModel{
    private volatile static SingleModel instance = null;

    private SingleModel(){

    }

    public static SingleModel getInstance(){
        if(instance == null){
            synchronized(SingleModel.class){
                if(instance == null){
                    instance = new SingleModel();
                }
            }
        }
        return instance;
    }
}

public class Test2 {
}
