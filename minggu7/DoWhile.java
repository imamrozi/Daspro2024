package minggu7;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        int total=0, harga;
        Scanner input = new Scanner(System.in);
        do{
            harga = input.nextInt();
            total += harga;
        }while(harga!=0);
        System.out.println(total);
    }
}
