package minggu1;
import java.util.Scanner;

public class arrayDaspro {
    public static void main(String[] args) {
        Scanner athia = new Scanner(System.in);

        String [] matkul = {
            "Pancasila",
            "KTI",
            "CTPS",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum DasPro",
            "K3"
        };

        int [] sks = {2,3,2,3,2,3,1,2};
        double [] nilaiAngka = new double[matkul.length];
        String [] nilaiHuruf = new String[matkul.length];
        double [] bobotNilai = new double[matkul.length];

        double totalBobot = 0;
        int totalSKS = 0;

        System.out.println("========================");
        System.out.println("Program Menghitung IP Semester: ");
        System.out.println("========================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai untuk matkul "+matkul[i]+": ");
            nilaiAngka [i] = athia.nextDouble();

            if (nilaiAngka [i] > 80 && nilaiAngka[i] <= 100){
                nilaiHuruf [i] = "A";
                bobotNilai [i] = 4.0;
            } else if (nilaiAngka [i] > 73 && nilaiAngka [i] <=80){
                nilaiHuruf [i] = "B+";
                bobotNilai [i] = 3.5;
            }else if (nilaiAngka [i] > 65 && nilaiAngka [i] <=73){
                nilaiHuruf [i] = "B";
                bobotNilai [i] = 3.0;
            }else if (nilaiAngka [i] > 60 && nilaiAngka [i] <=65){
                nilaiHuruf [i] = "C+";
                bobotNilai [i] = 2.5;
            }else if (nilaiAngka [i] > 50 && nilaiAngka [i] <=60){
                nilaiHuruf [i] = "C";
                bobotNilai [i] = 2.0;
            }else if (nilaiAngka [i] > 39 && nilaiAngka [i] <=50){
                nilaiHuruf [i] = "D";
                bobotNilai [i] = 1.0;
            } else{
                nilaiHuruf [i] = "E";
                bobotNilai [i] = 0.0;
            }

            totalBobot += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
            
        }

        double IP = totalBobot / totalSKS;

        System.out.printf("%-40s %-12s %-12s %-12s\n", 
        "MK", "Nilai Angka", "Nilai Huruf", "Bobot");

            for (int i = 0; i < matkul.length; i++) {
                System.out.printf("%-40s %-12.2f %-12s %-12.2f\n",
                        matkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            }
        

        System.out.println("========================");
        System.out.printf("IP Semester : %.2f\n", IP);

    }
}

