import java.util.Scanner;

public class Train06 {

    public static void main(String[] args) {
        System.out.println("请输入一个需要加密的数字的个数：");

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入加密的第" + (i + 1) + "个数字");
            int number = scanner.nextInt();
            arr[i] = number;
        }

        printArray(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }
}
