import org.springframework.context.*;
import  org.springframework.context.support.*;

public class TestCase {
    public static void main(String[] args) {
        // B b = new B();
        // A a = new A(b);
        ApplicationContext context= new ClassPathXmlApplicationContext("myBeans.xml");
        A a = (A) context.getBean("a");
        a.displayBalance(1001);
        a.displayName(1001);
    }
}
