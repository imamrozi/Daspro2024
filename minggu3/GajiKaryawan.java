package minggu3;
import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        int jamKerja, upahPerJam;
        double persenBonus = 0.1, persenPajak=0.05;
        //1.INPUT
        Scanner sc = new Scanner(System.in);
        jamKerja = sc.nextInt();
        upahPerJam = sc.nextInt();
        //2.Perhitungan
        double totalGaji = jamKerja*upahPerJam;
        double bonus = persenBonus*totalGaji;
        double pajak = persenPajak*(totalGaji+bonus);
        double gajiBersih = (totalGaji+bonus)-pajak;
        //3.output
        System.out.println("Total gaji = "+totalGaji);
        System.out.println("Bonus = "+bonus);
        System.out.println("Pajak = "+pajak);
        System.out.println("Gaji bersih = "+gajiBersih);
    }
}
