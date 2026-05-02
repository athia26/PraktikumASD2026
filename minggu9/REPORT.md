|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 9 STACK

## 9.1. Praktikum 1: Mahasiswa Mengumpulkan Tugas

### Hasil praktikum 1: 
```java
Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 1
Nama: Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasil dikumpulkan 

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasil dikumpulkan 

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan 

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 4
Daftar semua tugas: 
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai tugas Tika adalah 87

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 4
Daftar semua tugas: 
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B

Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
Pilih: 0
Pilihan tidak valid
```

### Pertanyaan Praktikum 1: 
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi hasil percobaan! Bagian mana yang perlu diperbaiki?
    
- Perbaikan dapat dilakukan di kode program ini, seharusnya dari atas ke bawah untuk menampilkan siapa yang sudah mengumpulkan tugas : 
```java
    for (int i = top; i >= 0; i--) {
        System.out.println(stack[i].nama + "\t"+ stack[i].nim + "\t"+ stack[i].kelas);
    }
```

2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya!

- Jumlah data tugas mahasiswa yang bisa ditampung di dalam stack adalah 5 data. Dapat ditunjukkan dari kode program berikut: 

```java 
StackTugasMahasiswa05 stack = new StackTugasMahasiswa05(5);
```

3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?

- !isFull() dipakai untuk mengecek apakah stack masih punya ruang sebelum menambah data ke dalamnya. Kalau pengecekan dihapus, akan ada error, seperti array index out of bounds dan program akan berhenti. 

4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi lihat tugas terbawah!

```java
 public Mahasiswa05 peekBottom(){
        if (!isEmpty()){
            return stack[0]; // elemen pertama (paling bawah)
        } else{
            System.out.println("Stack kosong, tidak ada tugas");
            return null;
        }
    }


case 5:
    Mahasiswa05 bawah = stack.peekBottom();
        if (bawah != null){
            System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
        }
break;
```

5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!

```java
public int count(){
        return top + 1;
    }

case 6:
    int jumlah = stack.count();
    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
    break;
```

## 9.2. Praktikum 2:Konversi nilai tugas ke biner 

### Hasil praktikum 2: 

```java
Menu:
1. Mengumpulkan tugas
2. Menilai tugas
3. Melihat tugas teratas
4. Melihat daftar tugas
5. Melihat tugas paling bawah
6. Jumlah tugas yang dikumpulkan
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai tugas Tika adalah 87
Nilai biner tugas: 1010111
```

### Pertanyaan Praktikum 2: 

1. Jelaskan alur kerja dari method konversiDesimalKeBiner!

    - Method konversiDesimalKeBiner bekerja dengan cara membagi bilangan desimal secara berulang dengan 2 dan menyimpan sisa hasil pembagian ke dalam stack.

    - Pada proses pertama, nilai dibagi 2 dan sisa pembagian dimasukkan ke dalam stack hingga nilai menjadi 0. Kemudian pada proses kedua, data di dalam stack diambil kembali menggunakan operasi pop(), sehingga urutan sisa menjadi terbalik.

    - Karena stack bersifat LIFO (Last In First Out), maka hasil akhir yang diperoleh merupakan bilangan biner dari nilai desimal tersebut.
    
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
    
    - Hasil yang diperoleh akan tetap sama. Hal ini karena perulangan akan berhenti saat nilai menjadi 0, baik menggunakan kondisi > 0 maupun != 0. Perbedaan hanya terjadi jika terdapat nilai negatif, di mana kondisi != 0 masih akan dijalankan, sedangkan > 0 tidak.