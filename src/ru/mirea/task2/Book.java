package ru.mirea.task2;

public class Book {
    private final String name;
    private final int pages;
    private int readPages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
        readPages = 0;
    }

    public void read(int hours) {
        this.readPages += hours * 50; // 50 cтраниц/час - средняя скорость чтения взрослого человека
    }

    public int getLeftPages() {
        return pages - readPages;
    }

    public boolean isRead() {
        return getLeftPages() <= 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book {" +
                "Name: " + name +
                ", " +
                "Pages: " + pages +
                '}';
    }

}
