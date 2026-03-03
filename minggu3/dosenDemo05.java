package minggu3;

import java.util.Scanner;

public class dosenDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jmlDosen = sc.nextInt();
        sc.nextLine();

        dosen05[] arrayofDosen05 = new dosen05[jmlDosen];
        dataDosen05 data = new dataDosen05();

        String kode, nama, jk; 
        Boolean jenisKelamin; 
        int usia; 

        for (int i = 0; i < arrayofDosen05.length; i++) {
            System.out.println("------------------------");
            System.out.println("Masukkan Data Dosen ke-"+(i+1));

            System.out.print("Kode    : ");
            kode = sc.nextLine();
            
            System.out.print("Nama    : ");
            nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            jk = sc.nextLine();
            jenisKelamin = jk.equalsIgnoreCase("L");

            System.out.print("Usia    : ");
            usia = sc.nextInt();
            sc.nextLine();

            arrayofDosen05[i] = new dosen05(kode, nama, jenisKelamin, usia);
            
        }

    data.dataSemuaDosen(arrayofDosen05);
    data.jumlahDosenPerJenisKelamin(arrayofDosen05);
    data.rerataUsiaDosenPerJenisKelamin(arrayofDosen05);
    data.infoDosenPlgTua(arrayofDosen05);
    data.infoDosenPlgMuda(arrayofDosen05);

    }
}
