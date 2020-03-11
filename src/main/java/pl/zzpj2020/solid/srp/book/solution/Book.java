package pl.zzpj2020.solid.srp.book.solution;

public class Book {
    private String title;
    private String content;
    private int price;
    private int pagesNumber;

    public Book(String title, String content, int price, int pagesNumber) {
        this.title = title;
        this.content = content;
        this.price = price;
        this.pagesNumber = pagesNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }
}