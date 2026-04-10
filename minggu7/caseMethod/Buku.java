package minggu7.caseMethod;

public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    Buku(String kode, String judul, int tahun){
        this.kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }
    
    public void tampilBuku (){
        System.out.print("Kode Buku  :  "+kodeBuku+" | ");
        System.out.print("Judul Buku :  "+judul+" | ");
        System.out.print("Tahun :  "+tahunTerbit);
        System.out.println();
    }


}
