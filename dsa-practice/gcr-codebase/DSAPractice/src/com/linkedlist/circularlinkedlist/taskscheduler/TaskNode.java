package com.linkedlist.circularlinkedlist.taskscheduler;

// Node class for task
public class TaskNode {

    int taskId;
    String taskName;
    String priority;
    String dueDate;
    TaskNode next;

    // Constructor to initialize task
    public TaskNode(int taskId, String taskName, String priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
