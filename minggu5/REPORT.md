|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# #5 BRUTE FORCE DAN DIVIDE CONQUER

## 5.1. Percobaan 1: Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

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

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
- Untuk fakto *= i digunakan untuk algoritma Brute Force. perhitungan digunakan dengan looping. Nilai fakto akan dikalikan terus dengan nilai i yang bertambah di setiap iterasi. 
- Sedangkan untuk int fakto = n * faktorialDC(n-1); digunakan pada algoritma Divide and Conquer yang menggunakan fungsi rekursi yaitu method yang memanggil dirinya sendiri. Perhitungan dilakukan dengan memecah masalah menjadi lebih kecil sampai masalah tersebut terselesaikan. 

4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
- faktorialBF() menghitung faktorial dengan perulangan sampai menghasilkan hasil faktorial yang diinginkan. 
- faktorialDC() menghitung faktorial menggunakan fungsi rekursi, yaitu memecahkan masalah dengan membaginya menjadi masalah yang lebih kecil sampai mencapai kondisi paling dasar (base case). 

