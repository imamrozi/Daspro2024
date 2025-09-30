package minggu10;
import java.util.Scanner;
public class Larik {
    public static void main(String[] args) {
        int a1, a2, a3;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        // a1 = input.nextInt();
        // a2 = input.nextInt();
        // a3 = input.nextInt();
        // System.out.println(a1);
        // System.out.println(a2);
        // System.out.println(a3);
        System.out.println("Input angka");
        int data = input.nextInt();
        System.out.println("Input string");
        String s = input2.nextLine();
        System.out.println(s);

        int[] a = new int[5];
        for(int i=1;i<=a.length;i++){
            System.out.print("Input elemen ke-"+(i)+" ");
            a[i] = input.nextInt();
        }
        int juml=0;
        for(int i=0;i<3;i++){
            juml = juml+a[i];
        }
        System.out.println(a[4]);

        for(int x:a){
            System.out.println(x);
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }
    }
}
