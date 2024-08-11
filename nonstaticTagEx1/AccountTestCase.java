import org.springframework.context.*;
import org.springframework.context.support.*;

public class AccountTestCase {
    public static void main(String[] args) {
        // DAOfactory daof = new DAOfactory();
        // AccountDAO acc = daof.getAccountDAO();
        // acc.displayBalance();
        ApplicationContext context = new ClassPathXmlApplicationContext("MyBean.xml");
        AccountDAO acc = context.getBean("acc", AccountDAO.class);
        acc.displayBalance();
    }
}
