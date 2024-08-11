import org.springframework.context.*;
import org.springframework.context.support.*;

public class TestCase {
    public static void main(String[] args) {
        // A a = new A();
        // B b = new B();
        // b.setA(a);
        // b.display();
        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        B b = context.getBean("b",B.class);
        b.display();
    }
}