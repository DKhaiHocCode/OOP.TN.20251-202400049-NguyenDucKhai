package com.hust.kstn;

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

    public void print(){
        System.out.println("=== Total item in cart: " + qtyOrdered + " ===");
        System.out.println("=== All item is cart ===");
        for(DigitalVideoDisc item: itemsInCart){
            if(item != null){
                System.out.println("[Title]: " + item.getTitle() + ", " + "[Cost]: "+ item.getCost());
            }
        }
    }
}
