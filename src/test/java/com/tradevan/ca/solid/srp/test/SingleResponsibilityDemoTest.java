package com.tradevan.ca.solid.srp.test;

import com.tradevan.ca.solid.srp.question.SingleResponsibilityDemo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
class SingleResponsibilityDemoTest {

    @Mock
    SingleResponsibilityDemo singleResponsibilityDemo;

    @Test
    void main() {

    }

    @Test
    void test_email_change(){
        singleResponsibilityDemo.execute();
    }


    void test_dollarsAmount_change(){

    }
}