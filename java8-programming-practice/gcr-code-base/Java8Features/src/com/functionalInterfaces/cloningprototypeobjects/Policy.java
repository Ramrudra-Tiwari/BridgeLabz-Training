package com.functionalInterfaces.cloningprototypeobjects;

public class Policy implements Cloneable {   // <-- java.lang.Cloneable

    int policyId;
    String policyHolder;

    public Policy(int policyId, String policyHolder) {
        this.policyId = policyId;
        this.policyHolder = policyHolder;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
