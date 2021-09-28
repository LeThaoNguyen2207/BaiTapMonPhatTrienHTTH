public class SimpleThread1 extends Thread{
    private String threadName;
    private Thread t;

    SimpleThread(String name) {
        threadName = name;
        System.out.println("Dang tao " + threadName);
        // start();
    }

    @Override
    public void run() {
        System.out.println(threadName + " dang chay");
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println(threadName + " , " + i);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(threadName + " tam ngung");

    }

    public void start() {
        System.out.println("bat dau luong " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            start();
        }
    }

}
