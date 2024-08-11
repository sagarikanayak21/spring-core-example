import org.springframework.context.*;
import org.springframework.context.support.*;

public class MyBeanTestCase {
    public static void main(String[] args) {
        // MyBean b = MyBean.getMyBean();
        // b.display();
        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        MyBean mb = context.getBean("mb", MyBean.class);
        mb.display();
    }
}
