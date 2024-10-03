package minggu3;
import java.util.Scanner;

public class TarifListrik {
    public static void main(String[] args) {
        int jumlahPenggunaanListrik, tarif = 1500, totalTagihan;
        boolean statusTagihan;
        //1. INPUT
        Scanner sc = new Scanner(System.in);
        jumlahPenggunaanListrik = sc.nextInt();
        //2. Hitung total tagihan
        totalTagihan = jumlahPenggunaanListrik*tarif;
        statusTagihan = jumlahPenggunaanListrik > 500;
        //3. Output
        System.out.println("Total tagihan = "+totalTagihan);
        System.out.println("Jumlah penggunaan > 500 ? "+statusTagihan);
        sc.close();
    }
    
}
