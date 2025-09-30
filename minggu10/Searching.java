package minggu10;

public class Searching {
    public static void main(String[] args) {
        int[] data = {34,56,43,42,1,23,8,476,-3,34};
        int key = 23;
        for(int i=0;i<data.length;i++){
            if(key==data[i]){
                System.out.println("ketemu di posisi ke-"+(i+1));
                break;
            }
        }
    }
}
