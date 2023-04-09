import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
//        1. 继承 Thread 类 定义一个类
        Thread01 thread01 = new Thread01();
        thread01.start();

//        2. 实现 Runnable 接口 定义一个类实现 Runnable 接口，并重写 run()方法
        Thread02 runnable = new Thread02();
        Thread thread = new Thread(runnable);
        thread.start();

//        3. JDK 5.0 新增：实现 Callable 接口 Callable 接口是一个泛型接口

        Thread03 callable = new Thread03();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread thread1 = new Thread(futureTask);
        thread1.start();

        try {
            Integer result = futureTask.get();
            System.out.println("线程执行结果：" + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}