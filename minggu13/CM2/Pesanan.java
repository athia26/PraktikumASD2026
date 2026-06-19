package minggu13.CM2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String jamPesanan; 

    public Pesanan(int kodePesanan, String namaPesanan, int harga, String jamPesan){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.jamPesanan = jamPesan; //menambahkan jam pesanan
    }

    public void tampil(){
        System.out.println(kodePesanan + "\t" + namaPesanan + "\t" +harga + "\t");
    }
}
