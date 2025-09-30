package minggu6;

public class NilaiMax {
    public static void main(String[] args) {
        int bill1 = 28, bill2 = 54, bill3 = 15, billmax;
        if(bill1 > bill2){
            if(bill1 > bill3){
                billmax = bill1;
            }else{
                billmax = bill3;
            }
        }else {
            if (bill2 > bill3) {
                billmax = bill2;
            }else{
                billmax = bill3;
            }
        }
        System.out.println("billmax" + billmax);
    }
}
