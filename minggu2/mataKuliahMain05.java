package minggu2;

public class mataKuliahMain05 {

    public static void main(String[] args) {
        mataKuliah05 mk1 = new mataKuliah05();

        mk1.kodeMK = "ASD";
        mk1.nama = "Algoritma dan Struktur Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilinInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangJam(3);
        mk1.tampilinInformasi();

        mataKuliah05 mk2 = new mataKuliah05("BD", "Basis Data", 3, 6);

        mk2.tampilinInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangJam(8);
        mk2.tampilinInformasi();
    }
}