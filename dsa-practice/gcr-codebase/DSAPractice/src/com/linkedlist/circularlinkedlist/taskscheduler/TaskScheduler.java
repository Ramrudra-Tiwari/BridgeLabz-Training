package com.linkedlist.circularlinkedlist.taskscheduler;

// Circular linked list implementation
public class TaskScheduler {

    private TaskNode head;
    private TaskNode current;

    // Add task at beginning
    public void addAtBeginning(int id, String name, String priority, String date) {

        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add task at end
    public void addAtEnd(int id, String name, String priority, String date) {

        TaskNode newNode = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove task by task ID
    public void removeTask(int taskId) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode curr = head;
        TaskNode prev = null;

        do {
            if (curr.taskId == taskId) {

                if (curr == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Task removed");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewNextTask() {

        if (current == null) {
            System.out.println("No task available");
            return;
        }

        System.out.println("Current Task: " + current.taskName);
        current = current.next;
    }

    // Display all tasks
    public void displayTasks() {

        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        TaskNode temp = head;
        do {
            System.out.println(
                temp.taskId + " | " +
                temp.taskName + " | " +
                temp.priority + " | " +
                temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    public void searchByPriority(String priority) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                System.out.println(
                    temp.taskId + " | " +
                    temp.taskName + " | " +
                    temp.priority + " | " +
                    temp.dueDate
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with given priority");
        }
    }
}
