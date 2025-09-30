package minggu7;
import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        int mhs=20, lulus=0, tidakLulus=0, i, nilai;
        Scanner input = new Scanner(System.in);

        i=1;
        while(i<=mhs){
            nilai = input.nextInt();
            if(nilai>=65){
                lulus++;
            }else{
                tidakLulus++;
            }
            i++;
        }
        System.out.println("Lulus = "+lulus);
        System.out.println("Tidak Lulus = "+tidakLulus);
    }
}
