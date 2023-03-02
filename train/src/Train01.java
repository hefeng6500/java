import java.util.Scanner;

public class Train01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入机票价格：");
        int price = scanner.nextInt();

        System.out.println("请输入月份,输入范围 1 - 12 之间：");
        int month = scanner.nextInt();

        System.out.println("请选择头等舱或经济舱");
        String type = scanner.next();


        double result = calc(price, month, type);
        System.out.println("机票的价格为：" + result);
    }

    public static double calc(int price, int month, String type) {
        double result = -1;

        if (month >= 1 && month <= 12) {
            switch(type) {
                case "头等舱":
                    result = price * 0.9;
                    break;
                case "经济舱":
                    result = price * 0.85;
                    break;
                default:
                    System.out.println("您输入的舱位类型有误！");
            }

        } else if(month == 11 || month == 12 || (month >= 1 && month <= 4)) {
            switch(type) {
                case "头等舱":
                    result = price * 0.7;
                    break;
                case "经济舱":
                    result = price * 0.65;
                    break;
                default:
                    System.out.println("您输入的舱位类型有误！");
            }
        }else {
            System.out.println("您输入的月份有误！");
        }

        return result;
    }
}