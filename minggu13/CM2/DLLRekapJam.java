package minggu13.CM2;

public class DLLRekapJam {
    NodeRekapJam head, tail;

    public boolean isEmpty(){
        return head == null; 
    }

    public void tambahJam (String jam){
        NodeRekapJam current = head; //data current diambil dari data paling depan dari DLL rekap jam 

            while(current != null){ //selama data bukan null, maka lanjutkan 
        
                if(current.dataPerJam.jam.equals(jam)){ //jika data current, data jam nya dari objek tersebut sesuai dengan jam yang dimasukkan,
                    current.dataPerJam.jumlahPesanan++;  //maka jumlahPesanan untuk node rekap jam bertambah 1  
                    return; //keluar dari if
                }
        
                current = current.next; //data di dalam current maju selanjutnya dari data awal
            }
        
            NodeRekapJam newNode = new NodeRekapJam(new RekapJam(jam)); //membuat node baru jika 
        
            if(isEmpty()){ //jika node masih kosong, maka jadikan node tersebut head dan tail 
                head = tail = newNode;
            } else{ //jika tidak: maka disambungkan dengan node sebelumnya dengan addLast()
                tail.next = newNode; //setelahnya data paling akhir diisi oleh new node
                newNode.prev = tail; //sebelumnya data baru, adalah data paling akhir 
                tail = newNode; //data paling akhir diganti menjadi new node
        }
    }

    public void tampil(){

        System.out.println("======================");
        System.out.println("REKAP PER JAM");
        System.out.println("======================");
        System.out.println("Jam\tJumlah");
        
        NodeRekapJam current = head;
        
        while(current != null){
        
        current.dataPerJam.tampilJam();
        
            current = current.next;
        }
    }
        
}
