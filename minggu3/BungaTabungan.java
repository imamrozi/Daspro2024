package minggu3;

public class BungaTabungan {
    public static void main(String[] args) {
        int saldoAwal = 5000000;
        double persenBunga = 0.02;
        int waktu = 5;

        int bungaTabungan = (int)(saldoAwal*persenBunga*waktu);
        int saldoAkhir = saldoAwal+bungaTabungan;
        System.out.println(saldoAkhir);
    }
}
