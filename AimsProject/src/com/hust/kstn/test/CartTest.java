package com.hust.kstn.test;
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Titanic", "Romance", "James Cameron", 195, 29.99);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Cinderella", "Animation", "Wilfred Jackson", 74, 15.50);
        System.out.println("TEST 1: Nạp chồng (Add 1) ");
        cart.addDVD(dvd1);
        cart.print();

        System.out.println("\n TEST 2: Nạp chồng (Add 2) ");
        cart.addDVD(dvd2, dvd3);
        cart.print();

        System.out.println("\n TEST 3: Nạp chồng (Add Varargs/Array) ");
        cart.addDVD(dvd4, dvd5);
        cart.print();

        System.out.println("\n TEST 4: Kiểm thử Giỏ hàng Đầy (Max 20) ");
        DigitalVideoDisc[] dvdsToFill = new DigitalVideoDisc[15];
        for (int i = 0; i < 15; i++) {
            dvdsToFill[i] = new DigitalVideoDisc("DVD " + (i + 6));
        }
        cart.addDVD(dvdsToFill);
        cart.print();

        DigitalVideoDisc dvdExtra = new DigitalVideoDisc("Extra DVD");
        cart.addDVD(dvdExtra);
        cart.print();

        System.out.println("\n TEST 5: Kiểm thử Xóa Sản phẩm Tồn tại ");
        cart.removeDVD(dvd1);
        cart.print();

        System.out.println("\n TEST 6: Kiểm thử Xóa Sản phẩm KHÔNG Tồn tại ");
        cart.removeDVD(dvdExtra);
        cart.print();

        System.out.println("\n TEST 7: Kiểm thử Xóa khi Giỏ hàng Rỗng ");
    }
}