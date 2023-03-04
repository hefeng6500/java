import java.util.Random;

public class Train03 {
    public static void main(String[] args) {
        String code = getCode(6);
        System.out.println("验证码：" +  code);
    }

    public static String getCode(int length) {
        String code = "";

        Random random = new Random();

        for (int i = 0; i < length; i++) {
            int type = random.nextInt(3);

            switch (type) {
                case 0:
//                    大写字符：（A 65 - Z 65+25）
                    char ch = (char)(random.nextInt(26) + 65);
                    code += ch;
                    break;
                case 1:
//                    小写字符：（a 97 - z 97+25）
                    char ch1 = (char)(random.nextInt(26) + 97);
                    code += ch1;
                    break;
                case 2:
                    code += random.nextInt(10);
                    break;
            }
        }
        return code;
    }
}
