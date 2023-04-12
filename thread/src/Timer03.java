import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer03 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行 AAA：" + new Date());
                System.out.println(10 / 0);
            }
        }, 0, 1000);

//        A 任务死掉导致 B 任务无法执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行 BBB：" + new Date());
            }
        }, 0, 1000);
    }
}
