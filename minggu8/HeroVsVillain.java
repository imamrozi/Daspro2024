import java.util.Scanner;

public class HeroVsVillain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heroEnergy = 100;  // Energi awal superhero
        int villainEnergy = 150;  // Energi awal villain
        int specialAttackCount = 2;  // Serangan spesial hanya bisa dilakukan 2 kali
        int ronde=1;
        System.out.println("----- Superhero vs Villain -----\n");
        System.out.println("--- Nilai Awal ---");
        System.out.println("Energi Hero: "+heroEnergy);
        System.out.println("Energi Villain: "+villainEnergy+"\n");

        while (heroEnergy > 0 && villainEnergy > 0) {
            System.out.println("--- Ronde "+ronde+" ---");
            System.out.println("--- Status ---");
            System.out.println("Energi Superhero: " + heroEnergy);
            System.out.println("Energi Villain: " + villainEnergy);
            System.out.println("Serangan Spesial Tersisa: " + specialAttackCount);
            System.out.println("------------------");

            System.out.println("Pilih aksi:");
            System.out.println("1. Serangan Normal (-5 energi, -15 energi Villain, bisa ada serangan kritis)");
            System.out.println("2. Serangan Spesial (-20 energi, -30 energi Villain, bisa ada serangan super)");
            System.out.print("Pilihan Anda: ");
            int action = scanner.nextInt();

            if (action == 1) {
                // Serangan normal
                heroEnergy -= 5;

                // Pencabangan dalam serangan normal: serangan kritis jika energi superhero di bawah 50
                if (heroEnergy < 50) {
                    villainEnergy -= 30;  // Serangan kritis ketika energi di bawah 50
                    System.out.println("Serangan kritis terjadi! Villain kehilangan 30 energi.");
                } else {
                    villainEnergy -= 15;  // Serangan normal biasa
                    System.out.println("Superhero menggunakan serangan normal! Villain kehilangan 15 energi.");
                }
            } else if (action == 2 && specialAttackCount > 0) {
                // Serangan spesial
                specialAttackCount--;

                // Pencabangan dalam serangan spesial
                if (heroEnergy < 30) {
                    heroEnergy -= 30;  // Serangan super kuat, memakan energi lebih besar
                    villainEnergy -= 50;  // Kerusakan lebih besar pada villain
                    System.out.println("Superhero melakukan serangan super kuat! Villain kehilangan 50 energi.");
                } else {
                    heroEnergy -= 20;  // Serangan spesial biasa
                    villainEnergy -= 30;  // Kerusakan biasa pada villain
                    System.out.println("Superhero menggunakan serangan spesial! Villain kehilangan 30 energi.");
                }
            } else {
                System.out.println("Serangan spesial tidak tersedia atau pilihan salah!");
            }

            // Cek kondisi setelah serangan
            if (heroEnergy <= 0) {
                System.out.println("Superhero kehabisan energi! Villain menang.");
                break;
            } else if (villainEnergy <= 0) {
                System.out.println("Villain dikalahkan! Superhero menang.");
                break;
            }
            ronde++;
            System.out.println();
        }

        System.out.println("Pertarungan selesai.");
        scanner.close();
        
    }
}
