package ru.mirea.task3;

public class Book {
    private String author, name;
    private int year, pagesAmount;

    public Book(String author, String name, int year, int pagesAmount) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.pagesAmount = pagesAmount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", pagesAmount=" + pagesAmount +
                '}';
    }
}
