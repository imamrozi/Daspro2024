package minggu13;

import java.util.Scanner;

public class Tugas2 {
    static int[][] data = new int[5][7];
    static String[] hari = {"Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
    static String[] menu = {"Kopi","Teh","Es Degan","Roti Bakar","Gorengan"};
    public static void main(String[] args) {
        input();
        print();
        printPenjualanTertinggi();
        input();
        print();
        input();
        input();
        input();
    }
    static void input(){
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan menu (Kopi, teh, degan, roti, gorengan):");
        String menu = sc.nextLine();
        int idxMenu = -1;
        if(menu.equalsIgnoreCase("kopi")){
            idxMenu = 0;
        }else if(menu.equalsIgnoreCase("teh")){
            idxMenu = 1;
        }else if(menu.equalsIgnoreCase("degan")){
            idxMenu = 2;
        }else if(menu.equalsIgnoreCase("roti")){
            idxMenu = 3;
        }else if(menu.equalsIgnoreCase("gorengan")){
            idxMenu = 4;
        }
        System.out.print("Masukkan hari (senin-minggu):");
        String hari = sc.nextLine();
        int idxHari = -1;
        if(hari.equalsIgnoreCase("senin")){
            idxHari = 0;
        }else if(hari.equalsIgnoreCase("selasa")){
            idxHari = 1;
        }else if(hari.equalsIgnoreCase("rabu")){
            idxHari = 2;
        }else if(hari.equalsIgnoreCase("kamis")){
            idxHari = 3;
        }else if(hari.equalsIgnoreCase("jumat")){
            idxHari = 4;
        }else if(hari.equalsIgnoreCase("sabtu")){
            idxHari = 5;
        }else if(hari.equalsIgnoreCase("minggu")){
            idxHari = 6;
        }*/
        Scanner sc2 = new Scanner(System.in);
        //System.out.print("Input transaksi "+menu+" pada hari "+hari+": ");
        //data[idxMenu][idxHari] = sc2.nextInt();

        for(int i=0;i<data.length;i++){
            for(int j=0;j<data[i].length;j++){
                System.out.print("Transaksi menu "+menu[i]+" hari "+hari[j]+": ");
                data[i][j] = sc2.nextInt();
            }
        }
    }
    static void print(){
        System.out.println("\t\t\t\tSenin\t\tSelasa...");
        for(int i=0;i<data.length;i++){
            System.out.print(menu[i]+"\t\t\t");
            for(int j=0;j<data[i].length;j++){
                System.out.print(data[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void printPenjualanTertinggi(){
        for(int i=0;i<data.length;i++){
            int max = data[i][0];
            for(int j=0;j<data[i].length;j++){
                if(data[i][j]>max){
                    max = data[i][j];
                }
            }
            System.out.println("Transaksi tertinggi menu "+menu[i]+" = "+max);
        }
    }
}
