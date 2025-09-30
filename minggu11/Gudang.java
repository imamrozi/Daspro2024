package minggu11;
import java.util.Scanner;

public class Gudang {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Masukkan jumlah jenis barang = ");
        int jumBarang = sc1.nextInt();
        System.out.print("Masukkan jumlah gudang = ");
        int jumGudang = sc1.nextInt();

        String[] namaBarang = new String[jumBarang];
        String[] namaGudang = new String[jumGudang];
        int[][] stok = new int[jumBarang][jumGudang];

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Input nama barang!");
        for(int i=0;i<namaBarang.length;i++){
            System.out.print("Nama barang ke-"+(i+1)+"=");
            namaBarang[i] = sc2.nextLine();
        }
        System.out.println();

        System.out.println("Input nama gudang!");
        for(int i=0;i<namaGudang.length;i++){
            System.out.print("Nama gudang ke-"+(i+1)+"=");
            namaGudang[i] = sc2.nextLine();
        }
        System.out.println();

        System.out.println("Input stok barang di tiap lokasi gudang!");
        int jenisBarang = 0, lokasiGudang=0;
        while(true){
            System.out.println("Pilihan jenis barang:");
            for(int i=0;i<namaBarang.length;i++){
                System.out.println(i+" - "+namaBarang[i]);
            }
            System.out.println("Pilihan gudang:");
            for(int i=0;i<namaGudang.length;i++){
                System.out.println(i+" - "+namaGudang[i]);
            }
            System.out.print("Jenis barang: ");
            jenisBarang = sc1.nextInt();
            if(jenisBarang<0||jenisBarang>=namaBarang.length){
                break;
            }
            System.out.print("Lokasi: ");
            lokasiGudang = sc1.nextInt();
            if(lokasiGudang<0||lokasiGudang>=namaGudang.length){
                continue;
            }
            System.out.print("Tambah stok: ");
            stok[jenisBarang][lokasiGudang] += sc1.nextInt();
        }

        System.out.print("\t\t");
        for(int i=0;i<namaGudang.length;i++){
            System.out.print(namaGudang[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<namaBarang.length;i++){
            System.out.print(namaBarang[i]+": \t");
            for(int j=0;j<namaGudang.length;j++){
                System.out.print(stok[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0;i<namaBarang.length;i++){
            int jum = 0;
            for(int j=0;j<namaGudang.length;j++){
               jum += stok[i][j];
            }
            System.out.println("Stok total "+namaBarang[i]+" = "+jum);
        }

        for(int i=0;i<namaBarang.length;i++){
            int idxMax = 0;
            for(int j=0;j<namaGudang.length;j++){
                if(stok[i][j]>stok[i][idxMax]){
                    idxMax = j;
                }
            }
            System.out.println("Stok terbanyak "+namaBarang[i]+" = "+namaGudang[idxMax]);
        }

    }
}
