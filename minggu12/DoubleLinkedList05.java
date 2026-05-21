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
        Node05 newNode = new Node05(data);
        if (isEmpty()){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast (Mahasiswa05 data){
        Node05 newNode = new Node05(data);
        if (isEmpty()){
            head = tail = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter (String keyNim, Mahasiswa05 data){
        Node05 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        } 

        if (current == null){
            System.out.println("Data dengan NIM "+ keyNim + " tidak ditemukan");
            return;
        }

        Node05 newnNode05 = new Node05(data);

        if (current==tail){
            newnNode05.prev = current;
            current.next = newnNode05;
            tail = newnNode05;
        } else {
            newnNode05.prev = current;
            newnNode05.next = current.next;
            current.next.prev = newnNode05;
            current.next = newnNode05;
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
            i++;
        }

        if (current == null){
            System.out.println("Index melebihi jumlah data");
            return;
        }

        Node05 newNode = new Node05(data);

        if (current == tail){
            addLast(data);
        } else{
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    public void removeAfter(String keyNim){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
    
        Node05 current = head;
    
        while (current != null && !current.data.nim.equals(keyNim)){
            current = current.next;
        }
    
        if (current == null || current.next == null){
            System.out.println("Node setelah key tidak ditemukan");
            return;
        }
    
        Node05 removedNode = current.next;
    
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

        if (head == tail){
            head = tail = null;
        } else{
            head = head.next;
            head.prev = null;
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
