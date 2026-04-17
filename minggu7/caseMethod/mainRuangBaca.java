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
            new Peminjaman(dataMhs[0], dataBuku[0], 16, false), //diganti menjadi lama pinjam 16. 16-5 = 11. lebih dari 10. 
            new Peminjaman(dataMhs[1], dataBuku[1], 3, false),
            new Peminjaman(dataMhs[2], dataBuku[2], 10, false),
            new Peminjaman(dataMhs[2], dataBuku[3], 6, false),
            new Peminjaman(dataMhs[0], dataBuku[1], 4, false)

        };

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM untuk cancel");
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
                    dataPinjam[i].tampilPinjamCanceled(); //untuk menampilkan data peminjam setelah cancel, data yg cancel akan hilang
                }
            } else if (pilihan == 4){
                //insertion-sort
                for (int i = 1; i < dataPinjam.length; i++) { 
                    Peminjaman temp = dataPinjam[i]; 
                    
                    int j = i-1; 
                    while (j >= 0 && dataPinjam[j].denda < temp.denda){
                       
                        dataPinjam [j+1] = dataPinjam[j]; 
                        j--; 
                    }
                    dataPinjam[j+1] = temp;
                }
                System.out.println("Setelah diurutkan (Denda terbesar)");
                for (int i = 0; i < dataPinjam.length; i++) {
                    dataPinjam[i].tampilPinjamCanceled(); //untuk menampilkan data peminjam setelah cancel, data yg terurut adalah data yang tidak cancel 
                }

            } else if (pilihan == 5){
                System.out.print("Masukkan NIM yang akan dicancel : ");
                String cari = athia.nextLine();
                
                boolean ketemu = false; 

                //pengerjaan UTS sesi 4

                for (int i = 0; i < dataPinjam.length; i++) {
                    if(dataPinjam[i].mhs.nim.equals(cari)){
                        System.out.println("\nData yang ditemukan: ");
                        dataPinjam[i].tampilPeminjaman(); //menampilkan data yang dicari 
                        ketemu = true;

                        System.out.print("\nApakah akan mencancel peminjaman tersebut (y/n) ?  "); //konfirmasi akan menghapus atau tidak 
                        String ya = athia.nextLine();
                        
                        if (ya.equalsIgnoreCase("Y")){ //jika pengguna mengetik ya, maka is canceled akan menjadi true, data pengguna akan "terhapus"
                            dataPinjam [i].isCanceled = true;
                        } 
                        
                    }
                }

                System.out.println("\nData Peminjam yang tidak cancel: "); //untuk menampilkan data yang tidak di cancel, dengan is canceled adalah false. 
                for (int i = 0; i < dataPinjam.length; i++) {
                    dataPinjam[i].tampilPinjamCanceled();
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