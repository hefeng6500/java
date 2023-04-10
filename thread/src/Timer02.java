import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer02 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行 AAA：" + new Date());
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 1000);

//        A 任务 sleep 导致 B 任务执行延后
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行 BBB：" + new Date());
            }
        }, 0, 1000);
    }
}
