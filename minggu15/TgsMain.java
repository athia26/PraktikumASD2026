package minggu15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TgsMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<TgsMahasiswa> listMhs = new ArrayList<>();
        ArrayList<TgsMatkul> listMK = new ArrayList<>();
        ArrayList<TgsNilai> listNilai = new ArrayList<>();

        listMhs.add(new TgsMahasiswa("20001", "Thalhah", "021xxx"));
        listMhs.add(new TgsMahasiswa("20002", "Zubair", "021xxx"));
        listMhs.add(new TgsMahasiswa("20003", "Abdur-Rahman", "021xxx"));
        listMhs.add(new TgsMahasiswa("20004", "Sa'ad", "021xxx"));
        listMhs.add(new TgsMahasiswa("20005", "Sa'id", "021xxx"));
        listMhs.add(new TgsMahasiswa("20006", "Ubaidah", "021xxx"));

        listMK.add(new TgsMatkul("00001", "Internet of Things", 3));
        listMK.add(new TgsMatkul("00002", "Algoritma dan Struktur Data", 2));
        listMK.add(new TgsMatkul("00003", "Algoritma dan Pemrograman", 2));
        listMK.add(new TgsMatkul("00004", "Praktikum Algoritma dan Struktur Data", 3));
        listMK.add(new TgsMatkul("00005", "Praktikum Algoritma dan Pemrograman", 3));

        int pilih;

        do {
            System.out.println("=================================================");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("=================================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();

            switch (pilih) {

                case 1:

                    System.out.print("Kode MK : ");
                    String kode = sc.next();

                    System.out.print("Nilai : ");
                    double nilai = sc.nextDouble();

                    System.out.println("\nDAFTAR MAHASISWA");
                    
                    System.out.println("NIM\tNama\t\tTelp");

                    for (TgsMahasiswa m : listMhs) {
                        System.out.println(m);
                    }

                    System.out.print("\nPilih mahasiswa by nim : ");
                    String nim = sc.next();

                    TgsMahasiswa mhsDipilih = null;
                    TgsMatkul mkDipilih = null;

                    for (TgsMahasiswa m : listMhs) {
                        if (m.nim.equals(nim)) {
                            mhsDipilih = m;
                        }
                    }

                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.println("Kode\tMata Kuliah\t\t\tSKS");

                    for (TgsMatkul mk : listMK) {
                        System.out.println(mk);
                    }

                    for (TgsMatkul mk : listMK) {
                        if (mk.kode.equals(kode)) {
                            mkDipilih = mk;
                        }
                    }

                    if (mhsDipilih != null && mkDipilih != null) {
                        listNilai.add(
                                new TgsNilai(
                                        mhsDipilih,
                                        mkDipilih,
                                        nilai
                                )
                        );
                    }

                    break;

                case 2:

                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("==============================================================");

                    System.out.printf(
                            "%-10s %-15s %-35s %-5s %s\n",
                            "NIM",
                            "Nama",
                            "Mata Kuliah",
                            "SKS",
                            "Nilai"
                    );

                    for (TgsNilai n : listNilai) {
                        n.tampil();
                    }

                    break;

                case 3:

                    System.out.print("Masukkan NIM : ");
                    String cari = sc.next();

                    int totalSKS = 0;

                    for (TgsNilai n : listNilai) {

                        if (n.mahasiswa.nim.equals(cari)) {

                            n.tampil();
                            totalSKS += n.matkul.sks;
                        }
                    }

                    System.out.println("Total SKS " + totalSKS + " telah diambil.");

                    break;

                case 4:

                    Collections.sort(
                            listNilai,
                            Comparator.comparingDouble((TgsNilai n) -> n.nilai)
                                    .reversed()
                    );

                    System.out.println("\nDATA SETELAH DIURUTKAN");

                    for (TgsNilai n : listNilai) {
                        n.tampil();
                    }

                    break;

                case 5:

                    System.out.println("Program selesai...");
                    break;

                default:

                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilih != 5);
    }
}