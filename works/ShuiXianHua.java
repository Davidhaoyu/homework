package works;

public class ShuiXianHua {
    public static void main(String[] args) {
        for (int i = 100;i<1000;i++){
            if(isOk(i)) System.out.print(i+" ");
        }
    }

    private static boolean isOk(int n) {
        int i = n;
        int a = i%10;
        i/=10;
        int b = i%10;
        i/=10;
        int c = i%10;
        if(n == Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)) return true;
        return false;
    }
}
