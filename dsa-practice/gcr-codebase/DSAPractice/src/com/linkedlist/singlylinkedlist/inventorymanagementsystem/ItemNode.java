package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

// Creating an Node class to store inventory item data
public class ItemNode {

    int itemId;          // item id
    String itemName;     // item name
    int quantity;        // available quantity
    double price;        // price per item
    ItemNode next;       // reference to next node

    // constructor to initialize item details
    public ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
