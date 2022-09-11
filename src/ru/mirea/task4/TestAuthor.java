package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("J. K. Rowling", "hprowling@mail.com", 'f');
        System.out.println(author);
        System.out.println("Name - " + author.getName());
        System.out.println("Email - " + author.getEmail());
        author.setEmail("rowlingpotter@mail.com");
        System.out.println("New Email - " + author.getEmail());
        System.out.println("Gender - " + author.getGender());
        System.out.println(author);
    }

}
