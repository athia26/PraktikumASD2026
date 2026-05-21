|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 12 DOUBLE LINKED-LIST

## 12.1. Praktikum 1

- Code Program 
    - [Mahasiswa05.java](Mahasiswa05.java)
    - [Node05.java](Node05.java)
    - [DoubleLinkedList05.java](DoubleLinkedList05.java)
    - [DoubleLinkedListMain05.java](DoubleLinkedListMain05.java)

- Hasil Praktikum 1: 

    ```java
    === MENU DOUBLE LINKED LIST ===
    1. Tambah data di awal
    2. Tambah data di akhir
    3. Sisipkan data di tengah
    4. Hapus data di awal
    5. Hapus data di akhir
    6. Tampilkan data
    0. Keluar
    Pilih menu: 2
    Masukkan NIM : 123005
    Masukkan Nama : Harry
    Masukkan Kelas : 1A
    Masukkan Kelas : 3.76

    === MENU DOUBLE LINKED LIST ===
    1. Tambah data di awal
    2. Tambah data di akhir
    3. Sisipkan data di tengah
    4. Hapus data di awal
    5. Hapus data di akhir
    6. Tampilkan data
    0. Keluar
    Pilih menu: 3
    Masukkan NIM yang dicari: 123005
    Masukkan data baru: 
    Masukkan NIM : 123010
    Masukkan Nama : Potter
    Masukkan Kelas : 1B
    Masukkan Kelas : 3.55
    Data berhasil disisipkan setelah NIM 123005

    === MENU DOUBLE LINKED LIST ===
    1. Tambah data di awal
    2. Tambah data di akhir
    3. Sisipkan data di tengah
    4. Hapus data di awal
    5. Hapus data di akhir
    6. Tampilkan data
    0. Keluar
    Pilih menu: 6
    NIM    : 123005
    Nama : Harry
    Kelas: 1A
    IPK   : 3.76

    NIM    : 123010
    Nama : Potter
    Kelas: 1B
    IPK   : 3.55
    ```

- Pertanyaan Praktikum 1: 
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!
    
    - Single linked list hanya punya satu pointer yaitu next, jadi traversal hanya bisa dilakukan dari depan ke belakang sebanyak sekali. Sedangkan double linked list memiliki dua pointer yaitu next dan prev, sehingga traversal bisa dilakukan dua arah. 

2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!
    
    - atribut next untuk menunjuk node berikutnya sehingga traversal bisa maju ke depan, sedangkan atribut prev digunakan untuk menunjuk node sebelumnya sehingga traversal bisa mundur ke blkg. 2 atribut ini digunakan juga untuk proses penyisipan/penghapusan node agar node tetap terhubung 

3. Perhatikan class Node, di dalamnya terdapat atribut next dan prev.Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!

    - Konstruktor pada class DoubleLinkedList berfungsi mengatur kondisi awal linked list agar kosong dengan menginisialisasi head dan tail bernilai null.

4. Perhatikan potongan kode berikut:
    
    if (isEmpty()) {
    head = tail = newNode;
    }

    - Karena saat linked list masih kosong dan data pertama ditambahkan, node tersebut menjadi satu-satunya node dalam linked list. Maka, head dan tail harus menunjuk node yang sama karena node pertama juga merupakan node terakhir.

5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!

    ```java
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
    ```


6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!

    ```java
    public void printReserve(){
        if (isEmpty()){
            System.out.println("Linked list masih kosong");
            return;
        } 

        Node05 current = tail;

        while(current != null){
            current.data.tampil();
            current = current.prev;
        }
    }
    ```

## 12.2. Praktikum 2

- Code Program 
    - [Mahasiswa05.java](Mahasiswa05.java)
    - [Node05.java](Node05.java)
    - [DoubleLinkedList05.java](DoubleLinkedList05.java)
    - [DoubleLinkedListMain05.java](DoubleLinkedListMain05.java)

- Hasil Praktikum 2: 

```java
=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 5
Data berhasil dihapus

=== MENU DOUBLE LINKED LIST ===
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu: 6
NIM    : 123005
Nama : Harry
Kelas: 1A
IPK   : 3.76
```
- Pertanyaan Praktikum 2: 
1. Perhatikan potongan kode berikut pada method removeFirst(): head = head.next; head.prev = null; Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!

    - head = head.next; -> untuk memindahkan head ke node berikutnya, jadi node pertama sebelumnya terhapus dari linked list

    - head.prev = null; -> untuk menghapus hubungan node baru dengan node sebelumnya, jadi head baru tdk lagi menunjuk ke node yang sudah dihapus 

2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!

    ```java
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
    }
    ```

## 12.3. Tugas Praktikum 
1. Tambahkan method add(int index, Mahasiswa data) untuk menambahkan node pada indeks tertentu!

    ```java
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
    }
    ```

2. Tambahkan method removeAfter() untuk menghapus node setelah node yang memiliki data key tertentu!
    ```java
    public void removeAfter(String keyNim){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }`

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
    }
    ```

3. Tambahkan method remove(int index) untuk menghapus node pada indeks tertentu!
    ```java
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
    }
    ```

4. Tambahkan method:
    
    a. getFirst()

    ```java
    public void getFirst(){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
        
        head.data.tampil();
    }
    ```
    
    b. getLast()
    
    ```java
    public void getLast(){
        if (isEmpty()){
            System.out.println("Linked List kosong");
            return;
        }
    
        tail.data.tampil();
    }
    ```

    c. getIndex()

    ```java
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
    ```
    
5. Tambahkan atribut dan method untuk menghitung jumlah data (size) pada Double Linked List.
    
    ```java
    public int size() {
        return size;
        
    }

    public void printSize() {
        System.out.println("Jumlah data: "+size);
        
    }
    ```

    - Juga menambahkan size++ untuk di method add, dan size-- di method remove
    
