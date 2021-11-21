package Operation;

import BookList.BookList;

//删除图书
public class DelOperation implements Operation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入书名：");
        String name = scanner.next();
        int size = bookList.getBookSize();
        for (int i = 0; i < size; i++) {
            if(bookList.getPos(i).getName().equals(name)){
                for (int j = i; j < size-1; j++) {
                    bookList.setPos(j,bookList.getPos(j+1));
                }
                bookList.setPos(size-1,null);
                bookList.setBookSize(size-1);
                System.out.println("删除成功！");
                return;
            }
        }
        System.out.println("删除失败！");
    }
}
