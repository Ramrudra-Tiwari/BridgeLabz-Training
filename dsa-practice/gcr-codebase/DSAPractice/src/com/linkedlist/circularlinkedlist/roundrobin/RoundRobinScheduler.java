package com.linkedlist.circularlinkedlist.roundrobin;

// Circular linked list based round robin scheduler
public class RoundRobinScheduler {

    private ProcessNode head;
    private ProcessNode tail;
    private int totalProcesses = 0;
    private int totalWaitingTime = 0;
    private int totalTurnAroundTime = 0;

    // Add process at end of this 
    public void addProcess(int pid, int burstTime, int priority) {

        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        totalProcesses++;
    }

    // Simulate round robin scheduling
    public void schedule(int timeQuantum) {

        if (head == null) {
            System.out.println("No processes available");
            return;
        }

        ProcessNode current = head;
        int currentTime = 0;

        while (head != null) {

            displayQueue();

            if (current.remainingTime > timeQuantum) {
                current.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += current.remainingTime;
                totalTurnAroundTime += currentTime;
                totalWaitingTime += (currentTime - current.burstTime);
                int pidToRemove = current.pid;
                current = current.next;
                removeProcess(pidToRemove);
                continue;
            }

            current = current.next;
        }

        printAverageTimes();
    }

    // Remove process after completion
    private void removeProcess(int pid) {

        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        do {
            if (curr.pid == pid) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = curr.next;
                    if (curr == tail) tail = prev;
                }
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);
    }

    // Display circular queue
    private void displayQueue() {

        if (head == null) return;

        ProcessNode temp = head;
        System.out.print("Queue: ");

        do {
            System.out.print("[P" + temp.pid + " RT:" + temp.remainingTime + "] ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    // Print average waiting and turnaround time
    private void printAverageTimes() {

        System.out.println("Average Waiting Time: " + (totalWaitingTime / totalProcesses));
        System.out.println("Average Turn Around Time: " + (totalTurnAroundTime / totalProcesses));
    }
}
