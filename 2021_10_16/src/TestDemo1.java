public class TestDemo1 {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 100){
            if((i%3 != 0) || (i % 5 != 0)){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

    }
}