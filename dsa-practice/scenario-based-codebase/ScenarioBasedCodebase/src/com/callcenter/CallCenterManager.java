package com.callcenter;

import java.util.*;

public class CallCenterManager {

    // normal customer queue
    private Queue<CustomerCall> normalQueue;

    // vip customer priority queue
    private PriorityQueue<CustomerCall> vipQueue;

    // customer call count
    private HashMap<String, Integer> callCountMap;

    public CallCenterManager() {
        normalQueue = new LinkedList<>();
        vipQueue = new PriorityQueue<>(new Comparator<CustomerCall>() {
            public int compare(CustomerCall c1, CustomerCall c2) {
                return 0; // all VIP treated equally
            }
        });
        callCountMap = new HashMap<>();
    }

    // add normal customer call
    public void addNormalCall(String customerId) {
        normalQueue.add(new CustomerCall(customerId, false));
        updateCallCount(customerId);
    }

    // add vip customer call
    public void addVipCall(String customerId) {
        vipQueue.add(new CustomerCall(customerId, true));
        updateCallCount(customerId);
    }

    // handle next call
    public void handleNextCall() {

        if (!vipQueue.isEmpty()) {
            CustomerCall call = vipQueue.poll();
            System.out.println("Handling VIP customer: " + call.customerId);
        } 
        else if (!normalQueue.isEmpty()) {
            CustomerCall call = normalQueue.poll();
            System.out.println("Handling normal customer: " + call.customerId);
        } 
        else {
            System.out.println("No calls in queue.");
        }
    }

    // update customer call count
    private void updateCallCount(String customerId) {
        callCountMap.put(customerId, callCountMap.getOrDefault(customerId, 0) + 1);
    }

    // display call count report
    public void showCallReport() {
        System.out.println("Customer Call Report:");
        for (String key : callCountMap.keySet()) {
            System.out.println(key + " -> " + callCountMap.get(key) + " calls");
        }
    }
}
