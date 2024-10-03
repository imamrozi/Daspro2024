package minggu3;
import java.util.Scanner;

public class SegiTiga {
    public static void main(String[] args) {
        int a, t;
        float luas;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        t = sc.nextInt();
        luas = a*t*(float)0.5;
        System.out.println(luas);
    }
}
