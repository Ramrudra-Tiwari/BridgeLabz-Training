package com.traincompanion;

public class Train {

    private Compartment head;
    private Compartment current;

    // add compartment at end
    public void addCompartment(String name) {

        Compartment newCompartment = new Compartment(name);

        if (head == null) {
            head = newCompartment;
            current = head;
            return;
        }

        Compartment temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newCompartment;
        newCompartment.prev = temp;
    }

    // move to next compartment
    public void moveNext() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No next compartment.");
        }
    }

    // move to previous compartment
    public void movePrevious() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Moved to: " + current.name);
        } else {
            System.out.println("No previous compartment.");
        }
    }

    // remove current compartment
    public void removeCurrent() {

        if (current == null) {
            System.out.println("No compartment to remove.");
            return;
        }

        System.out.println("Removing: " + current.name);

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
            current = current.next;
        } else {
            current = current.prev;
        }
    }

    // show adjacent compartments
    public void showAdjacent() {

        if (current == null) {
            System.out.println("No compartment available.");
            return;
        }

        System.out.println("Current: " + current.name);
        System.out.println("Previous: " +
                (current.prev != null ? current.prev.name : "None"));
        System.out.println("Next: " +
                (current.next != null ? current.next.name : "None"));
    }

    // display full train
    public void showAll() {

        if (head == null) {
            System.out.println("Train has no compartments.");
            return;
        }

        Compartment temp = head;
        System.out.print("Train: ");

        while (temp != null) {
            if (temp == current) {
                System.out.print("[" + temp.name + "] ");
            } else {
                System.out.print(temp.name + " ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
