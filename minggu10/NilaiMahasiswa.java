package minggu10;
import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
       int n;
       Scanner input = new Scanner(System.in);
       System.out.print("Input jumlah mhs = ");
       n = input.nextInt();
       
       int nilaiMhs[] = new int[n]; 
       int total = 0;
       int min=0, max=0;
       for(int i=0;i<nilaiMhs.length;i++){
            System.out.print("Input nilai mhs ke-"+(i+1)+": ");
            nilaiMhs[i] = input.nextInt();
            total = total+nilaiMhs[i];
            if(i==0)
                min=max=nilaiMhs[i];
            else{
                if(nilaiMhs[i]>max)
                    max = nilaiMhs[i];
                if(nilaiMhs[i]<min)
                    min = nilaiMhs[i];
            }
       }
       double rata2 = total/n;
       System.out.println("Rata2 = "+rata2);

       min=max=nilaiMhs[0];
       for(int i=1;i<nilaiMhs.length;i++){
            if(nilaiMhs[i]>max)
                max = nilaiMhs[i];
            if(nilaiMhs[i]<min)
                min = nilaiMhs[i];
       }System.out.println(min);
       System.out.println(max);
    }
}
