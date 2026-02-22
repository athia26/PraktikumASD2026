package minggu2;

public class mataKuliah05 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah05(){

    }

    public mataKuliah05(String kodeMK, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilinInformasi(){
        System.out.println("Kode MK     : "+kodeMK);
        System.out.println("Nama MK     : "+nama);
        System.out.println("SKS         : "+sks);
        System.out.println("Jumlah Jam  : "+jumlahJam);
    }

    void ubahSKS (int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah berhasil diubah");
    }

    void tambahJam (int jam){
        jumlahJam += jam;
        
    }

    void kurangJam(int jam){
        if (jumlahJam >= jam){
            jumlahJam -= jam;
            
        } else{
            System.out.println("Pengurangan tidak dapat dilakukan karena jam tidak cukup");
        }
    }
}
