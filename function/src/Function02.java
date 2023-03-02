public class Function02 {
    public static void main(String[] args) {
        fire();
        fire("日本");
        fire("日本", 10);
    }

    public static void fire(){
        System.out.println("默认发射一枚武器给美国！");
    }

    public static void fire(String location){
        System.out.println("给" + location + "发射一枚武器！");
    }

    public static  void fire(String location, int count) {
        System.out.println("给" + location + "发射" + count + "枚武器！");
    }
}
