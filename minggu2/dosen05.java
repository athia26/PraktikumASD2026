package minggu2;

public class dosen05 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunGabung;
    String keahlian; 
    

    public dosen05(){

    }

    public dosen05(String idDosen, String nama, boolean statusAktif, int tahunGabung, String keahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunGabung = tahunGabung;
        this.keahlian = keahlian;
    }

    void tampilInformasi(){
        System.out.println("ID Dosen        : "+idDosen);
        System.out.println("Nama Dosen      : "+nama);
        if (statusAktif){
            System.out.println("Status Aktif    : ✅ Aktif");
        } else {
            System.out.println("Status Aktif    : ❌ Tidak Aktif ");
        }
        System.out.println("Tahun Bergabung : "+tahunGabung);
        System.out.println("Bidang Keahlian : "+keahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;

    }

    int hitungMasaKerja (int tahunSkrg){
       int masaKerja = tahunSkrg - tahunGabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        keahlian = bidang;
    }

}
