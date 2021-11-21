package BookList;

import Book.Book;

import java.util.Arrays;

public class BookList {
    private Book[] books = new Book[3];
    private int bookSize;

    public BookList(){
        books[0] = new Book("水浒传","施耐庵",15.5,"四大名著");
        books[1] = new Book("三国演义","罗贯中",19.9,"四大名著");
        books[2] = new Book("西游记","吴承恩",15.9,"四大名著");
        this.bookSize = 3;
    }

    //扩容
    public void isCopyOf(){
        if(this.books.length == getBookSize()){
            this.books = Arrays.copyOf(books,books.length+2);
        }
    }

    public Book getPos(int pos) {
        return this.books[pos];
    }

    public void setPos(int pos,Book book) {
        this.books[pos] = book;
    }

    public int getBookSize() {
        return bookSize;
    }

    public void setBookSize(int bookSize) {
        this.bookSize = bookSize;
    }
}
