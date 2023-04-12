import java.util.Timer;
import java.util.TimerTask;

public class Timer01 {
    public static void main(String[] args) {
//        创建定时器
        Timer timer = new Timer();

//        调用方法处理定时任务
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }, 3000, 1000);
    }
}
