import org.apache.log4j.*;
import org.apache.log4j.SimpleLayout;


public class Calculator {
    Logger log = Logger.getLogger(Calculator.class);
    // PropertyConfigurator.configure("log4j.properties");
    SimpleLayout layout = new SimpleLayout();
    ConsoleAppender appender  = new ConsoleAppender(layout);
    log.addAppender();
   
    // private static Log log = LogFactory.getLog(Calculator.class);
   public static void main(String[] args) {
     Calculator c = new Calculator();
     c.add(10, 0);
   }
    public int add(int i, int j){
        log.error("qqqqqqqqqqqq");
        log.info(j);
        return i;
    }
}
