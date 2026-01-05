package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

// Creating an Linked list class for inventory operations
public class InventoryLinkedList {

    private ItemNode head; // head of the linked list

    // add item at beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // add item at end
    public void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);

        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // remove item using item id
    public void removeById(int id) {

        if (head == null) {
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // update item quantity
    public void updateQuantity(int id, int newQuantity) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    // search item by id
    public void searchById(int id) {
        ItemNode temp = head;

        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println("Item Found: " + temp.itemName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // display all inventory items
    public void displayInventory() {
        ItemNode temp = head;

        System.out.println("ID | Name | Qty | Price");
        while (temp != null) {
            System.out.println(
                    temp.itemId + " | " +
                    temp.itemName + " | " +
                    temp.quantity + " | " +
                    temp.price
            );
            temp = temp.next;
        }
    }

    // calculate total inventory value
    public void calculateTotalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }
}
