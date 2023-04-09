import java.util.concurrent.Callable;

public class Thread03 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Hello World!");
        return 1;
    }
}
