package com.st.spring;

// import org.springframework.context.support.*;
// import com.st.spring.NumberBean;
// import org.springframework.context.*;

public class NumberBeanTestCase{
    public static void main(String[] args){
        // NumberBean nb = new NumberBean(10, 20.5);
        // nb.setValue();
        // nb.addValue();

        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        NumberBean nb = (NumberBean) context.getBean("nb");
        nb.setValue();
        double add = nb.addValue();
        System.out.println("Addition result is: " +add);
    }
}