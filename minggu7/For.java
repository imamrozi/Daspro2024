package minggu7;
import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int matkul=5, i=0, total=0, nilai;
        double rata2;
        Scanner input = new Scanner(System.in);
        i=0;
        for(;i<=matkul;){
            System.out.print("Input nilai matkul "+i+"=");
            nilai = input.nextInt();
            total=total+nilai;
            i++;
        }
        rata2 = total/matkul;
        System.out.println(rata2);
    }
}
