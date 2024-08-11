import java.util.Properties;

public class MessageBean{
    private Properties p;
    public MessageBean(Properties p){
        this.p = p;
    }
    public void displayProperties(){
        System.out.println(p.getProperty("name"));
        System.out.println(p.getProperty("surname"));
    }
}