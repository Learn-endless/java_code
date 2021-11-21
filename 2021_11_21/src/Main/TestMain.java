package Main;

import BookList.BookList;
import User.AdminUser;
import User.CommonUser;
import User.User;

import java.util.Scanner;

//入口
public class TestMain {
    public static User Login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.next();
        while(true){
            System.out.println("请选择登录方式》1.管理员  0.普通用户");
            int input = sc.nextInt();
            if (input == 1) {
                return new AdminUser(name);
            } else if (input == 0) {
                return new CommonUser(name);
            } else {
                System.out.println("登录方式选择错误！请重新选择》");
            }
        }
    }

    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = Login();
        while(true){
            int tmp = user.menu();
            user.doWork(tmp, bookList);
        }
    }
}
