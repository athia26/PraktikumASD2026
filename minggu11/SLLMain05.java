package minggu11;

import java.util.Scanner;

public class SLLMain05 {
    public static void main(String[] args) {
        SingleLinkedList05 sll = new SingleLinkedList05();

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }

        System.out.println("Data index 1: ");
        sll.getData(1);

        System.out.println("Data Mahasiswa an Bimon ada di index: "+sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
        



        // Mahasiswa05 mhs1 = new Mahasiswa05("123", "Aldi", "1A", 3.9);
        // Mahasiswa05 mhs2 = new Mahasiswa05("124", "Budi", "1B", 3.8);
        // Mahasiswa05 mhs3 = new Mahasiswa05("125", "Citra", "1C", 3.7);
        // Mahasiswa05 mhs4 = new Mahasiswa05("126", "Dani", "1D", 3.6);

    }
}
