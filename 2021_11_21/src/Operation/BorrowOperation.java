package Operation;

import BookList.BookList;

//借阅图书
public class BorrowOperation implements Operation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入需要借阅的图书：");
        String name = scanner.next();
        int size = bookList.getBookSize();
        for (int i = 0; i < size; i++) {
            if(name.equals(bookList.getPos(i).getName())){
                bookList.getPos(i).setState(true);
                System.out.println("借阅成功！");
                System.out.println(bookList.getPos(i));
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
