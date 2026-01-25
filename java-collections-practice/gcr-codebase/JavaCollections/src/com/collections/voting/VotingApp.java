package com.collections.voting;

import java.util.Scanner;

public class VotingApp {

    public static void main(String[] args) {

        VotingSystem voting = new VotingSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Voting System ---");
            System.out.println("1. Cast Vote");
            System.out.println("2. Show Voting Order");
            System.out.println("3. Show Sorted Result");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Candidate Name: ");
                    voting.castVote(sc.nextLine());
                    break;
                case 2:
                    voting.showVotingOrder();
                    break;
                case 3:
                    voting.showSortedResult();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
