public class Train02 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {

            boolean flag = false;

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.print(i + "\t");
            }
        }
    }
}
