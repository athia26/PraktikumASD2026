package minggu10;

public class AntrianKRS {
    Mahasiswa [] data;
    int front;
    int rear;
    int size;
    int max = 10;

    int sudahDilayani = 0;
    int maxDilayani = 30;

    public AntrianKRS(){
        data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;

        System.out.println(mhs.nama + " masuk antrian");
    }

    public void prosesKRS() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Mahasiswa dipanggil:");

        for (int i = 0; i < 2; i++) {

            if (!isEmpty() && sudahDilayani < maxDilayani) {

                Mahasiswa mhs = data[front];
                mhs.tampilkanData();

                front = (front + 1) % max;
                size--;
                sudahDilayani++;
            }
        }
    }

    public void tampilkanSemua() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Daftar Antrian:");

        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void lihatTerdepan() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("2 Antrian Terdepan:");

        for (int i = 0; i < 2 && i < size; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void lihatAkhir() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        System.out.println("Antrian paling akhir:");
        data[rear].tampilkanData();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahSudahDilayani() {
        System.out.println("Sudah proses KRS: " + sudahDilayani);
    }

    public void sisaBelumDilayani() {
        System.out.println("Belum proses KRS: " + (maxDilayani - sudahDilayani));
    }
}


