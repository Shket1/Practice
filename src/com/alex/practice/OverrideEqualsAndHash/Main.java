package com.alex.practice.OverrideEqualsAndHash;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Толстой", "Война и мир", 500);
        Book book2 = new Book("Пушкин", "Евгений Онегин", 250);
        Book book3 = new Book("Гоголь", "Мертвые души", 500);
        Book book4 = new Book("Толстой", "Война и мир", 500);

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1.equals(book1));
        System.out.println(book3.equals(book2));
        System.out.println(book4.equals(book1));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());

        
    }
}
