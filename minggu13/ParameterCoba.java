package minggu13;

public class ParameterCoba {
    static int data;
    public static void main(String[] args) {
        fungsi1(23,4,5,6,23,43,5);
        System.out.println();
        fungsi1(300);
        int[] arr = {34,56,7,5,43,678};
        fungsi2(arr);
    }

    static void fungsi1(int... args){
        for(int i=0;i<args.length;i++){
            System.out.print(args[i]+"-");
        }
    }
    static void fungsi2(int[] args){
        for(int i=0;i<args.length;i++){
            System.out.print(args[i]+"-");
        }
    }
}
