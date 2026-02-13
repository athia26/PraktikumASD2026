package minggu1;
import java.util.Scanner;

public class pengulanganDaspro {
    public static void main(String[] args) {
        Scanner athia = new Scanner(System.in);
        String nim;

        System.out.print("Masukkan NIM: ");
        nim = athia.nextLine();
        System.out.print("Masukkan 2 digit terakhir NIM: ");
        int n = athia.nextInt();

        if (n < 10){
            n = n + 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i == 10 || i == 15){
                continue;
            }

            if (i%3 == 0){
                System.out.print("# ");
            } else if (i%2 == 0){
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
            
        }
        
    }
}
