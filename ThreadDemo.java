
public class ThreadDemo {
    public static void main(String[] args) {
        var t1 = new Simplethread("dhcntt15b");
        t1.start();

        var t2 = new Simplethread("dhcntt15a");
        t2.start();
    }
}