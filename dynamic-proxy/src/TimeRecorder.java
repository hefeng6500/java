import java.util.HashMap;
import java.util.Map;

public class TimeRecorder {
    private Map<String, Long> times = new HashMap<>();

    public void recordTime(String method, long time) {
        times.put(method, time);
    }

    public void printTimes() {
        System.out.println("Method\tTime (ms)");
        for (Map.Entry<String, Long> entry : times.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}
