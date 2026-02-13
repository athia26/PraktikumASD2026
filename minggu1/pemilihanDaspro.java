package minggu1;
import java.util.Scanner;

public class pemilihanDaspro {
    public static void main(String[] args) {
        Scanner athia = new Scanner(System.in);

        int tugas = 0, kuis = 0, uas = 0, uts = 0;
        double nilaiAkhir = 0;
        String nilaiHuruf = "";
        


        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================================");
        System.out.print("Masukkan nilai tugas: ");
        tugas = athia.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        kuis = athia.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        uts = athia.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        uas = athia.nextInt();

        System.out.println("=================================");
        System.out.println("=================================");

        if (tugas < 0 || kuis <0 || uts <0 || uas <0 || tugas > 100 || kuis > 100 || uts > 100 || uas > 100){
            System.out.println("Nilai tidak valid! ");
            System.out.println("=================================");
            System.out.println("=================================");
        } else{
            nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100){
                nilaiHuruf = "A";

            } else if (nilaiAkhir > 73 && nilaiAkhir <=80){
                nilaiHuruf = "B+";
                
            }else if (nilaiAkhir > 65 && nilaiAkhir <=73){
                nilaiHuruf = "B";
                
            }else if (nilaiAkhir > 60 && nilaiAkhir <=65){
                nilaiHuruf = "C+";
                
            }else if (nilaiAkhir > 50 && nilaiAkhir <=60){
                nilaiHuruf = "C";
                
            }else if (nilaiAkhir > 39 && nilaiAkhir <=50){
                nilaiHuruf = "D";
                
            } else{
                nilaiHuruf = "E";
                
            }

            System.out.print("Nilai akhir: "+nilaiAkhir);
            System.out.println();
            System.out.print("Nilai huruf: "+nilaiHuruf);
            System.out.println();
            System.out.println("=================================");
            System.out.println("=================================");
        }

    }
}
