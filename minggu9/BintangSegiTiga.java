package minggu9;

public class BintangSegiTiga {
    public static void main(String[] args) {
        int n = 9;
        int h=1;
        //mengulang per baris
        while(h<=n){
            //bintang 1 baris
            int i=1;
            while(i<=n){
                if(h==1 || h==n || i==1 || i==n || i==n/2+1 || h==n/2+1)
                    System.out.print(n);
                else
                    System.out.print(" ");
                i++;
            }
            System.out.println();
            h++;
        }
    }
}
