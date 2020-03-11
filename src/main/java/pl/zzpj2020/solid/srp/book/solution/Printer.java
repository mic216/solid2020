package pl.zzpj2020.solid.srp.book.solution;

import java.io.PrintStream;
import java.io.StringReader;

public class Printer implements IPrinter {
    @Override
    public void print(Book book) {
        PrintStream ps = new PrintStream(System.out);
        ps.print(
                "Book{" +
                "title='" + book.getTitle() + '\'' +
                ", content='" + book.getContent() + '\'' +
                ", price=" + book.getPrice() +
                ", pagesNumber=" + book.getPagesNumber() +
                '}'
        );
    }
}
