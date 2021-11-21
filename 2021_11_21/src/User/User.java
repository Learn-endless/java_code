package User;

import BookList.BookList;
import Operation.Operation;

abstract public class User {
    public String name;
    public Operation[] operations;
    public User(String name){
        this.name = name;
    }

    abstract public int menu();

    public void doWork(int tmp,BookList bookList){
        operations[tmp].work(bookList);
    }
}
