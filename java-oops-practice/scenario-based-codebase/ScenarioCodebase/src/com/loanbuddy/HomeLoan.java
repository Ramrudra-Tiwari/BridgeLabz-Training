package com.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5); // lower interest
    }

    // Polymorphism
    @Override
    public boolean approveLoan() {
        if (basicEligibilityCheck()) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI(1.0); // normal rate
    }
}
