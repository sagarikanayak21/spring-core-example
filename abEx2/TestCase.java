public class TestCase {
    public static void main(String[] args) {
        B b = new B();
        // A a = new A();        //it will through the NPE because b is not initialized
        // a.displayBalance(1001);
        // a.displayName(1001);
        A a = new A(b);
        a.displayBalance(1001);
        a.displayName(1001);
    }
}
