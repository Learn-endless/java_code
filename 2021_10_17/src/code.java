import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User:  19833
 * Date:  2021-10-18
 * Time:  21:22
 */
public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        switch (str){
            case "abc":
                System.out.println(str);
                break;
            case "bcd":
                System.out.println("hello");
                break;
            default:
                System.out.println("world");
                break;
        }
    }
}
