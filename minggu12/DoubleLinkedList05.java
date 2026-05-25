package minggu12;

public class DoubleLinkedList05 {
    Node05 head, tail;
    int size;

    public DoubleLinkedList05(){
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        return (head == null);
    }

    public void addFirst (Mahasiswa05 data){
        Node05 newNode = new Node05(data); //membuat node baru 
        if (isEmpty()){
            head = tail = newNode; //kalau kosong, node baru jadi head dan tail
        } else { //mau memasukkan node baru ke paling depan
            newNode.next = head; //node baru menunjuk setelahnya ke head yg lama 
            head.prev = newNode; //head sebelumnya menunjuk ke node baru
            head = newNode; //head nya diganti node baru 
        }
        size++; //menambah size
    }

    public void addLast (Mahasiswa05 data){
        Node05 newNode = new Node05(data);
        if (isEmpty()){
            head = tail = newNode; //kalau kosong, node baru jadi head dan tail 
        } else{ //mau memasukkan node baru ke paling belakang
            tail.next = newNode; //tail lama menunjuk selanjutnya ke node baru 
            newNode.prev = tail; //node baru menunjuk sebelumnya ke tail lama 
            tail = newNode; //tail menjadi node baru 
        }
        size++;
    }

    public void insertAfter (String keyNim, Mahasiswa05 data){
        Node05 current = head; //head jadi variabel current yg jalan jalan nyari data
        while (current != null && !current.data.nim.equals(keyNim)) { //selama current bukan null dan current belum sesuai dengan keyNim, 
            current = current.next; //maka current tetap jalan ke selanjutnya 
        } 

        if (current == null){ //kalau sampai akhir current nya null, berarti gada nim yg dimau 
            System.out.println("Data dengan NIM "+ keyNim + " tidak ditemukan");
            return;
        }

        Node05 newNode05 = new Node05(data); //membuat node baru 

        if (current==tail){ //jika current nya di tail
            newNode05.prev = current; //node baru menunjuk sebelumnya ke variabel current 
            current.next = newNode05; //current sebelumnya menunjuk setelahnya ke node baru  
            tail = newNode05; //tail jadi node baru 
        } else {
            newNode05.prev = current; //node baru menunjuk sebelumnya ke variabel current 
            newNode05.next = current.next; //node baru menunjuk setelahnya ke setelahnya variabel current
            current.next.prev = newNode05; //node setelah current nunjuk sebelumnya ke node baru  
            current.next = newNode05; //setelahnya current nunjuk ke node baru 
        }
        System.out.println("Data berhasil disisipkan setelah NIM "+ keyNim);
        size++;
    }

    public void add(int index, Mahasiswa05 data){
        if (index < 0){
            System.out.println("Index tidak valid");
            return;
        } 

        if (index == 0){
            addFirst(data);
            return;
        }

        Node05 current = head;
        int i = 0;

        while (current != null && i < index - 1) {
            current = current.next;
            i++; //utk maju setelah 
        }

        if (current == null){
            System.out.println("Index melebihi jumlah data");
            return;
        }

        Node05 newNode = new Node05(data);

        if (current == tail){
            addLast(data);
            return;
        } else{
            newNode.next = current.next; //setelahnya node baru nunjuk ke setelahnya current 
            newNode.prev = current; //node baru sebelumnya nunjuk ke current 
            current.next.prev = newNode; //node setelahnya current menunjuk sebelumnya ke node baru 
            current.next = newNode; //current menunjuk setelahnya ke node baru 
            
        }
        size++;
        
    }

    public void removeAfter(String keyNim){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
    
        Node05 current = head; //current nya head utk sementara
    
        while (current != null && !current.data.nim.equals(keyNim)){
            current = current.next; //slama current bukan null dan bukan sesuai keynim, current lanjut jalan terus 
        }
    
        if (current == null || current.next == null){
            System.out.println("Node setelah key tidak ditemukan"); //jika tidak ada current yg dimau, maka ga ketemu
            return;
        }
    
        Node05 removedNode = current.next; //node yg mau dihapus adalah setelahnya current 
    
        if (removedNode == tail){
            tail = current;
            tail.next = null;
        } else{
            current.next = removedNode.next;
            removedNode.next.prev = current;
        }
    
        System.out.println("Data berhasil dihapus");
        removedNode.data.tampil();
        size--;
    }

    public void remove(int index){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
    
        if (index < 0){
            System.out.println("Index tidak valid");
            return;
        }
    
        if (index == 0){
            removeFirst();
            return;
        }
    
        Node05 current = head;
        int i = 0;
    
        while (current != null && i < index){
            current = current.next;
            i++;
        }
    
        if (current == null){
            System.out.println("Index tidak ditemukan");
            return;
        }
    
        if (current == tail){
            removeLast();
        } else{
            current.prev.next = current.next;
            current.next.prev = current.prev;
    
            System.out.println("Data berhasil dihapus");
            current.data.tampil();
        }
        size--;
    }


    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }

        Mahasiswa05 dataHapus = head.data;

        if (head == tail){ //jika head == tail maka keduanya dijadikan null 
            head = tail = null;
        } else{ 
            head = head.next; //head nya jadi setelahnya head
            head.prev = null; //sebelumnya head jadi null 
        }
        System.out.println("Data berhasil dihapus");
        dataHapus.tampil();
        size--;
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list kosong");
            return;
        }

        Mahasiswa05 dataHapus = tail.data;

        if (head == tail){
            head = tail = null;
        } else{
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus");
        dataHapus.tampil();
        size--;
    }

    public void getFirst(){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
    
        head.data.tampil();
    }

    public void getLast(){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
    
        tail.data.tampil();
    }

    public void getIndex(int index){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
    
        Node05 current = head;
        int i = 0;
    
        while (current != null && i < index){
            current = current.next;
            i++;
        }
    
        if (current == null){
            System.out.println("Index tidak ditemukan");
            return;
        }
    
        current.data.tampil();
    }

    public int size() {
        return size;
        
    }

    public void printSize() {
        System.out.println("Jumlah data: "+size);
        
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Linked List Kosong");
            return;
        }

        Node05 current = head;
        while (current != null){
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReserve(){
        if (isEmpty()){
            System.out.println("Linked list kosong");
            return;
        } 

        Node05 current = tail;

        while(current != null){
            current.data.tampil();
            current = current.prev;
        }
    }
}
