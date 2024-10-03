package minggu6;

public class OperatorLogika {
    public static void main(String[] args) {
        int a=5, b=10;
        if(a%2==0 && b++ > 10){
            System.out.println("hasil akhir true");
        }
        System.out.println(b);
    }
}
