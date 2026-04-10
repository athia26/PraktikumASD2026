package minggu6;

import java.util.Scanner;

public class MainDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();

        int pilih;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Termuda → Tertua)");
            System.out.println("4. Sorting DSC (Tertua → Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Kode           : ");
                    String kd = sc.nextLine();

                    System.out.print("Nama           : ");
                    String nama = sc.nextLine();

                    System.out.print("Jenis Kelamin (true=L, false=P): ");
                    boolean jk = sc.nextBoolean();

                    System.out.print("Usia           : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen05 d = new Dosen05(kd, nama, jk, usia);
                    data.tambah(d);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC");
                    data.tampil();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC");
                    data.tampil();
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while(pilih != 0);
    }
}