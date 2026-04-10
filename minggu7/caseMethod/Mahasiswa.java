package minggu7.caseMethod;


public class Mahasiswa {
    String nim, nama, prodi;

    Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void tampilMahasiswa (){
        System.out.print("NIM:  "+nim+"  |  ");
        System.out.print("Nama:  "+nama+"  |  ");
        System.out.print("Prodi:  "+prodi);
        System.out.println();
    }
}
