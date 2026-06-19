package minggu15;

public class TgsNilai {
    TgsMahasiswa mahasiswa;
    TgsMatkul matkul;
    double nilai;

    public TgsNilai(TgsMahasiswa mahasiswa, TgsMatkul matkul, double nilai) {
        this.mahasiswa = mahasiswa;
        this.matkul = matkul;
        this.nilai = nilai;
    }

    public void tampil() {
        System.out.printf(
                "%-10s %-15s %-35s %-5d %.2f\n",
                mahasiswa.nim,
                mahasiswa.nama,
                matkul.namaMK,
                matkul.sks,
                nilai
        );
    }
}