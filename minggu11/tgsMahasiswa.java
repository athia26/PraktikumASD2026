package minggu11;

public class tgsMahasiswa {
    String nim, nama;

    public tgsMahasiswa (String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}
