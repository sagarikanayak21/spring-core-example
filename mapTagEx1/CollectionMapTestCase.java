import java.util.HashMap;
import java.util.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class CollectionMapTestCase {
    public static void main(String[] args) {
        // HashMap m = new HashMap();
        // m.put(1,"Potato");
        // m.put(2,"Tomato");
        // m.put(3,"Carrot");
        // m.put(4,"Potato");
        // m.put(5,"Brinjal");

        // CollectionMap cm = new CollectionMap(m);
        // cm.displayVNames();

        ApplicationContext context = new ClassPathXmlApplicationContext("MyBeans.xml");
        CollectionMap cb = context.getBean("cm",CollectionMap.class);   //type safe
        cb.displayVNames();
    }
}
