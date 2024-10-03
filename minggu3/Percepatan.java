package minggu3;
import java.util.Scanner;

public class Percepatan {
    public static void main(String[] args) {
        double V0, Vt;
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.print("V0 = ");
        V0 = sc.nextDouble();
        System.out.print("Vt = ");
        Vt = sc.nextDouble();
        System.out.print("t = ");
        t = sc.nextInt();
        //Vt = V0+at
        double a = (Vt-V0)/t;
        System.out.println("a = "+a);
    }
}
