package minggu6;

public class mahasiswaMain05 {
    public static void main(String[] args) {
        mahasiswaPrestasi list = new mahasiswaPrestasi();

        mahasiswa05 m1 = new mahasiswa05("123", "Zidan", "2A", 3.2);
        mahasiswa05 m2 = new mahasiswa05("124", "Ayu", "2A", 3.5);
        mahasiswa05 m3 = new mahasiswa05("125", "Sofi", "2A", 3.1);
        mahasiswa05 m4 = new mahasiswa05("126", "Sita", "2A", 3.9);
        mahasiswa05 m5 = new mahasiswa05("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();
    }
}
