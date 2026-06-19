package minggu15;

public class TgsMahasiswa {
    String nim;
    String nama;
    String telp;

    public TgsMahasiswa(String nim, String nama, String telp) {
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    @Override
    public String toString() {
        return nim + "\t" + nama + "\t" + telp;
    }
}