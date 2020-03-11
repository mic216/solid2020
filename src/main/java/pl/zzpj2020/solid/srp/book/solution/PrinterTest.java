package pl.zzpj2020.solid.srp.book.solution;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void print() {
        Book book = new Book("abc", "def", 44,55);
        Printer printer = new Printer();
        printer.print(book);
    }
}