package minggu11;

public class Array2D {
    public static void main(String[] args) {
        int data2[][] = {{23,45},{12,2},{-1,43}};
        int jum = 0;
        //int jumKolom0 = 0;
        //int jumKolom1 = 0;
        for(int baris=0;baris<data2.length;baris++){
            jum = 0;
            for(int kolom=0;kolom<data2[baris].length;kolom++){
                System.out.print(data2[baris][kolom]+" ");
                jum = jum+data2[baris][kolom];
                /*if(kolom==0){
                    jumKolom0 += data2[baris][kolom];
                }else if(kolom==1){
                    jumKolom1 += data2[baris][kolom];
                }*/
            }
            System.out.print(" = "+jum);
            System.out.print(" = "+(jum/data2[baris].length));
            System.out.println();
        }
        
        int jumKolom = 0;
        for(int kolom=0;kolom<data2[0].length;kolom++){
            jumKolom = 0;
            for(int baris=0;baris<data2.length;baris++){
                jumKolom = jumKolom+data2[baris][kolom];
            }
            System.out.print(jumKolom+" ");
        }
        
    }
}
