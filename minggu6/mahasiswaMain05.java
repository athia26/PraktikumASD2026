package minggu6;

import java.util.Scanner;

public class mahasiswaMain05 {
    public static void main(String[] args) {
        Scanner athia = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMhs = athia.nextInt();
        athia.nextLine();
        
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


        System.out.println("Data Mahasiswa sebelum sorting");
        list.tampil();

        // System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        // list.bubbleSort();
        // list.tampil();

        System.out.println("Data Mahasiswa sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
    }
}
