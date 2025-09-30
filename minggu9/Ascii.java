package minggu9;

public class Ascii {
    public static void main(String[] args) {
        /*for(int i=97;i<=122;i++){
            char c = (char)i;
            System.out.print(c+"-");
        }*/
        int ascii = 97;
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                System.out.print((char)ascii);
                ascii++;
                if(ascii>122)
                    ascii = 97;
            }
            System.out.println();
            
        }
    }
}
