package minggu4;

import java.util.Scanner;

public class KendaraanMain {
    public static void main(String[] args) {
        double nilaiEfisien = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Kendaraan[] n = new Kendaraan[jumlah];

        for (int i = 0; i < n.length; i++) {

            System.out.println("=====Data kendaran ke-" + (i + 1) + "=====");

            System.out.print("Masukkan nomor plat kendaraan: ");
            String nomorPlat = sc.nextLine();
            System.out.print("Masukkan jarak tempuh kendaraan: ");
            double jarakTempuh = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukan konsumsi bahan bakar: ");
            double konsumsiBahanBakar = sc.nextInt();
            sc.nextLine();

            n[i] = new Kendaraan(nomorPlat, jarakTempuh, konsumsiBahanBakar, nilaiEfisien);
            double efisien = n[i].efisiensiBBM(jarakTempuh, konsumsiBahanBakar);
            System.out.println("Nilai efisiensi: "+efisien);

        

        }

    }
}
