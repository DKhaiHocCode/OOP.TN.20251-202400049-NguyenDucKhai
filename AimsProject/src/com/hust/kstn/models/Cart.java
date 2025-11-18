package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 100;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public void addDVD(DigitalVideoDisc disc){
        if (qtyOrdered >= MAX_NUMBER_ORDERED){
            System.out.println("The cart is almost full.");
        } else{
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added successfully.");
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        boolean empty = true;
        for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
            if (itemsInCart[i] != null && itemsInCart[i].equals(disc)) {
                itemsInCart[i] = null;
                System.out.println("The disc has been removed successfully.");
                return;
            }
            if(itemsInCart[i] != null ) {
                empty = false;
            }
        }
        if(empty) System.out.println("The cart is empty.");
        else System.out.println("The disc does not exist.");
    }

    public double calculateTotalCost(){
        double totalCost = 0.0;
        for(DigitalVideoDisc item : itemsInCart){
            if(item != null){
                totalCost += item.getCost();
            }
        }
        return totalCost;
    }

    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered < 20){
            itemsInCart[qtyOrdered++] = disc1;
            System.out.println("The disc \"" + disc1.getTitle() + "\" has been added.");
        } else{
            System.out.println("The cart is full. Cannot add the disc: " + disc1.getTitle());
        }

        if (qtyOrdered < 20){
            itemsInCart[qtyOrdered++] = disc2;
            System.out.println("The disc \"" + disc2.getTitle() + "\" has been added.");
        } else{
            System.out.println("The cart is full. Cannot add the disc: " + disc2.getTitle());
        }
    }


    public void addDVD(DigitalVideoDisc... discs) {
        if (discs == null) {
            System.out.println("Cannot add null discs array.");
            return;
        }

        for (DigitalVideoDisc disc : discs) {
            if (qtyOrdered < 20) {
                if (disc != null) {
                    itemsInCart[qtyOrdered++] = disc;
                    System.out.println("The disc \"" + disc.getTitle() + "\" has been added.");
                }
            } else {
                System.out.println("The cart is full. Cannot add disc: " + disc.getTitle());
                // Dừng vòng lặp vì giỏ hàng đã đầy
                break; 
            }
        }
    }
    public void print(){
        System.out.println("== THE CURRENT CART ====");
    if (qtyOrdered == 0){
        System.out.println("The cart is empty.");
        System.out.println("========================");
        return;
    }
    System.out.println("Total items: " + qtyOrdered);
    double subtotal = 0.0;
    for (int i = 0; i < qtyOrdered; i++){
        DigitalVideoDisc item = itemsInCart[i];
        System.out.println((i + 1) + ". " + item.toString());
        subtotal += item.getCost();
    }
    System.out.printf("Subtotal: %.2f $\n", subtotal);
    System.out.println("========================");
    }
}
