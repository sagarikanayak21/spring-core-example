import java.util.*;

public class SetBean{
    private Set<String> names;
    public SetBean(Set<String> names){
        this.names = names;
    }
    public void displayNames(){
        for(String name:names){
            System.out.println(name);
        }
    }
}