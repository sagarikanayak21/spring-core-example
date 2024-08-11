import java.util.ArrayList;
import java.util.*;
import org.springframework.context.*;
import org.springframework.context.support.*;


public class CollectionBeanTestCase {
    public static void main(String[] args) {
        // List<String> list = new ArrayList<>();
        // list.add("Apple");
        // list.add("Mango");
        // list.add("Banana");
        // list.add("Pineapple");
        // list.add("Cocunut");
        // CollectionBean cb = new CollectionBean(list);
        // cb.displayNames();
        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        CollectionBean cb = context.getBean("cb",CollectionBean.class);
        cb.displayNames();
    }
}
