package minggu6;

public class Buku {
   public static void main(String[] args) {
        String jenisBuku = "komik";
        int jumlahBuku = 5;
        double diskon=0;

        if (jenisBuku=="komik") {
          if (jumlahBuku > 2)
             diskon = 0.12;
          else 
             diskon = 0.10;      
        }
        else if (jenisBuku=="novel") {
            diskon=0.07;
            if (jumlahBuku>3) {
               diskon=diskon+0.02; 
            }
            else {
                diskon=diskon+0.01;
            }
        }
        else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        System.out.println(diskon);
        
   } 
}
