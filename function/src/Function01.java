public class Function01 {
    public static void main(String[] args) {
        int targat = sum(10);
        System.out.println(targat);
    }

    public static int sum(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += i;
        }
        return res;
    }
}
