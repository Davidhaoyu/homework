package works;

public class showTriangle {
    public static void main(String[] args) {
        showTriangle(4);
    }

    private static void showTriangle(int n) {
        for (int i = 0;i<n;i++){
            for (int j = n;j>i;j--) {
                System.out.print(" ");
            }
            for (int j = 0;j<=i;j++)
                System.out.print("*");
            for (int j = 0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
