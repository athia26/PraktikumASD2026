package minggu13.CM2;

public class RekapJam { //cetakan untuk objek rekapan per jam  
    String jam;
    int jumlahPesanan;

    public RekapJam(String jam){
        this.jam = jam;;
        this.jumlahPesanan = 1;  
    }

    public void tampilJam(){
        System.out.println(jam + "\t" + jumlahPesanan);
    }
}
