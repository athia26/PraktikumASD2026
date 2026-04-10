|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 5 SORTING 25-26

## 5.2. Praktikum 1: Mengimplementasikan Sorting menggunakan object

### a. SORTING -- BUBBLE SORT
Hasil dari run:

```java
Data Awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 
```

### b. SORTING -- SELECTION SORT
```java
Data Awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 

Data Awal 2
30 20 2 8 14 
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30 
```

### c. SORTING -- INSERTION SORT
```java
Data Awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 

Data Awal 2
30 20 2 8 14 
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30 

Data Awal 3
40 10 4 9 3 
Data sudah diurutkan dengan INSERTION SORT (ASC)
3 4 9 10 40 
```

### Pertanyaan Praktikum 1: 
1. Jelaskan fungsi kode program berikut
```java
if(data[j-1]>data[j]){
                    temp = data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
}
```
    
- Kode program tersebut berfungsi untuk menukar (swap) dua elemen yang bersebelahan dalam array jika urutannya salah. Kondisi if(data[j-1] > data[j]) digunakan untuk mengecek apakah elemen di sebelah kiri lebih besar daripada elemen di sebelah kanan. Jika kondisi tersebut bernilai benar, maka kedua elemen tersebut perlu ditukar agar urutannya menjadi benar (ascending).


2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!

- Kode program yang merupakan algoritma pencarian nilai minimum pada Selection Sort adalah bagian perulangan dalam yang digunakan untuk mencari indeks nilai terkecil dari sisa array:

```java
int min = i;
for (int j = i+1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
```

3. Penjelasan kondisi pada perulangan while (j>=0 && data[j]>temp)

- j >= 0
    Digunakan untuk memastikan bahwa proses perulangan tidak keluar dari batas array (tidak mengakses indeks negatif).
- data[j] > temp
    Digunakan untuk mengecek apakah nilai di sebelah kiri (data[j]) lebih besar daripada nilai yang sedang disisipkan (temp).

- Secara keseluruhan, kondisi ini berarti bahwa perulangan akan terus berjalan selama masih berada dalam batas array dan selama nilai di sebelah kiri lebih besar dari temp. Jika kedua syarat terpenuhi, maka elemen tersebut akan digeser ke kanan.

4. Tujuan dari perintah data[j+1] = data[j];

- Perintah ini berfungsi untuk menggeser elemen ke kanan. Ketika ditemukan bahwa data[j] > temp, maka nilai pada indeks j dipindahkan ke indeks j+1. Tujuannya adalah untuk memberikan ruang bagi nilai temp agar dapat dimasukkan ke posisi yang benar.


## 5.3. Praktikum 2:  Sorting Menggunakan Array of Object
### Dengan Bubble Sort
```java
Data Mahasiswa sebelum sorting
Nama    : Zidan
NIM     : 123
Kelas   : 2A
IPK     : 3.2
----------------------------
Nama    : Ayu
NIM     : 124
Kelas   : 2A
IPK     : 3.5
----------------------------
Nama    : Sofi
NIM     : 125
Kelas   : 2A
IPK     : 3.1
----------------------------
Nama    : Sita
NIM     : 126
Kelas   : 2A
IPK     : 3.9
----------------------------
Nama    : Miki
NIM     : 127
Kelas   : 2A
IPK     : 3.7
----------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : 
Nama    : Sita
NIM     : 126
Kelas   : 2A
IPK     : 3.9
----------------------------
Nama    : Miki
NIM     : 127
Kelas   : 2A
IPK     : 3.7
----------------------------
Nama    : Ayu
NIM     : 124
Kelas   : 2A
IPK     : 3.5
----------------------------
Nama    : Zidan
NIM     : 123
Kelas   : 2A
IPK     : 3.2
----------------------------
Nama    : Sofi
NIM     : 125
Kelas   : 2A
IPK     : 3.1
----------------------------
```

### Pertanyaan Praktikum 2 (Bubble Sort): 

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```java
for (int i = 0; i < listMhs.length-1; i++) {
for (int j = 1; j < listMhs.length-i; j++) {
```

    a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
        - Syarat i < listMhs.length-1 digunakan karena dalam Bubble Sort, setiap iterasi akan menempatkan satu elemen terbesar ke posisi paling akhir. Setelah melakukan n-1 iterasi (dengan n adalah jumlah data), seluruh data sudah pasti terurut.

    b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
        - Syarat j < listMhs.length - i digunakan karena pada setiap iterasi ke-i, elemen terbesar sudah berpindah ke bagian akhir array dan tidak perlu dibandingkan lagi.

    c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
        - Perulangan i berlangsung sebanyak: 50 - 1 = 49 kali
        - Jumlah tahap (pass) Bubble Sort: 49 tahap


2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyboard) yang terdiri dari nim, nama, kelas, dan ipk!
```java
Masukkan jumlah mahasiswa : 3
--- Data Mahasiswa ke -1 ---
NIM : 1234
Nama : Athia
Kelas : 1F
IPK : 3.8
--- Data Mahasiswa ke -2 ---
NIM : 1235
Nama : Cindy
Kelas : 1F
IPK : 3.75
--- Data Mahasiswa ke -3 ---
NIM : 1236
Nama : Budi 
Kelas : 1A
IPK : 3.9

Data Mahasiswa sebelum sorting
Nama    : Athia
NIM     : 1234
Kelas   : 1F
IPK     : 3.8
----------------------------
Nama    : Cindy
NIM     : 1235
Kelas   : 1F
IPK     : 3.75
----------------------------
Nama    : Budi
NIM     : 1236
Kelas   : 1A
IPK     : 3.9
----------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : 
Nama    : Budi
NIM     : 1236
Kelas   : 1A
IPK     : 3.9
----------------------------
Nama    : Athia
NIM     : 1234
Kelas   : 1F
IPK     : 3.8
----------------------------
Nama    : Cindy
NIM     : 1235
Kelas   : 1F
IPK     : 3.75
----------------------------
```


### Dengan Selection sort
```java
Masukkan jumlah mahasiswa : 5
--- Data Mahasiswa ke -1 ---
NIM : 123
Nama : Ali
Kelas : 2B
IPK : 3.9
--- Data Mahasiswa ke -2 ---
NIM : 124
Nama : ila
Kelas : 2B
IPK : 3.1
--- Data Mahasiswa ke -3 ---
NIM : 125
Nama : Agus
Kelas : 2B
IPK : 3.6
--- Data Mahasiswa ke -4 ---
NIM : 126
Nama : Tika
Kelas : 2B
IPK : 3.3
--- Data Mahasiswa ke -5 ---
NIM : 127
Nama : udin
Kelas : 2B
IPK : 3.2

Data Mahasiswa sudah terurut menggunakan SELECTION SORT (ASC): 
Nama    : ila
NIM     : 124
Kelas   : 2B
IPK     : 3.1
----------------------------
Nama    : udin
NIM     : 127
Kelas   : 2B
IPK     : 3.2
----------------------------
Nama    : Tika
NIM     : 126
Kelas   : 2B
IPK     : 3.3
----------------------------
Nama    : Agus
NIM     : 125
Kelas   : 2B
IPK     : 3.6
----------------------------
Nama    : Ali
NIM     : 123
Kelas   : 2B
IPK     : 3.9
----------------------------
```

### Pertanyaan Praktikum 2 (Bubble Sort): 

1. Di dalam method selection sort, terdapat baris program seperti di bawah ini: 
```java
int idxMin = i; for (int j = i+1; j < listMhs.length; j++) { if (listMhs[j].ipk<listMhs[idxMin].ipk){ idxMin = j; } } 
```

Untuk apakah proses tersebut, jelaskan!

- Kode program tersebut berfungsi untuk mencari posisi (indeks) dari nilai IPK terkecil dalam array pada bagian yang belum terurut. 

- Variabel idxMin awalnya diisi dengan nilai i, yang berarti elemen pada posisi tersebut dianggap sebagai nilai minimum sementara. Kemudian, melalui perulangan for dengan variabel j (dimulai dari i+1 hingga akhir array), setiap elemen dibandingkan dengan nilai pada idxMin.

- Jika ditemukan elemen dengan IPK yang lebih kecil (listMhs[j].ipk < listMhs[idxMin].ipk), maka nilai idxMin akan diperbarui menjadi indeks j. Proses ini terus dilakukan hingga seluruh elemen pada bagian yang belum terurut diperiksa.

- Setelah perulangan selesai, idxMin akan menyimpan indeks dari mahasiswa dengan IPK paling kecil, yang kemudian digunakan untuk ditukar dengan elemen pada posisi i.