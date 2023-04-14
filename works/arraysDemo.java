package works;

import java.util.Scanner;

public class arraysDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("请输入10个数");
        for (int i = 0;i<10;i++){
            n[i] = sc.nextInt();
            max = Math.max(max,n[i]);
            min = Math.min(min,n[i]);
        }
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
        System.out.println("最小值和最大值之和:"+(max+min));
    }
}
