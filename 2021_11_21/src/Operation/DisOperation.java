package Operation;

import BookList.BookList;
//显示图书
public class DisOperation implements Operation{
    @Override
    public void work(BookList bookList) {
        for (int i = 0; i < bookList.getBookSize(); i++) {
            System.out.println(bookList.getPos(i));
        }
    }
}
