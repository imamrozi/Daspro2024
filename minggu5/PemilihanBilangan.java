package minggu5;

import java.util.Scanner;

public class PemilihanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        if(angka%2 == 0){
            System.out.println("Angaka "+angka+" bilangan genap!");
        }else{
            System.out.println("Angaka "+angka+" bilangan ganjil!");
        }
    }
}
