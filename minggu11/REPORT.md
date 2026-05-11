|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 11 LINKED-LIST

## 11.1. Praktikum 1

- Code Program 
    - [Mahasiswa05.java](Mahasiswa05.java)
    - [NodeMahasiswa05.java](NodeMahasiswa05.java)
    - [SingleLinkedList.java](SingleLinkedList.java)
    - [SLLMain05.java](SLLMain05.java)

- Hasil Praktikum 1: 

    ```java
    Linked List Kosong
    Isi Linked List: 
    Dani            126             1D              3.6

    Isi Linked List: 
    Dani            126             1D              3.6
    Aldi            123             1A              3.9

    Isi Linked List: 
    Dani            126             1D              3.6
    Citra           125             1C              3.7
    Budi            124             1B              3.8
    Aldi            123             1A              3.9
    ```

- Pertanyaan Praktikum 1: 
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
    - karena saat dijalankan pertama kali, linked list belum ada node sama sekali. dan program masuk ke perkondisian else di method print()
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
    - temp digunakan sebagai pointer sementara untuk menelusuri node-node di dalam linked list tapa mengubah posisi head 
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
    ```java
    Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jml; i++) {

            System.out.println("\nData Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa05 mhs = new Mahasiswa05(nim, nama, kelas, ipk);

            sll.addLast(mhs);
        }
    ```

## 11.2. Praktikum 2

- Code Program 
    - [Mahasiswa05.java](Mahasiswa05.java)
    - [NodeMahasiswa05.java](NodeMahasiswa05.java)
    - [SingleLinkedList.java](SingleLinkedList.java)
    - [SLLMain05.java](SLLMain05.java)

- Hasil Praktikum 1: 
```java
Masukkan jumlah mahasiswa: 4

Data Mahasiswa ke-1
NIM   : 123
Nama  : Dirga 
Kelas : 4d
IPK   : 3.6

Data Mahasiswa ke-2
NIM   : 124    
Nama  : Cintia
Kelas : 3c
IPK   : 3.5

Data Mahasiswa ke-3
NIM   : 125  
Nama  : Bimon
Kelas : 2B
IPK   : 3.8

Data Mahasiswa ke-4
NIM   : 126
Nama  : Alvaro
Kelas : 1a
IPK   : 4.0
Data index 1: 
Cintia          124             3c              3.5
Data Mahasiswa an Bimon ada di index: 2

Isi Linked List: 
Cintia          124             3c              3.5
Bimon           125             2B              3.8

Isi Linked List: 
Bimon           125             2B              3.8
```

- Pertanyaan Praktikum 2: 
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
    - Menghentikan iterasi setelah target ditemukan dan menghindari error

2. Jelaskan kegunaan kode dibawah pada method remove
    ```java
    temp.next = temp.next.next;
    if (temp.next == null){
        tail = temp;

    }
    ```
    - Merupakan proses dari penghapusan node di tengah/di akhir. temp.next = temp.next.next digunakan untuk melompati pointer sebelumnya yang akan "dihapus". lalu tail = temp. untuk menyimpan nilai tail yg baru.  

## 11.3. Tugas Praktikum 

- Code Program 
    - [tgsMahasiswa.java](tgsMahasiswa.java)
    - [tgsNode.java](tgsNode.java)
    - [tgsQueueMhs.java](tgsQueueMhs.java)
    - [tgsMain.java](tgsMain.java)

- Hasil Praktikum 1: 

```java
Andi sudah masuk antrian
Budi sudah masuk antrian
Citra sudah masuk antrian
------------------------------------
Jumlah mahasiswa dalam antrian: 3
Daftar antrian sekarang: 
- NIM: 12345, Nama: Andi
- NIM: 12346, Nama: Budi
- NIM: 12347, Nama: Citra
------------------------------------
Antrian terdepan: NIM: 12345, Nama: Andi
Antrian terakhir: NIM: 12347, Nama: Citra
------------------------------------
Memanggil antrian: Andi
Antrian terdepan: NIM: 12346, Nama: Budi
Antrian terakhir: NIM: 12347, Nama: Citra
------------------------------------
Antrian sudah kosong
Jumlah mahasiswa dalam antrian: 0
```