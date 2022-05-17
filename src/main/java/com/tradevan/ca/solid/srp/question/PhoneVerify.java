package com.tradevan.ca.solid.srp.question;

public class PhoneVerify implements Verify {
    @Override
    public boolean hasAccess(User user) {
        if (Math.log10(user.getPhoneNumber()) == 7) {
            return true;
        } else {
            return false;
        }
    }
}
