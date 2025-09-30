package minggu7;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int matkul=5, i, total=0, nilai;
        double rata2;
        Scanner input = new Scanner(System.in);

        i=1;
        while(i<=matkul){
            System.out.print("Input nilai matkul "+i+"=");
            nilai = input.nextInt();
            total=total+nilai;
            i++;
        }
        
        rata2 = total/matkul;
        System.out.println(rata2);
        i=0;
        while(1<10){
            if(i==5)
                break;
        }
        System.out.println("hello");
    }
}
