package minggu7;

import java.util.Scanner;

public class Siakad {
    public static void main(String[] args) {
        double nilai, tertinggi = 0, terendah = 100, lulus=0, tidakLulus=0;
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=10;i++){
            System.out.print("Nilai mhs ke-"+i+"=");
            nilai = sc.nextDouble();
            if(nilai>tertinggi){
                tertinggi = nilai;
            }
            if(nilai<terendah){
                terendah = nilai;
            }
            if(nilai>=65)
                lulus++;
            else
                tidakLulus++;
        }
        System.out.println("Tertinggi = "+tertinggi);
        System.out.println("Terendah = "+terendah);
    }
}
