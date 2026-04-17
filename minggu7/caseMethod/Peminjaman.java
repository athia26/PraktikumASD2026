package minggu7.caseMethod;

public class Peminjaman {
    Mahasiswa mhs; 
    Buku buku;
    int lamaPinjam, batasPinjam = 5, terlambat, denda;
    boolean isCanceled = false;


    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam, boolean isCanceled){
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        this.isCanceled = false;
        
        hitungDenda();
    }

    //pengerjaan UTS sesi 4
    void hitungDenda(){
        terlambat = lamaPinjam - batasPinjam;
        if (terlambat<0){ //jika terlambat 0, maka 0 terlambat 
            terlambat = 0;
        } else if (terlambat > 10){ // jika terlambat lebih dari 10, maka denda muncul menjadi 200000
            denda=20000;
        } else{ //jika terlambat kurang dari 10 dan lebih dari 0, maka dihitung seperti biasa.
            denda = terlambat * 2000;
        }

    }

    void tampilPeminjaman(){
        System.out.print(mhs.nama+" | ");
        System.out.print(buku.judul+" | ");
        System.out.print("Lama :  "+lamaPinjam+" | ");
        System.out.print("Terlambat :  "+terlambat+" | ");
        System.out.print("Denda :  "+denda);
        
        System.out.println();
    }

    //pengerjaan UTS sesi 4
    void tampilPinjamCanceled(){
        if (isCanceled == false){ //untuk validasi apakah isCanceled true atau false, jika true, maka tidak akan muncul, jika false akan muncul dengan format dibawha
            
            System.out.print(mhs.nama+" | ");
            System.out.print(buku.judul+" | ");
            System.out.print("Lama :  "+lamaPinjam+" | ");
            System.out.print("Terlambat :  "+terlambat+" | ");
            System.out.print("Denda :  "+denda);
            //System.out.print(isCanceled); untuk melakukan pengecekan apakah yg muncul sudah false semua 

            System.out.println();
        }
        
    }


}
