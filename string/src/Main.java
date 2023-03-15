import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sysLoginName = "itheima";
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入您的登录名称");

        String loginName = sc.next();
        System.out.println(sysLoginName == loginName);
    }
}