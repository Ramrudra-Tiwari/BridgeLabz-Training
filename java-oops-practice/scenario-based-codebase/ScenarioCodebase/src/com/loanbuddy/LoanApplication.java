package com.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term;            // months
    protected double interestRate; // annual %

    private String loanStatus;     // only internal changes allowed

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.loanStatus = "PENDING";
    }

    // Encapsulated approval logic
    protected boolean basicEligibilityCheck() {
        return applicant.getCreditScore() >= 650 &&
               applicant.getIncome() >= (applicant.getLoanAmount() / 2);
    }

    protected void setLoanStatus(String status) {
        this.loanStatus = status;
    }

    public String getLoanStatus() {
        return loanStatus;
    }

    // EMI Formula:
    // P × R × (1+R)^N / ((1+R)^N – 1)
    protected double calculateStandardEMI(double rateMultiplier) {

        double P = applicant.getLoanAmount();
        double R = (interestRate / 12 / 100) * rateMultiplier;
        int N = term;

        double emi = (P * R * Math.pow(1 + R, N)) /
                     (Math.pow(1 + R, N) - 1);

        return emi;
    }
}
