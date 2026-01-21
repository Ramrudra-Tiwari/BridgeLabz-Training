package com.collections;

import java.time.LocalDate;
import java.util.*;

/* Policy class */
class Policy implements Comparable<Policy> {

    String policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // HashSet & LinkedHashSet uniqueness (based on policy number)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    // TreeSet sorting by expiry date
    @Override
    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | "
                + expiryDate + " | " + coverageType + " | ₹" + premiumAmount;
    }
}

public class InsurancePolicyManagement {

    // Sets
    static Set<Policy> hashSet = new HashSet<>();
    static Set<Policy> linkedHashSet = new LinkedHashSet<>();
    static Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    static void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // Display all policies
    static void displayAllPolicies(Set<Policy> set, String title) {
        System.out.println("\n" + title);
        for (Policy p : set) {
            System.out.println(p);
        }
    }

    // Policies expiring within next 30 days
    static void policiesExpiringSoon(Set<Policy> set) {
        System.out.println("\nPolicies expiring within 30 days:");
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for (Policy p : set) {
            if (!p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // Policies by coverage type
    static void policiesByCoverage(Set<Policy> set, String coverage) {
        System.out.println("\nPolicies with coverage type: " + coverage);
        for (Policy p : set) {
            if (p.coverageType.equalsIgnoreCase(coverage)) {
                System.out.println(p);
            }
        }
    }

    // Find duplicate policies by policy number
    static void findDuplicates(List<Policy> list) {
        System.out.println("\nDuplicate Policies:");
        Set<String> seen = new HashSet<>();
        for (Policy p : list) {
            if (!seen.add(p.policyNumber)) {
                System.out.println(p);
            }
        }
    }

    // Performance comparison
    static void performanceTest(Set<Policy> set, Policy testPolicy) {

        long start, end;

        // Add
        start = System.nanoTime();
        set.add(testPolicy);
        end = System.nanoTime();
        System.out.println("Add Time: " + (end - start) + " ns");

        // Search
        start = System.nanoTime();
        set.contains(testPolicy);
        end = System.nanoTime();
        System.out.println("Search Time: " + (end - start) + " ns");

        // Remove
        start = System.nanoTime();
        set.remove(testPolicy);
        end = System.nanoTime();
        System.out.println("Remove Time: " + (end - start) + " ns");
    }

    // Main
    public static void main(String[] args) {

        Policy p1 = new Policy("P101", "Alice",
                LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P102", "Bob",
                LocalDate.now().plusDays(40), "Auto", 7000);
        Policy p3 = new Policy("P103", "Carol",
                LocalDate.now().plusDays(20), "Health", 6000);
        Policy p4 = new Policy("P101", "Alice Duplicate",
                LocalDate.now().plusDays(15), "Health", 5000);

        // Add policies
        addPolicy(p1);
        addPolicy(p2);
        addPolicy(p3);
        addPolicy(p4); // duplicate

        // Display
        displayAllPolicies(hashSet, "HashSet (Fast Lookup)");
        displayAllPolicies(linkedHashSet, "LinkedHashSet (Insertion Order)");
        displayAllPolicies(treeSet, "TreeSet (Sorted by Expiry)");

        // Retrieval
        policiesExpiringSoon(hashSet);
        policiesByCoverage(hashSet, "Health");

        // Duplicate detection
        findDuplicates(Arrays.asList(p1, p2, p3, p4));

        // Performance comparison
        System.out.println("\nPerformance Comparison:");
        Policy test = new Policy("PX", "Test",
                LocalDate.now().plusDays(60), "Home", 8000);

        System.out.println("\nHashSet:");
        performanceTest(new HashSet<>(hashSet), test);

        System.out.println("\nLinkedHashSet:");
        performanceTest(new LinkedHashSet<>(linkedHashSet), test);

        System.out.println("\nTreeSet:");
        performanceTest(new TreeSet<>(treeSet), test);
    }
}
