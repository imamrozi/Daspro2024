package minggu3;

import java.math.BigDecimal;
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        float diskon = 10/100f;
        double diskon2 = 0.1;
        double harga = 150000;
        BigDecimal bd = new BigDecimal(0.1);
        System.out.println(diskon*harga);
        System.out.println(diskon2*harga);

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        char karakter = data.charAt(0);
        char kelas = sc.nextLine().charAt(0);
    }
}
