public class ZvP {
    public static void main(String[] args) {
        int nyawaZombie = 40;
        int nyawaTanamanPelindung = 50;
        int nyawaTanamanPenyerang = 60;
        int seranganZombie = 20;
        int seranganTanamanPenyerang = 10;
        int ronde = 1;

        while(nyawaZombie>0&&nyawaTanamanPenyerang>0){
            System.out.println("Ronde: "+ronde);
            nyawaZombie = nyawaZombie-seranganTanamanPenyerang;
            System.out.println("Nyawa Zombie: "+nyawaZombie);
            if(nyawaTanamanPelindung>0){
                nyawaTanamanPelindung = nyawaTanamanPelindung-seranganZombie;
            }else{
                nyawaTanamanPenyerang = nyawaTanamanPenyerang-seranganZombie;
            }
            System.out.println("Nyawa Tanaman Pelindung: "+nyawaTanamanPelindung);
            System.out.println("Nyawa Tanaman Penyerang: "+nyawaTanamanPenyerang);
            ronde++;
        }
        if(nyawaZombie>0)
            System.out.println("Zombie Menang!!!!");
        else
            System.out.println("Tanaman Menang!!!");
    }
}
