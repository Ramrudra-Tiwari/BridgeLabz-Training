package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

// Creating an main class to test inventory system
public class InventoryMain {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        // adding items
        inventory.addAtEnd(1, "Laptop", 5, 55000);
        inventory.addAtEnd(2, "Mouse", 20, 500);
        inventory.addAtBeginning(3, "Keyboard", 10, 800);

        // displaying inventory
        inventory.displayInventory();

        // updating quantity
        inventory.updateQuantity(2, 25);
        inventory.displayInventory();

        // searching item
        inventory.searchById(1);

        // removing item
        inventory.removeById(3);
        inventory.displayInventory();

        // calculating total value
        inventory.calculateTotalValue();
    }
}
