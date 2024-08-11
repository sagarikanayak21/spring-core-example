public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a+"&"+b);
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println(a+"&"+b);
    }
}
