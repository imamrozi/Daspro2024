package minggu5;

import java.util.Scanner;

public class Kafe {
    public static void main(String[] args) {
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;
        double hargaMenu=0, totalHarga, diskon,nominalBayar;

        Scanner input1 = new Scanner(System.in);
        System.out.print("Input menu: ");System.out.print("Ukuran cup:");
        ukuranCup = input1.nextLine().charAt(0);
        menu = input1.nextLine();
        System.out.print("Input jumlah: ");
        jumlah = input1.nextInt();
        System.out.println("input status keanggotaan:");
        keanggotaan = input1.nextBoolean();
        
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }
        totalHarga = jumlah*hargaMenu;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25*totalHarga;
                break;
            case 'L':
                totalHarga += 0.4*totalHarga;
                break;
        }

        diskon = keanggotaan ? 0.1 : 0;
        nominalBayar = totalHarga-(diskon*totalHarga);

        System.out.println("Item pembelian: "+jumlah+" "+menu+" dengan ukuran cup "+ukuranCup);
        System.out.println("Nominal bayar: "+nominalBayar);
    }
}
