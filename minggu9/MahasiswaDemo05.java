package minggu9;

import java.util.Scanner;

public class MahasiswaDemo05 {
    public static void main(String[] args) {
        StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.println("5. Melihat tugas paling bawah");
            System.out.println("6. Jumlah tugas yang dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa05 mhs = new Mahasiswa05(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan \n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa05 dinilai = stack.pop();
                    if (dinilai != null){
                        System.out.println("Menilai tugas dari "+ dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();

                        if (nilai >= 0 && nilai <= 100) {
                            dinilai.tugasDinilai(nilai);
                            System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        } else {
                            System.out.println("Nilai harus antara 0-100");
                        }
                        
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                
                case 3:
                    Mahasiswa05 lihat = stack.peek();
                    if (lihat != null ){
                        System.out.println("Tugas terakhir dikumpulkan oleh "+lihat.nama);
                    }
                    break;
            
                case 4: 
                    System.out.println("Daftar semua tugas: ");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa05 bawah = stack.peekBottom();
                    if (bawah != null){
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;

                case 6:
                    int jumlah = stack.count();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih>=1 && pilih<=6);
    }    
}
