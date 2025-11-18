package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Nguyen Nhat Anh", 1955, "Nha van noi tieng");
        BookAuthor author2 = new BookAuthor("To Hoai", 1920, "Tac gia De Men Phieu Luu Ky");
        Book book1 = new Book("Cho toi xin mot ve di tuoi tho", "Story", 5.5, 15000);
        book1.addAuthor(author1);
        System.out.println(book1.toString());
    }
}