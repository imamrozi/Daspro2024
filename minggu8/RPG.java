import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input atribut pemain dan musuh
        System.out.print("Masukkan nyawa awal pemain: ");
        int playerHealth = scanner.nextInt();
        System.out.print("Masukkan nyawa awal musuh: ");
        int enemyHealth = scanner.nextInt();
        System.out.print("Masukkan kekuatan serangan pemain: ");
        int playerAttack = scanner.nextInt();
        System.out.print("Masukkan kekuatan serangan musuh: ");
        int enemyAttack = scanner.nextInt();

        int initialPlayerHealth = playerHealth; // Simpan nyawa awal pemain untuk cek kondisi kritis
        boolean gameRunning = true;
        int round = 1;

        // Loop untuk setiap ronde
        while (gameRunning) {
            System.out.println("\n=== Ronde " + round + " ===");

            // Pemain menyerang musuh
            enemyHealth -= playerAttack;
            if (enemyHealth <= 0) {
                System.out.println("Pemain menyerang! Nyawa musuh tersisa: 0");
                System.out.println("Musuh Kalah!");
                gameRunning = false;
                break;
            } else {
                System.out.println("Pemain menyerang! Nyawa musuh tersisa: " + enemyHealth);
            }

            // Musuh menyerang pemain
            playerHealth -= enemyAttack;
            if (playerHealth <= 0) {
                System.out.println("Musuh menyerang! Nyawa pemain tersisa: 0");
                System.out.println("Pemain Kalah!");
                gameRunning = false;
                break;
            } else {
                System.out.println("Musuh menyerang! Nyawa pemain tersisa: " + playerHealth);
            }

            // Cek apakah pemain berada dalam kondisi kritis (nyawa < 20% nyawa awal)
            if (playerHealth <= 0.2 * initialPlayerHealth) {
                System.out.println("Pemain berada dalam kondisi kritis!");
                System.out.print("Apakah Anda ingin melarikan diri? (ya/tidak): ");
                String decision = scanner.next();
                if (decision.equalsIgnoreCase("ya")) {
                    System.out.println("Pemain melarikan diri! Game selesai.");
                    gameRunning = false;
                    break;
                }
            }

            round++;
        }

        scanner.close();
    }
}
