
package com.annotationsreflection.annotations.rolebasedannotation;

@RoleAllowed("ADMIN")
public class AdminService {

    public void deleteUser() {
        System.out.println("User deleted!");
    }
}