package minggu4;

import java.util.Scanner;

public class KendaraanMain {
    public static void main(String[] args) {
        double nilaiEfisien = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Kendaraan[] data = new Kendaraan[jumlah];

        for (int i = 0; i < data.length; i++) {

            System.out.println("=====Data kendaran ke-" + (i + 1) + "=====");

            System.out.print("Masukkan nomor plat kendaraan: ");
            String nomorPlat = sc.nextLine();
            System.out.print("Masukkan jarak tempuh kendaraan: ");
            double jarakTempuh = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukan konsumsi bahan bakar: ");
            double konsumsiBahanBakar = sc.nextInt();
            sc.nextLine();

            data[i] = new Kendaraan(nomorPlat, jarakTempuh, konsumsiBahanBakar, nilaiEfisien);
        
        }


        System.out.println();
        System.out.println("===Efisiensi Per Kendaraan===");
        for (int i = 0; i < data.length; i++) {
            data[i].tampilData();
        }

        
        Kendaraan palingEfisien = data[0]; //utk jadi pembanding
        for (int i = 0; i < data.length; i++) {
            if (data[i].efisiensiBBM() > palingEfisien.efisiensiBBM()){
                palingEfisien = data[i];
            }
        }

        System.out.println();
        System.out.println("===Paling Efisien===");
        palingEfisien.tampilData();

        int jumlahDiatas10 = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].efisiensiBBM() > 10 ){
                jumlahDiatas10++;

            }
        }

        double persen = (jumlahDiatas10 * 100)/data.length;

        System.out.println("Persentase efisiensi >10:  "+(int) persen+"% ");


    }
}
