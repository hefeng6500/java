public class String02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";

        System.out.println(s1 == s3); // false
    }
}
