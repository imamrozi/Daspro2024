package minggu11;
import java.util.Scanner;

public class StokGudang {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input jumlah barang: ");
        int jumBarang = input1.nextInt();
        System.out.print("Input jumlah gudang: ");
        int jumGudang = input1.nextInt();
        //Deklarasi array
        String[] namaBarang = new String[jumBarang];
        String[] namaGudang = new String[jumGudang];
        int[][] stok = new int[jumBarang][jumGudang];
        //input nama barang dan nama gudang
        Scanner input2 = new Scanner(System.in);
        System.out.println("Input nama barang!");
        for(int i=0;i<namaBarang.length;i++){
            System.out.print("Barang ke-"+(i+1)+": ");
            namaBarang[i] = input2.nextLine();
        }
        System.out.println("Input nama gudang!");
        for(int i=0;i<namaGudang.length;i++){
            System.out.print("Gudang ke-"+(i+1)+": ");
            namaGudang[i] = input2.nextLine();
        }
        //input stok
        /*for(int i=0;i<namaBarang.length;i++){
            for(int j=0;j<namaGudang.length;j++){
                stok[i][j] = input1.nextInt();
            }
        }*/
        System.out.println("Input stok barang!");
        int idxBarang=0, idxGudang=0;
        while(true){
            System.out.print("Input jenis barang (0-"+(namaBarang.length-1)+")");
            idxBarang = input1.nextInt();
            if(idxBarang<0||idxBarang>=namaBarang.length){
                break;
            }
            System.out.print("Input lokasi gudang (0-"+(namaGudang.length-1)+")");
            idxGudang = input1.nextInt();
            if(idxGudang<0||idxGudang>=namaGudang.length){
                continue;
            }
            System.out.print("Tambah stok: ");
            int dataStok = input1.nextInt();
            stok[idxBarang][idxGudang]  = stok[idxBarang][idxGudang]+dataStok;
        }
        System.out.println("Tabel Stok Gudang:");
        //tampil nama gudang
        System.out.print("\t\t");
        for(String gd:namaGudang){
            System.out.print(gd+"\t");
        }
        System.out.println();
        for(int i=0;i<namaBarang.length;i++){
            //tampil nama barang
            System.out.print(namaBarang[i]+"\t\t");
            //tampil stok di tiap gudang
            for(int j=0;j<namaGudang.length;j++){
                System.out.print(stok[i][j]+"\t\t");
            }
            System.out.println();
        }

        //jumlah stok tiap barang
        int stokTotal = 0;
        for(int i=0;i<namaBarang.length;i++){
            System.out.print("Total stok untuk "+namaBarang[i]+": ");
            //reset variabel stokTotal
            stokTotal = 0;
            for(int j=0;j<namaGudang.length;j++){
                //stokTotal ditambah dengan stok di tiap gudang
                stokTotal = stokTotal+stok[i][j];
            }
            System.out.println(stokTotal);
        }

        //cari lokasi gudnag dg stok terbesar di tiap barang
        int idxGudangMax = 0;
        for(int i=0;i<namaBarang.length;i++){
            System.out.print("Lokasi gudang dg stok terbesar untuk "+namaBarang[i]+": ");
            //reset variabel stokTotal
            idxGudangMax = 0;
            for(int j=0;j<namaGudang.length;j++){
                //cari gudang dg stok max
                if(stok[i][j]>stok[i][idxGudangMax]){
                    idxGudangMax = j;
                }
            }
            System.out.println(namaGudang[idxGudangMax]);
        }
    }
}
