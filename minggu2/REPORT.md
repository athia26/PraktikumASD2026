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
    
    - Class memiliki karakteristik berupa memiliki atribut atau bisa disebut data dan method/fungsi

2. Perhatikan class Mahasiswa pada Praktikum 1 tersebut, ada    berapa atribut yang dimiliki oleh class. Mahasiswa? Sebutkan apa saja atributnya!
    
    - Ada 4 atribut yaitu nim, nama, kelas, dan ipk

3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!
    
    - Ada 4 method yaitu tampilkanInformasi(), ubahKelas(), updateIPK(), dan nilaiKinerja()

4. Modifikasi isi method tersebut sehingga IPK yang dimasukkan valid yaitu terlebih dahulu dilakukan pengecekan apakah IPK yang dimasukkan di dalam rentang 0.0 sampai dengan 4.0 (0.0 <= IPK <= 4.0). Jika IPK tidak pada rentang tersebut maka dikeluarkan pesan: "IPK tidak valid. Harus antara 0.0 dan 4.0".

![Hasil stlh run](image/p1tanya4.png)

5. Jelaskan bagaimana cara kerja method nilaiKinerja() dalam mengevaluasi kinerja mahasiswa, kriteria apa saja yang digunakan untuk menentukan nilai kinerja tersebut, dan apa yang dikembalikan (di-return-kan) oleh method nilaiKinerja() tersebut?
    
    - Method menerima nilai IPK, lalu mengeceknya dengan kondisi if else, jika nilai ipk lebih dari 3.5, maka nilai kinerja sangat baik, jika lebih dari 3 maka kinerja baik, jika lebih dari 2 maka kinerja cukup dan jika selain dari itu, maka kinerja kurang. Hasil dari kondisi itu dikembalikan dengan return untuk nantinya ditampilkan saat program dijalankan 


## 1.2. Percobaan 2: Instansiasi Object, Mengakses Atribut dan Method
Hasil percobaan 2 setelah di run: 

![Hasil stlh run](image/percobaan2.png)

### Pertanyaan Percobaan 1: 
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
    
    - Proses instansiasi pada class MahasiswaMain ada di block code: Mahasiswa mhs1 = new Mahasiswa().
    - Nama object baru yang dihasilkan adalah mhs1. 

2. Bagaimana cara mengakses atribut dan method dari suatu objek?
    
    - Dengan memanggil nama object lalu diteruskan dengan nama atribut/nama method yang ada di dalam object tersebut dan dipisahkan dengan titik. 

3. Mengapa hasil output pemanggilan method tampilkanInformasi() pertama dan kedua berbeda?

    - Karena di pemanggilan method pertama, method menggunakan data yang dimasukkan pertama kali, setelah itu terjadi pemanggilan method ubahKelas() dan updateIPK() yg menimpa data pertama dan menggantinya dengan data yang dimasukkan di method ubahKelas() dan updateIPK().



## 1.3. Percobaan 3: Membuat Konstruktor 
Hasil percobaan 3 setelah di run: 

![Hasil run](image/percobaan3.png)

### Pertanyaan Percobaan 1: 
1. Pada class MahasiswaMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi! Apa nama object yang dihasilkan?
    
    - Proses instansiasi ada di baris berikut: 
    ![Hasil run](image/p3tanya1.png)
    
    - Nama object yang dihasilkan adalah mhs2 

2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program berikut? 

    - Kode tersebut melakukan proses instansiasi yaitu membuat object baru dari class Mahasiswa yang memiliki parameter dan mengisi nilai awal atribut dengan data yang sesuai. Object yang baru diberikan nama yaitu mhs2 

3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program. Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!

    ![Hasil run](image/p3tanya3.png)
    
    - Hasilnya error, karena setelah konstruktor default dihapus, class Mahasiswa tidak lagi memiliki konstruktor kosong. Oleh karena itu, objek hanya bisa dibuat menggunakan konstruktor yang memiliki parameter.

4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses secara berurutan? Jelaskan alasannya!

    - Tidak harus berurutan, karena method di dalam class dapat berdiri sendiri dan bisa dipanggil di mana saja sesuai kebutuhan. 

5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor berparameter dari class Mahasiswa!

    - ![Hasil run](image/p3tanya5.png)


## 1.4. Latihan 1
Hasil latihan 1 setelah di run: 

![Hasil run](image/latihan1.png)

## 1.5. Latihan 2
Hasil latihan 2 setelah di run: 

![Hasil run](image/latihan2.png)



 

