package com.ambulanceroute;

// circular linked list class
public class AmbulanceRouteList {

    private HospitalUnitNode head;

    // add hospital unit at end
    public void addUnit(String name, boolean available) {
        HospitalUnitNode newNode = new HospitalUnitNode(name, available);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        HospitalUnitNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // find nearest available unit
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("No hospital units present");
            return;
        }

        HospitalUnitNode temp = head;
        do {
            if (temp.isAvailable) {
                System.out.println("Patient redirected to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No unit is currently available");
    }

    // remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        HospitalUnitNode curr = head;
        HospitalUnitNode prev = null;

        do {
            if (curr.unitName.equalsIgnoreCase(unitName)) {

                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                if (curr == head) {
                    HospitalUnitNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println(unitName + " removed due to maintenance");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // display hospital route
    public void displayUnits() {
        if (head == null) {
            System.out.println("No units available");
            return;
        }

        HospitalUnitNode temp = head;
        do {
            System.out.println(temp.unitName + " | Available: " + temp.isAvailable);
            temp = temp.next;
        } while (temp != head);
    }
}
