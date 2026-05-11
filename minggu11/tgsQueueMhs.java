package minggu11;

public class tgsQueueMhs {
    tgsNode head, tail;
    int size;

    public tgsQueueMhs(){
        this.head = this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public boolean isFull(){
        return false;
    }

    public void clear(){
        head = tail = null;
        size = 0;
        System.out.println("Antrian sudah kosong");
    }

    public void tambahkanAntrian (String nim, String nama){
        tgsMahasiswa antriBaru = new tgsMahasiswa(nim, nama);
        tgsNode nodeBaru = new tgsNode(antriBaru);

        if (isEmpty()){
            head = tail = nodeBaru;
        } else {
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
        size++;
        System.out.println(nama + " sudah masuk antrian");
    }

    public void panggilAntrian(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return;
        }  
        System.out.println("Memanggil antrian: "+head.data.nama);
        head = head.next;
        if (head == null){
            tail = null;
        }

        size--;
    }

    public void tampilAntrian (){
        if (!isEmpty()){
            System.out.println("Antrian terdepan: "+head.data);
            System.out.println("Antrian terakhir: "+tail.data);
        } else{
            System.out.println("Antrian kosong");
        }
    }

    public void jumlahAntrian (){
        System.out.println("Jumlah mahasiswa dalam antrian: "+size);
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Antrian kosong");
            return;
        }
        tgsNode temp = head;
        System.out.println("Daftar antrian sekarang: ");
        while (temp != null){
            System.out.println("- "+temp.data);
            temp = temp.next;
        }
    }
}
