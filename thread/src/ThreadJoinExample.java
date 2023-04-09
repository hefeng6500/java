public class ThreadJoinExample extends Thread {
    public void run() {
        System.out.println("子线程开始执行");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程执行完毕");
    }
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinExample thread = new ThreadJoinExample();
        thread.start();
        System.out.println("主线程开始执行");
        thread.join();
        System.out.println("主线程执行完毕");
    }
}
