public class MyBean{
    private static MyBean mb;
    private MyBean(){}
    public static MyBean getMyBean(){
        if(mb==null){
            mb = new MyBean();
        }
        return mb;
    }
    public void display(){
        System.out.println("Hello Sagarika");
    }
}