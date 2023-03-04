import java.util.Scanner;

public class Train05 {
    public static void main(String[] args) {
        int[] scores = new int[6];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("请输入第" + i + "个评委的打分：");

            int score = scanner.nextInt();
            scores[i] = score;
        }

        int max = scores[0];
        int min = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max) {
                max = scores[i];
            }
            if(scores[i] < min) {
                min = scores[i];
            }

            sum += scores[i];
        }

        double result = (sum - max - min) * 1.0 / (scores.length - 2);

        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);

        System.out.println("平均分是： " + result);
    }
}
