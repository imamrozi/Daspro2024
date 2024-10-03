package minggu5;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        int angka = 5;
        String hasil = (angka%2 == 0 ? "angka genap" : "angka ganjil");
        System.out.println(hasil);
        Scanner sc = new Scanner(System.in);
        
        String b = sc.nextLine();
        int a = sc.nextInt();
    }
}
