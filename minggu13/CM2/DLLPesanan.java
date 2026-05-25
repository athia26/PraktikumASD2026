package minggu13.CM2;

public class DLLPesanan {
    NodePesanan head, tail;
    
    public boolean isEmpty(){
        return head == null;
    }

    public void tambahPesanan(Pesanan data){
        NodePesanan newNode = new NodePesanan(data);

        if(isEmpty()){
            head=tail=newNode;
        } else {
            NodePesanan current = head;

            while (current!=null && current.data.namaPesanan.compareToIgnoreCase(data.namaPesanan)<0) {
                current = current.next;
            }
            
            if (current == null){
                tail.next = newNode;
                newNode.prev = tail;
                tail= newNode;
            } else if(current == head){
                newNode.next = head;
                head.prev = newNode;
                head =newNode;
            } else{
                newNode.next = current;
                newNode.prev = current.prev;

                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
    }

    public void laporanPesanan(){
        if (isEmpty()){
            System.out.println("Belum ada pesanan");
            return;
        } 

        NodePesanan current = head;
        
        System.out.println("======================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================");
        System.out.println("Kode\tNama Pesanan\tHarga");
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }   
    }

   


}
