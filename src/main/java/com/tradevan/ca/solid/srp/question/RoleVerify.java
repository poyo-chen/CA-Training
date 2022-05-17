package com.tradevan.ca.solid.srp.question;

public class RoleVerify implements Verify{
    @Override
    public boolean hasAccess(User user) {
        if (user.getRole() == Role.ADMIN) {
            return true;
        } else {
            return false;
        }
    }
}
