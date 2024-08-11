import com.sn.service.TAService;
import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.support.*;
import org.springframework.core.io.*;

import org.springframework.context.*;
import  org.springframework.context.support.*;

public class TAServiceTestCaseInSpring {
   public static void main(String[] args) {

    // AccountsDAO ado = new AccountsDAO();
    // CheckBalance cb = new CheckBalance(ado);
    // DepositeService ds = new DepositeService(ado);
    // WithdrawService ws = new WithdrawService(ado, cb);

    // TAService ts = new TAService(ds, ws);

    ApplicationContext context= new ClassPathXmlApplicationContext("mybeans.xml");
    TAService ts = (TAService) context.getBean("ts");
    ts.transferAmount(101, 102, 4000);
  }
}