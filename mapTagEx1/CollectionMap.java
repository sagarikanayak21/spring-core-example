import java.util.*;

public class CollectionMap{
    private HashMap<Integer,String> vNames;
    public CollectionMap(HashMap<Integer,String> vNames){
        this.vNames = vNames;
    }
    public void displayVNames(){
        Set s1 = vNames.entrySet();
        System.out.println(s1);
    }
}