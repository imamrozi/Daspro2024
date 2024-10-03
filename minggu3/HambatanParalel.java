package minggu3;
import java.util.Scanner;

public class HambatanParalel {
    public static void main(String[] args) {
        int r1, r2, r3;
        double rtotal;
        Scanner sc = new Scanner(System.in);
        r1 = sc.nextInt();
        r2 = sc.nextInt();
        r3 = sc.nextInt();
        rtotal = 1/((1.0/r1)+(1.0/r2)+(1.0/r3));
        System.out.println(rtotal);
    }
}
