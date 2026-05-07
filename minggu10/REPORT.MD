|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 10 QUEUE

## 10.1. Praktikum 1: Operasi dasar queue

### Hasil praktikum 1: 

```java
Masukkan kapasitas queue: 4
----------------------
Masukkan operasi yg diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------
Pilih menu: 1
Masukkan data baru: 15
----------------------
Masukkan operasi yg diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------
Pilih menu: 1
Masukkan data baru: 31
----------------------
Masukkan operasi yg diinginkan: 
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
----------------------
Pilih menu: 4
Elemen terdepan: 15
----------------------
```


### Pertanyaan Praktikum 1: 
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?

- Karena saat queue baru dibuat, queue masih kosong dan belum ada data sama sekali. front = -1 -> menandakan belum ada elemen terdepan. rear = -1 -> menandakan belum ada elemen terakhir. size = 0 -> jumlah elemen dalam queue masih nol. Jadi -1 dipakai sebagai penanda khusus bahwa queue belum terisi. 

2. Pada method enqueue, jelaskan potongan kode berikut!

    ```java
    if(isEmpty()){
        front = rear = 0;
    }
    ```

- Kode ini dijalankan saat queue masih kosong dan akan dimasukkan elemen pertama.

3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!

    ```java
    dt = data[front];
    size--;
    ```

- Digunakan untuk mengambil data paling depan dari queue lalu mengurangi jumlah elemen.

4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?

- Karena elemen pertama queue belum tentu berada di index 0.

5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!

    ```java
    i = (i+1) % max;
    ```

- Digunakan untuk perpindahan index pada circular queue. Agar index bisa kembali ke awal array setelah mencapai index terakhir.

6. Tunjukkan potongan kode program yang merupakan queue overflow!

    ```java
    if (isFull()){
    System.out.println("Queue sudah penuh");
    }
    ```

7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!

    ```java
    public void enqueue(int dt){
        if (isFull()){
            System.out.println("Queue sudah penuh");
            System.exit(0);
        }

    public int dequeue (){
        int dt = 0;
        if (isEmpty()){
            System.out.println("Queue masih kosong");
            System.exit(0);
        }
    ```




    