package works;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isOk(num);
    }

    private static void isOk(int num) {
        boolean flag = true;
        char[] s = String.valueOf(num).toCharArray();
        for(int i = 0;i<s.length;i++){
            if(s[i] != s[s.length-1-i]) {
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("是的");
        }else {
            System.out.println("不是");
        }
    }
}
