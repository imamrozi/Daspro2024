package minggu6;

import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
       
        int i = sc1.nextInt();
        String a = sc2.nextLine();
       
        int tahun = 2000;
        if(tahun%4 == 0){
            if(tahun%100 != 0){
                System.out.println("Tahun kabisat");
            }else{
                if(tahun%400 == 0)
                    System.out.println("Tahun kabisat");
                else
                    System.out.println("Bukan tahun kabisat");
            }
        }else{
            System.out.println("Bukan tahun kabisat");
        }
    }
}
