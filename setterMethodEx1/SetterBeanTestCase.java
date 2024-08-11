import org.springframework.context.*;
import org.springframework.context.support.*;

public class SetterBeanTestCase {
    public static void main(String[] args) {
        // SetterBean sb = new SetterBean();
        // sb.setX(10);
        // sb.display();
        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        SetterBean sb = context.getBean("sb",SetterBean.class);
        sb.display();
    }
}
