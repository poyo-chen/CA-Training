package com.tradevan.ca.solid.srp.question;

public class SingleResponsibilityDemo {

	// question: 如何修改程式, 當變 hasAccess 方法改為驗證電話號碼, 不會引響到 MailboxSettingsService 程式
	// 預期: 重構後, 當改變 hasAccess 方法改為驗證電話號碼, SingleResponsibilityDemo 的功能不變, 但是不會被改動
	public static void main(String[] args) {
        //step1.將內部內容抽成一個方法去檢查main方法沒有被更動
        SingleResponsibilityDemo singleResponsibilityDemo=new SingleResponsibilityDemo();
        singleResponsibilityDemo.execute();
    }

    public void execute() {
        MailboxSettingsService settingsService = new MailboxSettingsService();
        User user = new User();

        // responsibility #1 of the MailboxSettingsService - change settings in mailbox
        settingsService.changeSecondaryEmail(user, "newemail@email.com");

        // responsibility #2 of the MailboxSettingsService - verify access
        if (settingsService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }

}
