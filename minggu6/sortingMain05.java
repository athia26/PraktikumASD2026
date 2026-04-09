package minggu6;

public class sortingMain05 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30,20,2,8,14};
        int c[] = {40,10,4,9,3};

        sorting05 dataUrut1 = new sorting05(a, a.length);
        sorting05 dataUrut2 = new sorting05(b, b.length);
        sorting05 dataUrut3 = new sorting05(c, c.length);

        System.out.println("Data Awal 1");
        dataUrut1.tampil();
        dataUrut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataUrut1.tampil();

        System.out.println();

        System.out.println("Data Awal 2");
        dataUrut2.tampil();
        dataUrut2.selectionSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataUrut2.tampil();

        System.out.println();

        System.out.println("Data Awal 3");
        dataUrut3.tampil();
        dataUrut3.selectionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataUrut3.tampil();


    }
    
    
}
