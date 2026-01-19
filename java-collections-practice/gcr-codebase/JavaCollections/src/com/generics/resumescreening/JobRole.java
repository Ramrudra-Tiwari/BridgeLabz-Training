package com.generics.resumescreening;

// base class for all job roles
public abstract class JobRole {

    protected String roleName;

    public String getRoleName() {
        return roleName;
    }

    // each role has its own screening criteria
    public abstract void screeningCriteria();
}
