package minggu6;

public class Buku {
   public static void main(String[] args) {
     
    //variabel
    String buku="kamus";
    double diskon=0;
    int jumlah=5;

    if (buku.equalsIgnoreCase("kamus")) {
        if (jumlah >= 2) {
            diskon = 0.12;
        }else {
            diskon = 0.1;
        }
    }else if (buku.equalsIgnoreCase("novel")){
        diskon = 0.07;
        if (jumlah> 3){
            diskon = diskon + 0.02;
        }else{
            diskon = diskon + 0.01;
        }
    }
    else {
        if (jumlah >3 ){
            diskon = 0.05 ;
        }
    }
    System.out.println("Diskon = "+diskon);
   } 
}
