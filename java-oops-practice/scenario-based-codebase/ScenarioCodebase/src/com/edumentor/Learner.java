package com.edumentor;

public class Learner extends User implements ICertifiable {

    private boolean fullTime;

    public Learner(String name, String email, int userId, boolean fullTime) {
        super(name, email, userId);
        this.fullTime = fullTime;
    }

    // Polymorphism
    @Override
    public void generateCertificate() {
        if (fullTime) {
            System.out.println("🎓 Full-Time Course Certificate Generated for " + name);
        } else {
            System.out.println("📜 Short Course Certificate Generated for " + name);
        }
    }
}
