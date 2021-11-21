package Operation;

import BookList.BookList;

import java.util.Scanner;

public interface Operation {
    Scanner scanner = new Scanner(System.in);
    void work(BookList bookList);
}
