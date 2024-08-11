import com.sn.dao.AccountsDAO;
import com.sn.dao.AccountsDAOI;
import com.sn.service.CheckBalance;
import com.sn.service.DepositeService;
import com.sn.service.TAService;
import com.sn.service.WithdrawService;

public class TAServiceTestCase {
   public static void main(String[] args) {
     AccountsDAO ado = new AccountsDAO();
     CheckBalance cb = new CheckBalance(ado);

     DepositeService ds = new DepositeService(ado);
     WithdrawService ws = new WithdrawService(ado, cb);

     TAService ts = new TAService(ds, ws);

     ts.transferAmount(101, 102, 4000);
   }
}