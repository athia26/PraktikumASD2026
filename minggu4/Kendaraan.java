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

    public double efisiensiBBM(){
        
        return jarakTempuh / konsumsiBahanBakar;

    }

    public void tampilData(){
        System.out.println("Plat Nomor: " +nomorPlat);
        System.out.println("Jarak Tempuh: " +jarakTempuh);
        System.out.println("Konsumsi BBM: " +konsumsiBahanBakar);
        System.out.println("Efisiensi: "+ efisiensiBBM());
        System.out.println("-----------------------------");
    }

}

