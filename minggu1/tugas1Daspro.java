package minggu1;
import java.util.Scanner;

public class tugas1Daspro {
    public static void main(String[] args) {
        Scanner athia = new Scanner(System.in);
        char [] kode = {'A','B','D','E','F','G','H','L','N','T'};
        char [][] kota = {
            {'B','A','N','T','E','N'},
            {'J','A','K','A','R','T','A'},
            {'B','A','N','D','U','N','G'},
            {'C','I','R','E','B','O','N'},
            {'B','O','G','O','R'},
            {'P','E','K','A','L','O','N','G','A','N'},
            {'S','E','M','A','R','A','N','G'},
            {'S','U','R','A','B','A','Y','A'},
            {'M','A','L','A','N','G'},
            {'T','E','G','A','L'}
        };

        System.out.print("Masukkan kode plat: ");
        char input = athia.next().charAt(0);

        boolean ketemu = false;

        for (int i = 0; i < kode.length; i++) {
            if (input == kode[i]) {
                System.out.print("Kota: ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                
                ketemu = true;
                break;
            }
        }

        System.out.println();

        if (!ketemu) {
            System.out.println("Kode tidak ditemukan");
        }


    }
}
