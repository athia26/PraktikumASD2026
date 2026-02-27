package minggu3;

public class mataKuliah05 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public mataKuliah05(){
       
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo(){
        System.out.println("Kode        : "+kode);
        System.out.println("Nama        : " +nama);
        System.out.println("SKS         : "+sks);
        System.out.println("Jumlah Jam  : "+jumlahJam);
    }



}
