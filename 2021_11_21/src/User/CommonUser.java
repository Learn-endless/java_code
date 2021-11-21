package User;

import Operation.*;

import java.util.Scanner;

public class CommonUser extends User{

    public CommonUser(String name) {
        super(name);
        super.operations = new Operation[]{
                new ExitOperation(),
                new BorrowOperation(),
                new DisOperation(),
                new FindOperation(),
                new ReturnOperation()
        };
    }

    @Override
    public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========用户菜单=========");
        System.out.println("hello "+super.name+" 用户》》》");
        System.out.println("0.退出系统.");
        System.out.println("1.借阅图书.");
        System.out.println("2.显示图书.");
        System.out.println("3.查找图书.");
        System.out.println("4.归还图书.");
        System.out.println("=========================");
        System.out.println("请选择》");
        int input = sc.nextInt();
        return input;
    }
}
