package minggu6;

import java.util.Scanner;

public class Kafe {
    public static void main(String[] args) {
        double harga, total, diskon;
        int pilihanMenu;
        boolean isMember;
        String metodePembayaran;
        System.out.println("KAFE JTI");
        System.out.println("--------------");
        System.out.println("Daftar Menu:");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket recebowl dan ice tea");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan nomor menu yang dipilih:");
        Scanner input = new Scanner(System.in);
        System.out.print("Metode pembayaran:");
        metodePembayaran = input.nextLine();
        pilihanMenu = input.nextInt();

        System.out.print("Apakah member? (true/false) = ");
        isMember = input.nextBoolean();

        if(isMember){
            diskon = 0.1;
            System.out.println("Diskon 10%");
            if(pilihanMenu == 1){
                harga = 14000;
                System.out.println("Harga recebowl = 14000");
            }else if(pilihanMenu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = 3000");
            }else if(pilihanMenu == 3){
                harga = 15000;
                System.out.println("Harga bundling = 15000");
            }else{
                System.out.println("Input menu salah!");
                return;
            }
            total = harga - (harga*diskon);
            if(metodePembayaran.equalsIgnoreCase("qris"))
                total = total-1000;
            System.out.println("Total bayar setelah didiskon: "+total);
        }else{
            if(pilihanMenu == 1){
                harga = 14000;
                System.out.println("Harga recebowl = 14000");
            }else if(pilihanMenu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = 3000");
            }else if(pilihanMenu == 3){
                harga = 15000;
                System.out.println("Harga bundling = 15000");
            }else{
                System.out.println("Input menu salah!");
                return;
            }
            if(metodePembayaran.equalsIgnoreCase("qris")){
                harga = harga-1000;
            }
            System.out.println("Total bayar setelah didiskon: "+harga);
        }
    }
}
