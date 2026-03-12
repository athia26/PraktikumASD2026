package minggu4;

public class Kendaraan {
    String nomorPlat; 
    double jarakTempuh;
    double konsumsiBahanBakar;
    double nilaiEfisiensi;
    

    public Kendaraan(String nomorPlat, double jarakTempuh, double konsumsiBahanBakar, double nilaiEfisien){
        this.nomorPlat = nomorPlat;
        this.jarakTempuh = jarakTempuh;
        this.konsumsiBahanBakar = konsumsiBahanBakar;
        this.nilaiEfisiensi = nilaiEfisien;
    } 

    public double efisiensiBBM(double jarakT, double bahanBakar){
        nilaiEfisiensi = 0;

        nilaiEfisiensi = jarakT/bahanBakar;
        
        return nilaiEfisiensi;

    }

    public void tampilData(Kendaraan[] arrKendaraan){
        Kendaraan terefisien = arrKendaraan [0];
        
        for (int i = 1; i < arrKendaraan.length; i++) {
            if (arrKendaraan[i].nilaiEfisiensi > terefisien.nilaiEfisiensi){
                terefisien =  arrKendaraan[i]; 
            }
        }

        System.out.println("Kendaraan paling efisien adalah dengan plat nomor: "+terefisien.nomorPlat);
    }

}

