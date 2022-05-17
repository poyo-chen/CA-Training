package com.tradevan.ca.solid.srp.question;

public class SingleResponsibilityDemo {

    // question: 如何修改程式, 當變 hasAccess 方法改為驗證電話號碼, 不會引響到 MailboxSettingsService 程式
    // 預期: 重構後, 當改變 hasAccess 方法改為驗證電話號碼, SingleResponsibilityDemo 的功能不變, 但是不會被改動
    public static void main(String[] args) {
        Verify verify = new PhoneVerify();
        MailboxSettingsService settingsService = new MailboxSettingsService(verify);
        User user = new User();

        // responsibility #1 of the MailboxSettingsService - change settings in mailbox
        settingsService.changeSecondaryEmail(user, "newemail@email.com");

        // responsibility #2 of the MailboxSettingsService - verify access
        if (verify.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }

}
