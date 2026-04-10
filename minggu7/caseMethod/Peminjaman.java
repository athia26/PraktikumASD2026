package minggu7.caseMethod;

public class Peminjaman {
    Mahasiswa mhs; 
    Buku buku;
    int lamaPinjam, batasPinjam = 5, terlambat, denda;

    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        
        hitungDenda();
    }

    void hitungDenda(){
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat<0){
            terlambat = 0;
        }

        denda = terlambat * 2000;
    }

    void tampilPeminjaman(){
        System.out.print(mhs.nama+" | ");
        System.out.print(buku.judul+" | ");
        System.out.print("Lama :  "+lamaPinjam+" | ");
        System.out.print("Terlambat :  "+terlambat+" | ");
        System.out.print("Denda :  "+denda);
        System.out.println();
    }
}
