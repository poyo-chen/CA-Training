package com.tradevan.ca.solid.srp.test;

import com.tradevan.ca.solid.srp.question.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

//@ExtendWith(MockitoExtension.class)
class SingleResponsibilityDemoTest {

    SingleResponsibilityDemo singleResponsibilityDemo=new SingleResponsibilityDemo();
    MailboxSettingsService settingsService;

    Verify roleVerify = new RoleVerify();

    Verify phoneVerify=new PhoneVerify();

    @Test
    void main() {

    }

    @Test
    void test_role_changeMail_sendMoney() {
        settingsService = new MailboxSettingsService(roleVerify);
        User user = new User();
        user.setRole(Role.ADMIN);
        user.setSecondaryEmail("oldemail@email.com");
        user.setPhoneNumber(0);
        user.setDollarsAmount(1000);
//        settingsService.changeSecondaryEmail(user, "newemail@email.com");


        assertAll(
                () -> assertEquals(user.getSecondaryEmail(), "newemail@email.com"),
                () -> assertTrue(roleVerify.hasAccess(user)),
                () -> assertEquals(user.getDollarsAmount(), 0)
        );
    }

    @Test
    void test_role_not_changeMail_sendMoney() {
        settingsService = new MailboxSettingsService(roleVerify);
        User user = new User();
        user.setRole(Role.MANAGER);
        user.setSecondaryEmail("oldemail@email.com");
        user.setDollarsAmount(1000);
        user.setPhoneNumber(0);
//        settingsService.changeSecondaryEmail(user, "newemail@email.com");


        assertAll(
                () -> assertEquals(user.getSecondaryEmail(), "oldemail@email.com"),
                () -> assertFalse(roleVerify.hasAccess(user)),
                () -> assertEquals(user.getDollarsAmount(), 1000)
        );
    }

    @Test
    void test_phone_changeMail_sendMoney() {

        settingsService = new MailboxSettingsService(phoneVerify);
        User user = new User();
        user.setRole(Role.ADMIN);
        user.setSecondaryEmail("oldemail@email.com");
        user.setDollarsAmount(1000);
        user.setPhoneNumber(2223456);
//        settingsService.changeSecondaryEmail(user, "newemail@email.com");

        assertAll(
                () -> assertEquals(user.getSecondaryEmail(), "newemail@email.com"),
                () -> assertTrue(phoneVerify.hasAccess(user)),
                () -> assertEquals(user.getDollarsAmount(), 0)
        );
    }

    @Test
    void test_phone_not_changeMail_sendMoney() {
        settingsService = new MailboxSettingsService(phoneVerify);
        User user = new User();
        user.setRole(Role.ADMIN);
        user.setSecondaryEmail("oldemail@email.com");
        user.setDollarsAmount(1000);
        user.setPhoneNumber(0);
//        settingsService.changeSecondaryEmail(user, "newemail@email.com");
        String[] s={};
        singleResponsibilityDemo.main(s);
        assertAll(
                () -> assertEquals(user.getSecondaryEmail(), "oldemail@email.com"),
                () -> assertFalse(phoneVerify.hasAccess(user)),
                () -> assertEquals(user.getDollarsAmount(), 1000)
        );
    }
}