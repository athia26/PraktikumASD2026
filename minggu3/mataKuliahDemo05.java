package minggu3;

import java.util.Scanner;

public class mataKuliahDemo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah yang akan diinput: ");
        int index = sc.nextInt();
        sc.nextLine();
        mataKuliah05[] arrayOfMataKuliah = new mataKuliah05[index];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("SKS       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------");

            arrayOfMataKuliah[i] = new mataKuliah05();
            arrayOfMataKuliah[i].tambahData(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
            System.out.println("----------------------------");
        }
    }
}
