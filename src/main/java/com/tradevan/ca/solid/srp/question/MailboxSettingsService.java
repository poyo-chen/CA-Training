package com.tradevan.ca.solid.srp.question;

public class MailboxSettingsService {

    private Verify verify;

    public MailboxSettingsService(Verify verify) {
        this.verify = verify;
    }

    public void changeSecondaryEmail(User user, String newSecondaryEmail) {
        if (verify.hasAccess(user)) {
            user.setSecondaryEmail(newSecondaryEmail);
        }
    }
}


