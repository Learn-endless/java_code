package User;

import Operation.*;

import java.util.Scanner;

public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);
        super.operations = new Operation[]{
                new ExitOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisOperation(),
                new FindOperation()
        };
    }
    @Override
    public int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=========管理员菜单=========");
        System.out.println("欢迎 "+super.name+" 管理员》》》");
        System.out.println("0.退出系统.");
        System.out.println("1.添加图书.");
        System.out.println("2.删除图书.");
        System.out.println("3.显示图书.");
        System.out.println("4.查找图书.");
        System.out.println("==========================");
        System.out.println("请选择》");
        int input = sc.nextInt();
        return input;
    }
}
