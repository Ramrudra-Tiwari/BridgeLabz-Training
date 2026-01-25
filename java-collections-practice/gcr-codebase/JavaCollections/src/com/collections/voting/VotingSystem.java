package com.collections.voting;

import java.util.*;

public class VotingSystem {

    private HashMap<String, Integer> voteMap = new HashMap<>();
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>();

    public void castVote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.getOrDefault(candidate, 0) + 1);
        System.out.println("Vote casted for: " + candidate);
    }

    public void showVotingOrder() {
        System.out.println("Voting Order:");
        System.out.println(voteOrder);
    }

    public void showSortedResult() {
        TreeMap<String, Integer> sorted = new TreeMap<>(voteMap);
        System.out.println("Sorted Result:");
        System.out.println(sorted);
    }
}
