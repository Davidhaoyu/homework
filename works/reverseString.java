package works;

public class reverseString {
    public static void main(String[] args) {
        String s = "Hello";
        reverseString(s);
    }

    private static void reverseString(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        for (int i = 0; i < n / 2; i++) {
            char t = chars[i];
            chars[i] = chars[n-i-1];
            chars[n-i-1] = t;
        }
        s = String.valueOf(chars);
        System.out.println(s);
    }
}
