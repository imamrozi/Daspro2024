package minggu9;
public class Bintang {
    public static void main(String[] args) {
        int n = 10;
        int h=1;
        //mengulang per baris
        while(h<=n){
            //bintang 1 baris
            int i=1;
            while(i<=n){
                if(i>=n-h+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
                i++;
            }
            System.out.println();
            h++;
        }
        
        
    }
}
