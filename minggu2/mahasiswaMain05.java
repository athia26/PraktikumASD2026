package minggu2;

public class mahasiswaMain05 {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();

        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK( 3.60);
        mhs1.tampilkanInformasi();

        mahasiswa mhs2 = new mahasiswa("Annisa Nabila", "12345", 3.25, "TI-2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa mhsBudi = new mahasiswa("Budi", "1234556", 3.50, "TI-2A");
        mhsBudi.tampilkanInformasi();

    }
}
