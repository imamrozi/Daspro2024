package minggu6;

public class TokoSepatu {
    public static void main(String[] args) {
        String merk = "converse";
        String kategori = "slip on";
        int ukuran = 36;
        int harga = 0;

        if (merk.equals("converse")&&(kategori.equals("slip on"))&&(ukuran>=36&&ukuran<=40)){
            harga = 800000;
        }else if(merk.equals("converse")&&(kategori.equals("high top"))&&(ukuran>=40&&ukuran<=44)){
            harga = 1200000;
        }

    }
}
