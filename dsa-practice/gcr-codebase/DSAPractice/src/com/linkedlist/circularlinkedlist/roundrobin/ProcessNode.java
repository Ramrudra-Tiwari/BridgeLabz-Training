package com.linkedlist.circularlinkedlist.roundrobin;

//Creating an  Node class  to representing a process
public class ProcessNode {

    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    ProcessNode next;

    // This is for Constructor to initialize process
    public ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
