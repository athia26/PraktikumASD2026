|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# #5 BRUTE FORCE DAN DIVIDE CONQUER

## 5.1. Percobaan 1: Menghitung Nilai Faktorial 

Hasil dari run:

```java
Masukkan nilai: 5
Nilai faktorial 5 menggunakan BF: 120
Nilai faktorial 5 menggunakan DC: 120
```

### Pertanyaan Percobaan 1: 
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!
    
- kondisi if (n==1) {return 1}; digunakan untuk menjadi kondisi berhenti dari fungsi rekursi. sedangkan else digunakan untuk memecah masalah menjadi masalah lebih kecil. Method akan memanggil dirinya sendiri dengan nilai yang lebih kecil (n-1) sampai mencari mencapai kondisi if. 

2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan
for? Buktikan!
- Memungkinkan untuk tidak menggunakan perulangan for, bisa menggunakan while atau do-while. 
- Bukti dapat menggunakan while: 
```java
int faktorialBF (int n){
        int fakto = 1;
        int i = 1;
        
        while (i<=n) {
            fakto = fakto*i;
            i++;
            
        }

        return fakto;
    }
```

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1);!
- Untuk fakto *= i digunakan untuk algoritma Brute Force. perhitungan digunakan dengan looping. Nilai fakto akan dikalikan terus dengan nilai i yang bertambah di setiap iterasi. 
- Sedangkan untuk int fakto = n * faktorialDC(n-1); digunakan pada algoritma Divide and Conquer yang menggunakan fungsi rekursi yaitu method yang memanggil dirinya sendiri. Perhitungan dilakukan dengan memecah masalah menjadi lebih kecil sampai masalah tersebut terselesaikan. 

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
- faktorialBF() menghitung faktorial dengan perulangan sampai menghasilkan hasil faktorial yang diinginkan. 
- faktorialDC() menghitung faktorial menggunakan fungsi rekursi, yaitu memecahkan masalah dengan membaginya menjadi masalah yang lebih kecil sampai mencapai kondisi paling dasar (base case). 

## 5.2. Percobaan 2: Menghitung Hasil Pangkat

Hasil dari run:

```java
Masukkan jumlah elemen: 3
Masukkan nilai basis elemen ke-1: 2
Masukkan nilai pangkat elemen ke-1: 3
Masukkan nilai basis elemen ke-2: 4
Masukkan nilai pangkat elemen ke-2: 5
Masukkan nilai basis elemen ke-3: 6
Masukkan nilai pangkat elemen ke-3: 7
HASIL PANGKAT BRUTE FORCE
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT BRUTE FORCE
2^3: 8
4^5: 1024
6^7: 279936
```

### Pertanyaan Percobaan 2: 
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
    
- Perbedaannya terletak di cara perhitungannya. Jika pangkatBF() menghitung pangkat dengan perulangan, nilai a dikalikan berulang kali sampai mendapatkan hasil. Sedangkan pangkatDC() menghitung dengan menggunakan fungsi rekursi, masalah dipecah menjadi beberapa pangkat yg lebih kecil, kemudian hasil dari pecahan tersebut digabung menjadi satu dan menghasilkan hasil akhir. 

2. Apakah tahap combine sudah termasuk dalam kode tersebut? Tunjukkan!
- tahap combine terjadi di kode program berikut: 
```java
return (pangkatDC(a, n/2) * pangkatDC(a, n/2)*a);
return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
```

3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?

- Method tersebut masih relevan menggunakan parameter karena method bisa digunakan untuk nilai yang berbeda tanpa harus mengubah atribut class dan menjadi lebih fleksibel untuk dipanggil dengan berbagai input. 
- Bisa tanpa parameter jika nilai yang akan dipangkatkan sudah disimpan di atribut class, maka method bisa lgsg menggunakan atribut tersebut. 

4. Tarik kesimpulan tentang cara kerja method pangkatBF() dan pangkatDC()!
- pangkatBF() menghitung pangkat dengan perulangan sedangkan pangkatDC() menghitung dengan menggunakan fungsi rekursi. 


## 5.3. Percobaan 3: Menghitung Sum Array 

Hasil dari run:

```java
Masukkan jumlah elemen: 5
Masukkan keuntungan ke-1: 10
Masukkan keuntungan ke-2: 20
Masukkan keuntungan ke-3: 30
Masukkan keuntungan ke-4: 40
Masukkan keuntungan ke-5: 50
Total keuntungan menggunakan BruteForce: 150.0
Total keuntungan menggunakan Divide and Conquer: 150.0
```

### Pertanyaan Percobaan 3: 
1. Kenapa dibutuhkan variable mid pada method TotalDC()? 
    
- karena variabel tersebut bertugas untuk membagi array menjadi 2 bagian, pembagian ini digunakan untuk algoritma Divide and Conquer. bagian kiri array adalah indeks l sampai mid, dan bagian kanan adalah mid+1 sampai r. 

2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?

- digunakan untuk menghitung total pada masing-masing bagian array yg sudah dibagi. lsum untuk menghitung elemen sebelah kiri, rsum untuk elemen sblh kanan. 

3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?

- harus dilakukan karena digunakan untuk menggabungkan hasil dari 2 bagian array yang sudah dihitung sebelumnya. 

4. Apakah base case dari totalDC()?

```java
if (l == r){
    return arr[l];
}
```

5. Tarik Kesimpulan tentang cara kerja totalDC()

- Method totalDC() melakukan penghitungan total nilai array menggunakan algoritma Divide and Conquer. method tersebut membagi array jadi dua bagian dengan varibel mid, lalu menghitung masing masing bagian dengan menggunakan fungsi rekursi, dan me-return-kan hasil penjumlahan dari perhitungan bagian kiri dan kanan. 


## 5.4. Latihan Praktikum
1. Tentukan:
    a. Nilau UTS tertinggi tertinggi menggunakan Divide and Conquer!
    
    b. Nilai UTS terendah menggunakan Divide and Conquer!
    
    c. Rata-rata nilai UAS dari semua mahasiswa menggunakan Brute Force!

### Hasil Latihan: 
```java
Nilai UTS tertinggi : 92
Nilai UTS terendah  : 76
Rata-rata UAS       : 85.375
```



