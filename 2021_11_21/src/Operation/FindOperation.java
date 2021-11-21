package Operation;

import BookList.BookList;

//查找图书
public class FindOperation implements Operation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入图书的名字：");
        String name = scanner.next();
        for (int i = 0; i < bookList.getBookSize(); i++) {
            if(bookList.getPos(i).getName().equals(name)){
                System.out.println(bookList.getPos(i));
                return;
            }
        }
        System.out.println("未找到图书！");
    }
}
