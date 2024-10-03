package minggu3;
import java.util.Scanner;

public class POS {
    public static void main(String[] args) {
        int jumlah, hargaSatuan, uang;
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah barang = ");
        jumlah = sc.nextInt();
        System.out.print("Harga satuan = ");
        hargaSatuan = sc.nextInt();
        int hargaTotal = jumlah*hargaSatuan;
        System.out.println("---------------------");
        System.out.println("Harga total = "+hargaTotal);
        System.out.print("Jumlah uang = ");
        uang = sc.nextInt();
        int kembalian = uang-hargaTotal;
        System.out.println("------------------------");
        System.out.println("Kembalian = "+kembalian);
    }
}
