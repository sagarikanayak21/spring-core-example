public class A {
    public void displayBalance(int accNo){
        B b = new B();
        double balance = b.getBalance(accNo);
        System.out.println("Available balanace is: " +balance);
    }
    public void displayName(int accNo){
        B b = new B();
        String name = b.getName(accNo);
        System.out.println("Account Holder Name: " +name);
    }
}
