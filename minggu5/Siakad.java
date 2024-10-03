package minggu5;

public class Siakad {
    public static void main(String[] args) {
        double nilaiAngka; 
        int kuis=40, tugas=80, ujian=95;
        String kualifikasi, nilaiHuruf;
        nilaiAngka = (kuis+tugas+ujian)/3;
        if(nilaiAngka>80 && nilaiAngka<=100){
            nilaiHuruf = "A";kualifikasi="Sangat Baik";
        }else if(nilaiAngka>73 && nilaiAngka<=80){
            nilaiHuruf = "B+";kualifikasi="Lebih dari Baik";
        }else if(nilaiAngka>65 && nilaiAngka<=73){
            nilaiHuruf = "B";kualifikasi="Baik";
        }else if(nilaiAngka>60 && nilaiAngka<=65){
            nilaiHuruf = "C+";kualifikasi="Lebih dari Cukup";
        }else if(nilaiAngka>50 && nilaiAngka<=60){
            nilaiHuruf = "C";kualifikasi="Cukup";
        }else if(nilaiAngka>39 && nilaiAngka<=50){
            nilaiHuruf = "D";kualifikasi="Kurang";
        }else{
            nilaiHuruf = "E";kualifikasi="Gagal";
        }
        System.out.println("Nilai Angkanya setelah adalah = "+nilaiAngka);
        System.out.println("Nilai Huruf = "+nilaiHuruf);
        System.out.println("Kualifikasi = "+kualifikasi);
    }
}
