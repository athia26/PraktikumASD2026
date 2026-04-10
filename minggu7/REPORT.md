|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 6 SEARCHING

## 6.2. Praktikum 1: Searching menggunakan sequential search
Hasil: 
Memasukkan Data Mahasiswa: 
```java 
--- Data Mahasiswa ke -1 ---
NIM : 111
Nama : Adi
Kelas : 2
IPK : 3.6
--- Data Mahasiswa ke -2 ---
NIM : 222
Nama : tio
Kelas : 2
IPK : 3.8
--- Data Mahasiswa ke -3 ---
NIM : 333
Nama : ila
Kelas : 2
IPK : 3.0
--- Data Mahasiswa ke -4 ---
NIM : 444
Nama : lia
Kelas : 2
IPK : 3.5
--- Data Mahasiswa ke -5 ---
NIM : 555
Nama : fia
Kelas : 2
IPK : 3.3
```

Tampil data
```java
Nama    : Adi
NIM     : 111
Kelas   : 2
IPK     : 3.6
----------------------------
Nama    : tio
NIM     : 222
Kelas   : 2
IPK     : 3.8
----------------------------
Nama    : ila
NIM     : 333
Kelas   : 2
IPK     : 3.0
----------------------------
Nama    : lia
NIM     : 444
Kelas   : 2
IPK     : 3.5
----------------------------
Nama    : fia
NIM     : 555
Kelas   : 2
IPK     : 3.3
----------------------------
```

Proses pencarian data: 
```java
----------------------------------------
Pencarian Data
----------------------------------------
Masukkan IPK Mahasiswa yang dicari: 
IPK: 3.5
Menggunakan sequential searching
Data mahasiswa dengan IPK : 3.5 ditemukan pada indeks: 3
Nim      : 444
Nama     : lia
Kelas    : 2
IPK      : 3.5
```

### Pertanyaan Praktikum 1: 
1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
    
- tampilPosisi digunakan untuk menampilkan letak data saja, sedangkan tampilDataSearch menampilkan data mahasiswa secara lengkap. 

2. Jelaskan fungsi break pada program dibawah ini: 

- Agar setelah data yng dicari ditemukan, program berhenti berjalan 

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?

- variabel pos digunakan untuk menyimpa posisi/index data yang ditemukan 

4. Jika ada lebih dari satu data yang sama, yang ditampilkan data ke berapa?

- yg dimunculkan adalah yg pertama kali ditemukan, karena di kode program terdapat baris break. 

5. Apa yang terjadi jika break dihapus?

- program akan lanjut mengecek seluruh array dan tidak berhenti di data pertama yang cocok 
 

## 6.3. Praktikum 2: Searching menggunakan binary search
Hasil: 
```java
----------------------------------------
Pencarian Data
----------------------------------------
Masukkan IPK Mahasiswa yang dicari: 
IPK: 3.7
Menggunakan binary searching
Data mahasiswa dengan IPK : 3.7 ditemukan pada indeks: 4
Nim      : 555
Nama     : anita
Kelas    : 2
IPK      : 3.7
```

### Pertanyaan Praktikum 2:  
1. Tunjukkan pada kode program yang mana proses divide dijalankan!
    
```java
mid = (left + right) / 2;
```

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!

```java
else if (listMhs[mid].ipk > cari) {
    return findBinarySearch(cari, left, mid-1);
} else {
    return findBinarySearch(cari, mid+1, right);
}
```

3. Apa fungsi left, right, dan mid?

    - left → batas kiri (awal pencarian)
    - right → batas kanan (akhir pencarian)
    - mid → posisi tengah (data yang dicek)

4. ika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?

    - Tidak bisa, karena binary search wajib data sudah terurut

5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai

    - Program kode jika diurutkan secara descending: 
    ```java
    if (cari == listMhs[mid].ipk) {
    return mid;
    } else if (listMhs[mid].ipk < cari) {
        return findBinarySearch(cari, left, mid-1);
    } else {
        return findBinarySearch(cari, mid+1, right);
    }
    ```

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.

    - Program akan me-return -1 seperti yg tertulis di akhir kode. 

7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.

    - Hasil modifikasi: 
    ```java
    System.out.print("Masukkan jumlah mahasiswa: ");
    int jumlah = sc.nextInt();

    listMhs = new Mahasiswa[jumlah];
    ```





