package minggu6;

import java.util.Scanner;

public class mahasiswaMain05 {
    public static void main(String[] args) {
        Scanner athia = new Scanner(System.in);

        //System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = 5;
        //athia.nextLine();
        
        mahasiswaPrestasi list = new mahasiswaPrestasi(jumlahMhs);

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("--- Data Mahasiswa ke -"+(i+1)+" ---");
            
            System.out.print("NIM : ");
            String nim = athia.nextLine();
            
            System.out.print("Nama : ");
            String nama = athia.nextLine();

            System.out.print("Kelas : ");
            String kelas = athia.nextLine();

            System.out.print("IPK : ");
            double ipk = athia.nextDouble();
            athia.nextLine();

            mahasiswa05 m = new mahasiswa05(nim, nama, kelas, ipk);
            list.tambah(m);

        }


        //System.out.println("Data Mahasiswa sebelum sorting");
        list.tampil();

        System.out.println("----------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("----------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = athia.nextDouble();

        System.out.println("Menggunakan binary searching");
        double posisi = list.findBinarySearch(cari, 0, jumlahMhs-1);
        int pss = (int) posisi; 
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        
    }
}
