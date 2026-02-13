package minggu1;

public class fungsiDaspro {

    public static void main(String[] args) {
        int[][] stock = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 },
        };

        int[] harga = { 75000, 50000, 60000, 10000 };

        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock, harga, i);

            System.out.println("Royal Garden " + i + 1);
            System.out.println("Pendapatan: Rp. " + pendapatan);
            System.out.println("Status: " + statusCabang(pendapatan));
        }

    }

    public static int hitungPendapatan(int[][] stock, int[] harga, int cabang) {
        int total = 0;

        for (int i = 0; i < harga.length; i++) {
            total += stock[cabang][i] * harga[i];
        }
        return total;

    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

}
