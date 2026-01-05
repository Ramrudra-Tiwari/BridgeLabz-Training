package com.linkedlist.circularlinkedlist.taskscheduler;

// Main class to test task scheduler
public class TaskSchedulerMain {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Submit Assignment", "High", "05-Jan");
        scheduler.addAtEnd(2, "Practice DSA", "Medium", "06-Jan");
        scheduler.addAtBeginning(3, "Attend Training", "High", "04-Jan");

        scheduler.displayTasks();

        scheduler.viewNextTask();
        scheduler.viewNextTask();

        scheduler.searchByPriority("High");

        scheduler.removeTask(2);
        scheduler.displayTasks();
    }
}
