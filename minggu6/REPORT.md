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
