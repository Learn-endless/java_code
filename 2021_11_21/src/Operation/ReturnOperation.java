package Operation;

import BookList.BookList;

//归还图书
public class ReturnOperation implements Operation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入归还的书籍：");
        String name = scanner.next();
        int size = bookList.getBookSize();
        for (int i = 0; i < size; i++) {
            if(name.equals(bookList.getPos(i).getName())){
                if(!bookList.getPos(i).isState()){
                    System.out.println("请勿归还不是图书馆的书》》》");
                    return;
                }
                bookList.getPos(i).setState(false);
                System.out.println("归还成功！");
                System.out.println(bookList.getPos(i));
                return;
            }
        }
        System.out.println("没有这本书！");
    }
}
