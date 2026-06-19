package minggu15;

public class TgsMatkul {
    String kode;
    String namaMK;
    int sks;

    public TgsMatkul(String kode, String namaMK, int sks) {
        this.kode = kode;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return kode + "\t" + namaMK + "\t" + sks;
    }
}