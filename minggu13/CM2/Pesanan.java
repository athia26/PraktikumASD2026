package minggu13.CM2;

public class Pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public Pesanan(int kodePesanan, String namaPesanan, int harga){
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampil(){
        System.out.println(kodePesanan + "\t" + namaPesanan + "\t" +harga);
    }
}
