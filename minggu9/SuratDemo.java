package minggu9;

import java.util.Scanner;

public class SuratDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat stack = new StackSurat(5);

        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("\1. Terima Surat Izin ");
            System.out.println("2. Proses Surat Izin ");
            System.out.println("3. Lihat Surat Terakhir ");
            System.out.println("4. Cari surat");
            System.out.println("2. Proses Surat Izin ");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih){
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    Surat05 s = new Surat05(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:
                    Surat05 proses = stack.pop();
                    if (proses != null){
                        System.out.println("Memproses surat dari " + proses.namaMhs);
                    }
                    break;

                case 3:
                    Surat05 lihat = stack.peek();
                    if (lihat != null){
                        System.out.println("Surat terakhir dari " + lihat.namaMhs);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = scan.nextLine();
                    stack.cari(cari);
                    break;

                case 0:
                    System.out.println("Keluar program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }

            
        } while (pilih != 0);
    }
}
