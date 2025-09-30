package minggu10;
import java.util.Scanner;

public class PemesananKafe {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Jumlah pesanan: ");
        n = sc.nextInt();
        String[] menu = new String[n];
        int[] harga = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("menu "+(i+1)+": ");
            menu[i]=sc2.nextLine();
            System.out.print("harga "+(i+1)+": ");
            harga[i]=sc.nextInt();
        }
        int total=0;
        for(int i=0;i<harga.length;i++){
            total += harga[i];
        }
        System.out.println("Total = "+total);
        for(int i=0;i<harga.length;i++){
            System.out.println("menu "+(i+1)+": "+menu[i]);
            System.out.println("harga "+(i+1)+": "+harga[i]);
        }
    }
}
