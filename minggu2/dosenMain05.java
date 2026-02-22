package minggu2;

public class dosenMain05 {
   public static void main(String[] args) {
        dosen05 dsn1 = new dosen05();

        dsn1.idDosen = "245132";
        dsn1.nama = "Pak Wibowo";
        dsn1.statusAktif = true;
        dsn1.tahunGabung = 2010;
        dsn1.keahlian = "Web Pemrograman";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        int masaKerja1 = dsn1.hitungMasaKerja(2026);
        dsn1.ubahKeahlian("Mobile Programing");

        System.out.println("==============");

        dsn1.tampilInformasi();
        System.out.println("Masa Kerja      : "+masaKerja1 + " tahun");


        dosen05 dsn2 = new dosen05("2591737", "Bu Siti", false, 2020, "Agama");


        System.out.println("==============");
        System.out.println("==============");

        dsn2.tampilInformasi();
        dsn2.statusAktif = true;
        int masaKerja2 = dsn2.hitungMasaKerja(2025);
        
        System.out.println("==============");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja      : "+masaKerja2 + " tahun");


   } 
}  
