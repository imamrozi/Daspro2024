package minggu13;

public class ContohFungsi {
    public static void main(String[] args) {
        tambah(23,50);
        int hasil=tambah2(230,510);
        System.out.println(hasil);
        hasil = hasil*100;
        if(hasil%2==0){
        }
        sayHello();
        System.out.println(konversiNilai(95));
        int data[] = {23,45,21};
        int dataCopy[] = copyArray(data);
    }
    static void tambah(int a, int b){
        int hasil = a+b;
        System.out.println(hasil);
    }
    static int tambah2(int a, int b){
        int hasil = a+b;
        return hasil;
    }
    static void sayHello(){
        System.out.println("Selamat pagi!!!");
    }
    static String konversiNilai(int nilaiAngka){
        String nilaiHuruf = "";
        if(nilaiAngka>80){
            nilaiHuruf = "A";
        }else if(nilaiAngka<=80&&nilaiAngka>73){
            nilaiHuruf = "B+";
        }
        return nilaiHuruf;
    }
    
    static int[] copyArray(int[] input){
        int copy[] = new int[input.length];
        for(int i=0;i<input.length;i++){
            copy[i] = input[i];
        }
        return copy;
    }
    static int[] generateRandom(int n){
        int[] data = new int[n];
        for(int i=0;i<data.length;i++){
            data[i] = (int) Math.random()*10;
        }
        return data;
    }
}
