package com.linkedlist.singlylinkedlist;

import java.util.Scanner;

//Creating  Node class
class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNo, String name, int age, char grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

// Using Linked List operations
class StudentLinkedList {
    private Student head;

    // Add at beginning
    public void addAtBeginning(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("Student added at beginning");
    }

    // Add at end
    public void addAtEnd(int rollNo, String name, int age, char grade) {
        Student newNode = new Student(rollNo, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        Student temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Student added at end");
    }

    // Delete by roll number
    public void deleteByRollNo(int rollNo) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.rollNo == rollNo) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }

        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    // Search student
    public void searchStudent(int rollNo) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Student Found:");
                System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    public void updateGrade(int rollNo, char newGrade) {
        Student temp = head;

        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all records
    public void display() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }

        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}

// Main class
public class StudentLinkedListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        int choice;

        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Delete by Roll No");
            System.out.println("4. Search Student");
            System.out.println("5. Update Grade");
            System.out.println("6. Display All");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Roll No: ");
                    int roll = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Grade: ");
                    char grade = sc.next().charAt(0);

                    if (choice == 1)
                        list.addAtBeginning(roll, name, age, grade);
                    else
                        list.addAtEnd(roll, name, age, grade);
                    break;

                case 3:
                    System.out.print("Enter Roll No to delete: ");
                    list.deleteByRollNo(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Roll No to search: ");
                    list.searchStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.print("Roll No: ");
                    int r = sc.nextInt();
                    System.out.print("New Grade: ");
                    char g = sc.next().charAt(0);
                    list.updateGrade(r, g);
                    break;

                case 6:
                    list.display();
                    break;

                case 7:
                    System.out.println("Program exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);

        sc.close();
    }
}
