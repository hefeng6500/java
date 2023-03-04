public class Train04 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[arr1.length];

        copy(arr1, arr2);

        printArray(arr2);

    }

    public static void  copy(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
        }
        System.out.println("]");
    }


}
