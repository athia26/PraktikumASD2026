package minggu13.CM2;

import java.util.Scanner;

public class MainResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DLLPembeli antrian = new DLLPembeli();
        DLLPesanan pesanan = new DLLPesanan();
        DLLRekapJam rekap = new DLLRekapJam();

        int pilih;

        do {
            System.out.println("==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian ");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Laporan Pesanan Per Jam ");
            System.out.println("0. Keluar");
            System.out.println("------------------------------");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    antrian.tambahAntrian(new Pembeli(1, "Ainra", "0822450000"));
                    antrian.tambahAntrian(new Pembeli(2, "Danra", "0822451111"));
                    antrian.tambahAntrian(new Pembeli(3, "Sanri", "0822452222"));
                    antrian.tambahAntrian(new Pembeli(4, "Vania", "0822453333"));

                    System.out.println("Antrian sudah ditambahkan");
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;
            
                case 3:
                
                    Pembeli p = antrian.layaniPembeli();

                    if (p != null){
                        System.out.println("--- Tambahkan Pesanan ---");
                        
                        System.out.println("Jam Pesan: ");
                        String jamPesan = sc.nextLine();

                        System.out.print("Kode Pesanan  : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan  : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga       : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan newPesanan = new Pesanan(kode, namaPesanan, harga, jamPesan);

                        pesanan.tambahPesanan(newPesanan);


                        System.out.println(p.namaPembeli + " telah memesan "+namaPesanan);
                    }
                    break;

                case 4: 
                    pesanan.laporanPesanan();
                    break;

                case 5: 
                    rekap = pesanan.buatRekapJam(); //memanggil method buatrekapjam dari dll pesanan untuk menambahkan dll pesanan dan dilakukan pengecekan di dll rekap jam 
                    rekap.tampil();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;
                
                    default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (pilih != 0);
    }
}





