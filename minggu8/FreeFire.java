import java.util.Scanner;

public class FreeFire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi nilai nyawa dan poin serangan
        int nyawaPemain = 70;        // HP pemain
        int poinSeranganPemainAK = 30;  // Poin serangan pemain AK
        int poinSeranganPemainFamas = 20; //Poin serangan pemain Famas
        int nyawaMusuh = 80;         // HP musuh
        int poinSeranganMusuh = 15;   // Poin serangan musuh
        int itemPenyembuh = 3;        // Jumlah item penyembuh
        int penyembuhan = 25;         // Nilai HP yang dipulihkan dengan item penyembuh
        boolean permainanBerakhir = false;
        int ronde = 1;
        System.out.println("===Nilai Awal Permainan===");
        System.out.println("Nyawa Pemain: "+nyawaPemain);
        System.out.println("Nyawa Musuh: "+nyawaMusuh);
        System.out.println("\n===Pertarungan Free Fire dimulai!===");

        while (!permainanBerakhir) {
            System.out.println("\n>>Ronde "+ronde+"<<");
            // Giliran musuh menyerang terlebih dahulu
            System.out.println("Musuh menyerang! Kamu kehilangan " + poinSeranganMusuh + " HP.");
            nyawaPemain -= poinSeranganMusuh;
            System.out.println("Nyawa kamu sekarang: " + nyawaPemain);

            // Cek apakah pemain masih hidup
            if (nyawaPemain <= 0) {
                System.out.println("Kamu kalah! Nyawa kamu habis.");
                permainanBerakhir = true;
                break;
            }

            // Giliran pemain memilih aksi
            System.out.println("Giliran kamu! Pilih aksi:");
            System.out.println("1. Serang musuh");
            System.out.println("2. Gunakan item penyembuh (sisa " + itemPenyembuh + ")");
            System.out.println("3. Menghindar (tidak menyerang musuh)");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    // Pemain menyerang musuh
                    System.out.println("Pilih senjata: 1. AK, 2. Famas:");
                    int senjata = scanner.nextInt();
                    if(senjata == 1){
                        System.out.println("Kamu menyerang musuh dengan AK! Musuh kehilangan " + poinSeranganPemainAK + " HP.");
                        nyawaMusuh -= poinSeranganPemainAK;
                    }else if(senjata == 2){
                        System.out.println("Kamu menyerang musuh dengan AK! Musuh kehilangan " + poinSeranganPemainFamas + " HP.");
                        nyawaMusuh -= poinSeranganPemainFamas;
                    }
                    System.out.println("Nyawa musuh sekarang: " + nyawaMusuh);
                    break;

                case 2:
                    // Pemain menggunakan item penyembuh
                    if (itemPenyembuh > 0) {
                        nyawaPemain += penyembuhan;
                        itemPenyembuh--;
                        System.out.println("Kamu menggunakan item penyembuh. Nyawa kamu bertambah " + penyembuhan + " HP.");
                        System.out.println("Nyawa kamu sekarang: " + nyawaPemain);
                    } else {
                        System.out.println("Item penyembuh kamu sudah habis!");
                    }
                    break;

                case 3:
                    // Pemain memilih menghindar
                    System.out.println("Kamu memilih untuk menghindar, sayang sekali!");
                    if(nyawaPemain>nyawaMusuh){
                        System.out.println("Nyawa musuh bertambah 10% yaitu: "+(0.1*nyawaMusuh));
                        nyawaMusuh += 0.1*nyawaMusuh;
                        System.out.println("Nyawa musuh sekarang: "+nyawaMusuh);
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Kamu kehilangan giliran.");
            }

            // Cek apakah musuh masih hidup
            if (nyawaMusuh <= 0) {
                System.out.println("Kamu menang! Musuh telah kalah.");
                permainanBerakhir = true;
                break;
            }

            System.out.println();
            ronde++;
        }

        scanner.close();
    }
}
