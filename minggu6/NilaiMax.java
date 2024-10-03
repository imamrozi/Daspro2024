package minggu6;

public class NilaiMax {
    public static void main(String[] args) {
        //variabel
        int bil1=28, bil2=54, bil3=15, bilMax;

        //pengkodisian
        if(bil1>bil2){
            if(bil1>bil3){
                bilMax=bil1;
            }else{
                bilMax=bil3;
            }
        }else {
            if(bil2>bil3)
                bilMax=bil2;
            else{
                bilMax=bil3;
            }
        }
        //output
        System.out.println("Bilangan Maksimum adalah " + bilMax);
    }
}
