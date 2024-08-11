public class A {
    private B b;   //b is the object of B which default value is null
    public A(){ }
    public A(B b){
        this.b = b;
    }
    public void displayBalance(int accNo){
        double balance = b.getBalance(accNo);
        System.out.println("Available balance is: " +balance);
    }
    
    public void displayName(int accNo){
        String name = b.getName(accNo);
        System.out.println("Account Holder Name: " +name);
    }
}
