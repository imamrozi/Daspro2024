package minggu5;

import java.util.Scanner;

public class PemilihanHari {
    public static void main(String[] args) {
        String dayName, dayType;
        System.out.print("Input day name: ");
        Scanner input = new Scanner(System.in);
        dayName = input.nextLine();
        switch(dayName.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday": 
            case "sunday":
                dayType = "weekend";
                break;
            default: 
                dayType = "Invalid day name!";
                break;
        }
        System.out.println(dayName+" is a "+dayType);
    }
}
