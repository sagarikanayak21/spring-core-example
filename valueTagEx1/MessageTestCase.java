package com.sn.spring;

import org.springframework.context.*;
import org.springframework.context.support.*;

public class MessageTestCase {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        MessageBean mb = (MessageBean) context.getBean("mb");
        mb.printMessage();
    }
}
