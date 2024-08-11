import java.util.Properties;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class MessageBeanTestCase {
    public static void main(String[] args) {
        // Properties p = new Properties();
        // p.setProperty("name","Sagarika");
        // p.setProperty("surname","Nayak");
        // MessageBean mb = new MessageBean(p);
        // mb.displayProperties();

        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        MessageBean mb = (MessageBean) context.getBean("mb");
        mb.displayProperties();
    }
}
