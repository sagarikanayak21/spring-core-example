import java.util.*;

public class CollectionBean{
    private List<String> names;
    public CollectionBean(List<String> names){
        this.names = names;
    }
    public void displayNames(){
        for(String name:names){
            System.out.println(name);
        }
    }
}