package Operation;

import BookList.BookList;
//退出系统
public class ExitOperation implements Operation{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统!");
        System.exit(0);
    }
}
