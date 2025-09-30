import java.util.Scanner;

public class ZombieVsPlant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi nyawa dan pertahanan
        int nyawaZombie = 60;           // Nyawa Zombie Biasa
        int nyawaTanamanPelindung = 50; // Pertahanan Tanaman Pelindung
        int seranganTanamanPenyerang = 10;       // Serangan Tanaman Penembak
        int nyawaTanamanPenyerang = 10;
        int seranganZombie = 20;        // Serangan Zombie
        boolean zombieHidup = true;     // Status hidup zombie
        int i=1;

        System.out.println("Zombie vs Plant");
        System.out.println("-------------------------------");
        System.out.println("Status Awal Pertarungan:");
        System.out.println("Nyawa Zombie: "+nyawaZombie);
        System.out.println("Poin Serangan Zombie: "+seranganZombie);
        System.out.println("Nyawa Tanaman Pelindung: "+nyawaTanamanPelindung);
        System.out.println("Nyawa Tanaman Penyerang: "+nyawaTanamanPenyerang);
        System.out.println("Poin Serangan Tanaman Penyerang: "+seranganTanamanPenyerang);
        System.out.println("---------------------------------");
        System.out.println("Pertarungan: Tanaman vs Zombie!");
        System.out.println("--------------------------------");
        // Perulangan untuk pertarungan
        while (zombieHidup && nyawaTanamanPenyerang > 0) {
            System.out.println("Ronde "+i);
            System.out.println("-----------");
            // Giliran Tanaman Penyerang menyerang
            System.out.println("Tanaman Penyerang menyerang Zombie!");
            nyawaZombie -= seranganTanamanPenyerang;  // Mengurangi nyawa zombie
            System.out.println("Nyawa Zombie sekarang: " + nyawaZombie + " poin.");

            // Cek apakah Zombie masih hidup
            if (nyawaZombie <= 0) {
                zombieHidup = false;
                System.out.println("Zombie telah mati! Tanaman menang!");
                break;
            }

            // Giliran Zombie menyerang Tanaman
            if(nyawaTanamanPelindung>0){
                System.out.println("Zombie menyerang Tanaman Pelindung!");
                nyawaTanamanPelindung -= seranganZombie; // Mengurangi pertahanan tanaman pelindung
                System.out.println("Nyawa Tanaman Pelindung sekarang: " + nyawaTanamanPelindung + " poin.");
            }else{
                System.out.println("Zombie menyerang Tanaman Penyerang!");
                nyawaTanamanPenyerang -= seranganZombie; // Mengurangi pertahanan tanaman pelindung
                System.out.println("Nyawa Tanaman Penyerang sekarang: " + nyawaTanamanPenyerang + " poin.");
            }
            
            if(nyawaTanamanPenyerang<=0){
                System.out.println("Tanaman telah hancur! Zombie menang!");
            }
            i++;
            System.out.println();
        }

        scanner.close();
    }
}
