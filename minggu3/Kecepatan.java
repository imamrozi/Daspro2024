package minggu3;
import java.util.Scanner;

public class Kecepatan {
    public static void main(String[] args) {
        double V=2, S, t;
        Scanner sc = new Scanner(System.in);
        S = sc.nextDouble();
        t = S/V;
        System.out.println("Waktu untuk menempuh "+S+" km, dengan"+
        " kecepatan "+V+" km/jam adalah "+t+" jam");
        String kalimat = "Hallo"+" "+"Selamat Pagi"+"!";
        System.out.println(kalimat);
    }
}
