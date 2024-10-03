package minggu5;

public class DeteksiHari {
    public static void main(String[] args) {
        int hari = 3;
        String dayType = "";
        switch(hari){
            case 1: 
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "weekday";
                break;
            case 6:
            case 7:
                dayType = "weekeend";
                break;
            default:
                System.out.println("Invalid number!");
        }
    }
}
