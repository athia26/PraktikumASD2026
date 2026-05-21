package minggu12;

import java.util.Scanner;

public class DoubleLinkedListMain05 {
    
    public static Mahasiswa05 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM : ");
        String nim = scan.nextLine();
    
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
    
        System.out.print("Masukkan Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("Masukkan Kelas : ");
        double ipk = scan.nextDouble();

    
        return new Mahasiswa05(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList05 list = new DoubleLinkedList05();
        int pilihan;

        do {
            System.out.println("\n=== MENU DOUBLE LINKED LIST ===");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa05 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                
                case 2:
                    Mahasiswa05 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                
                case 3: 
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNIM = scan.nextLine();
                    System.out.println("--- Masukkan data baru--- ");
                    Mahasiswa05 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNIM, dataBaru);
                    break;
                
                case 4: 
                    list.removeFirst();
                    break;
                
                case 5: 
                    list.removeLast();
                    break;

                case 6: 
                    list.print();
                    break;
                
                case 0: 
                    System.out.println("Program selesai");
                    break;
            
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }


        } while (pilihan != 0);
    }    
}
