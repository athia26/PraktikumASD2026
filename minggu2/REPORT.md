|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# #2 OBJECT

## 1.1. Percobaan 1: Deklarasi Class, Atribut, dan Method
Hasil percobaan 1 setelah di run: 

![Hasil stlh run](image/percobaan1.png)

### Pertanyaan Percobaan 1: 
1. Sebutkan dua karakteristik class atau object
    
    Class memiliki karakteristik berupa memiliki atribut atau bisa disebut data dan method/fungsi

2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada    berapa atribut yang dimiliki oleh class. Mahasiswa? Sebutkan apa saja atributnya!
    
    Ada 4 atribut yaitu nim, nama, kelas, dan ipk

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
    
    Ada 4 method yaitu tampilkanInformasi(), ubahKelas(), updateIPK(), dan nilaiKinerja()

4. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".

[Hasil stlh run](image/p1tanya4.png)

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
    
    Method menerima nilai IPK, lalu mengeceknya dengan kondisi if else, jika nilai ipk lebih dari 3.5, maka nilai kinerja sangat baik, jika lebih dari 3 maka kinerja baik, jika lebih dari 2 maka kinerja cukup dan jika selain dari itu, maka kinerja kurang. Hasil dari kondisi itu dikembalikan dengan return untuk nantinya ditampilkan saat program dijalankan 






