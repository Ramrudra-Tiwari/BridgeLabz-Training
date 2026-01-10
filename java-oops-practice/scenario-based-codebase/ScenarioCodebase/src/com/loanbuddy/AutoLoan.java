package com.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5); // higher interest
    }

    // Polymorphism
    @Override
    public boolean approveLoan() {
        if (basicEligibilityCheck() && applicant.getCreditScore() >= 700) {
            setLoanStatus("APPROVED");
            return true;
        }
        setLoanStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateStandardEMI(1.1); // slightly higher risk
    }
}
