package Operation;

import Book.Book;
import BookList.BookList;

//添加图书
public class AddOperation implements Operation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加图书》");
        System.out.println("请输入书名：");
        String name = scanner.next();
        System.out.println("请输入作者：");
        String author = scanner.next();
        System.out.println("请输入价格：");
        double price = scanner.nextDouble();
        System.out.println("请输入类型：");
        String type = scanner.next();
        Book book = new Book(name,author,price,type);
        //判断是否需要扩容
        bookList.isCopyOf();
        bookList.setPos(bookList.getBookSize(), book);
        bookList.setBookSize(bookList.getBookSize()+1);
        System.out.println("添加成功！");
    }
}
