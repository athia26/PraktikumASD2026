package minggu11;

public class tgsMain {

    public static void main(String[] args) {
        tgsQueueMhs antrian = new tgsQueueMhs();

        antrian.tambahkanAntrian("12345", "Andi");
        antrian.tambahkanAntrian("12346", "Budi");
        antrian.tambahkanAntrian("12347", "Citra");

        System.out.println("------------------------------------");
        antrian.jumlahAntrian();
        antrian.print();

        System.out.println("------------------------------------");
        antrian.tampilAntrian();

        System.out.println("------------------------------------");
        antrian.panggilAntrian();
        antrian.tampilAntrian();

        System.out.println("------------------------------------");
        antrian.clear();
        antrian.jumlahAntrian();




    }
}