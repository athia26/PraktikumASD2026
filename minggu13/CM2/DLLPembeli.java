package minggu13.CM2;

public class DLLPembeli {
    NodePembeli head, tail;
    int nomorAntri = 1;

    public boolean isEmpty(){
        return head == null;
    }

    public void tambahAntrian(Pembeli data){ //addLast()
        
        NodePembeli newNode = new NodePembeli(data);

        if (isEmpty()){
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        
    }

    public void cetakAntrian(){ //print()
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
            return;
        }

        NodePembeli current = head;
        System.out.println("======================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================");
        System.out.println("No Antrian\tNama\tNo HP");

        while (current != null) {
            current.data.tampil();
            current = current.next;
            
        }
    }

    public Pembeli layaniPembeli(){
        if (isEmpty()){
            System.out.println("Antrian masih kosong");
            return null;
        } 

        Pembeli data = head.data;

        if (head==tail){
            head=tail=null;
        } else{
            head = head.next;
            head.prev = null;
        }
        return data;
    }
}
