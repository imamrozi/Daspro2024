import java.util.Scanner;
public class Rpg2 {
    public static void main(String[] args) {
        int nyawaPemain=100, nyawaMusuh=150, seranganPemain=30, seranganMusuh=40, ronde=1;
        while(true){
            System.out.println("Ronde: "+ronde);
            nyawaMusuh -= seranganPemain;
            if(nyawaMusuh<=0){
                break;
            }
            nyawaPemain -= seranganMusuh;
            if(nyawaPemain<=0){
                break;
            }else{
                if(nyawaPemain<=0.2*100){
                    System.out.println("Pemain kritis!!");
                    System.out.println("Lari??(y/t)");
                    Scanner in = new Scanner(System.in);
                    String q = in.nextLine();
                    if(q.equalsIgnoreCase("y"))
                        break;
                    else if(q.equalsIgnoreCase("t")){
                        
                    }

                }
            }
            ronde++;
        }
    }
}
