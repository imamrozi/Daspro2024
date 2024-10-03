package minggu3;
import java.util.Scanner;

public class Tegangan {
    public static void main(String[] args) {
        int r1, r2, r3, r4, i;
        Scanner sc = new Scanner(System.in);
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        r3 = sc.nextInt();
        r4 = sc.nextInt();
        i = sc.nextInt();
        double rp = 1/((1.0/r1)+(1.0/r2)+(1.0/r3));
        System.out.println(rp);
        double v = i*(rp+r4);
        System.out.println(v);
    }
}
