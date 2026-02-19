package minggu1;

import java.util.Scanner;

public class tugas2Daspro {
    static Scanner athia = new Scanner(System.in);
    static String [][] jadwal;
    public static void main(String[] args) {
        System.out.println("JADWAL KULIAH MAHASISWA");
        

        boolean exit = false;
        while (!exit) {
            System.out.println("\n================================");
            System.out.println("Menu:");
            System.out.println("1. Input jadwal");
            System.out.println("2. Tampilkan jadwal");
            System.out.println("3. Cari dengan hari");
            System.out.println("4. Cari dengan nama matkul");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = athia.nextInt();
            athia.nextLine(); 

            if (menu == 1){
                System.out.print("Masukkan jumlah jadwal: ");
                int n = athia.nextInt();
                athia.nextLine(); 
                jadwal = new String[n][4];

                inputJadwal(jadwal, n);
            } else if (menu == 2){
                tampilkanJadwal(jadwal, jadwal.length);
            } else if (menu == 3){
                cariHari(jadwal, jadwal.length);
            } else if (menu == 4){
                cariMatkul(jadwal, jadwal.length);
            } 
        }
    }

    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = athia.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = athia.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = athia.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = athia.nextLine();
        }
    }

    public static void tampilkanJadwal(String[][] jadwal, int n) {
        System.out.println("\n=== Tampil Jadwal Kuliah ===");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------");       

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n) {
        System.out.print("Masukkan hari yang dicari: ");
        String hari = athia.nextLine();
        System.out.println("\nJadwal pada hari " + hari + ":");
        System.out.printf("%-25s %-20s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------");    
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
                }
                found = true;
            }
        
        if (!found) System.out.println("Tidak ada jadwal pada hari " + hari);
    }

    public static void cariMatkul(String[][] jadwal, int n) {
        System.out.print("Masukkan nama mata kuliah yang dicari: ");
        String matkul = athia.nextLine();
        System.out.println("Jadwal dengan matkul " +matkul+": ");

        System.out.printf("%-25s %-20s %-10s %-15s\n",
        "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------");    

        boolean found = false;  

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.printf("%-25s %-20s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
                }
                found = true;
            }
        
        if (!found) System.out.println("Tidak ada jadwal pada hari " + matkul);
    
    }

}

