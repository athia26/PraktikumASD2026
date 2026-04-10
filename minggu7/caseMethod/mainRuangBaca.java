package minggu7.caseMethod;

import java.util.Scanner;

public class mainRuangBaca {


    public static void main(String[] args) {
        Scanner athia = new Scanner(System.in);
        
        Mahasiswa[] dataMhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] dataBuku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] dataPinjam = {
            new Peminjaman(dataMhs[0], dataBuku[0], 7),
            new Peminjaman(dataMhs[1], dataBuku[1], 3),
            new Peminjaman(dataMhs[2], dataBuku[2], 10),
            new Peminjaman(dataMhs[2], dataBuku[3], 6),
            new Peminjaman(dataMhs[0], dataBuku[1], 4)

        };

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih menu (1-6) : ");
            int pilihan = athia.nextInt();
            athia.nextLine();

            if (pilihan == 1){
                System.out.println("\n--- DATA MAHASISWA ---");
                for (int i = 0; i < dataMhs.length; i++) {
                    dataMhs[i].tampilMahasiswa();
                }
            } else if (pilihan == 2){
                System.out.println("\n--- DATA BUKU ---");
                for (int i = 0; i < dataBuku.length; i++) {
                    dataBuku[i].tampilBuku();
                }
            } else if (pilihan == 3){
                System.out.println("\n--- DATA PEMINJAMAN ---");
                for (int i = 0; i < dataPinjam.length; i++) {
                    dataPinjam[i].tampilPeminjaman();
                }
            } else if (pilihan == 4){
                //insertion-sort
                for (int i = 1; i < dataPinjam.length; i++) {
                    Peminjaman temp = dataPinjam[i]; //untuk simpan 
                    int j = i-1;

                    while (j >= 0 && dataPinjam[j].denda < temp.denda){
                        ///kalau data masih di dalam array, dan denda di kiri array lebih kecil dari temp, maka yg lebih kecil 
                        
                        dataPinjam [j+1] = dataPinjam[j]; //misal lagi di j = 0, berarti data [1], ditukar dengan data 
                        j = j-1;
                    }
                    dataPinjam[j+1] = temp;
                }
                System.out.println("Setelah diurutkan (Denda terbesar)");
                for (int i = 0; i < dataPinjam.length; i++) {
                    dataPinjam[i].tampilPeminjaman();
                }

            } else if (pilihan == 5){

                System.out.print("Masukkan NIM yang dicari : ");
                String cari = athia.nextLine();

                System.out.println("Hasil pencarian NIM: ");
                boolean ketemu = false; 

                for (int i = 0; i < dataPinjam.length; i++) {
                    if(dataPinjam[i].mhs.nim.equals(cari)){
                        dataPinjam[i].tampilPeminjaman();
                        ketemu = true;
                    }
                }

                if (!ketemu){
                    System.out.println("Data tidak ditemukan");
                }
                


            } else {
                lanjut = false;
                break;
            }
            
        }
        System.out.println("");
        
        


    }
}
