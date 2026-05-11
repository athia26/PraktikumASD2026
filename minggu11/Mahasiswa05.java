package minggu11;

public class Mahasiswa05 {
    String nama, nim, kelas;
    double ipk;

    public Mahasiswa05(){

    }

    public Mahasiswa05(String nm, String name, String kls, double ip ){
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    
    }

    public void tampilInformasi(){
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk + "\t\t");
    }

}
