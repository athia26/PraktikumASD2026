package minggu2;

public class mahasiswa {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public mahasiswa(){

    }

    public mahasiswa(String nama, String nim, double ipk, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kelas;
    }

    void tampilkanInformasi(){
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("IPK: "+ipk);
        System.out.println("Kelas: "+kelas);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIPK (double ipkBaru){
        
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0){
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid, harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja (){
        if (ipk >= 3.5){
            return "Kinerja sangat baik";
        } else if (ipk >= 3){
            return "Kinerja baik";
        } else if (ipk >= 2.0){
            return "Kinerja cukup";
        } else{
            return "Kinerja kurang";
        }
    }

}
