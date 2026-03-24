package minggu5;

public class mainMhsUjian {
    static int maxUTS (mhsUjian arr[], int l, int r ){
        if (l==r){
            return arr[l].uts;
        }

        int mid = (l+r)/2;
        int kiri = maxUTS(arr, l, mid);
        int kanan = maxUTS(arr, mid+1, r);

        if (kiri > kanan){
            return kiri;
        } else {
            return kanan; 
        }
    }

    static int minUTS (mhsUjian arr[], int l, int r){
        if (l==r){
            return arr[l].uts;
        }

        int mid = (l+r)/2;
        int kiri = minUTS(arr, l, mid);
        int kanan = minUTS(arr, mid+1, r);

        if (kiri < kanan){
            return kiri;
        } else{
            return kanan;
        }

    }

    static double rataUAS (mhsUjian arr[]){
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }

        return total/arr.length;
    }

    public static void main(String[] args) {
        mhsUjian[] mhs = {
            new mhsUjian("Ahmad", "220101001", 2022, 78, 82),
            new mhsUjian("Budi", "220101002", 2022, 85, 88),
            new mhsUjian("Cindy", "220101003", 2021, 90, 87),
            new mhsUjian("Dian", "220101004", 2021, 76, 79),
            new mhsUjian("Eko", "220101005", 2023, 92, 95),
            new mhsUjian("Fajar", "220101006", 2020, 88, 85),
            new mhsUjian("Gina", "220101007", 2023, 80, 83),
            new mhsUjian("Hadi", "220101008", 2020, 82, 84),
            
        };

        int max = maxUTS(mhs, 0, mhs.length-1);
        int min = minUTS(mhs, 0, mhs.length-1);
        double rata = rataUAS(mhs);

        System.out.println("Nilai UTS tertinggi : "+max);
        System.out.println("Nilai UTS terendah  : "+min);
        System.out.println("Rata-rata UAS       : "+rata);
        
    }
}
