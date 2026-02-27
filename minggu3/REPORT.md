|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# #3 ARRAY OF OBJECTS

## 3.1. Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan

Hasil dari run:

```java
NIM     : 224107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : 224107060033
IPK     : 3.75
-------------------------------------
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.8
-------------------------------------
NIM     : 244107020006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 0.0
-------------------------------------
```

### Pertanyaan Percobaan 1: 
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
    
- Tidak harus selalu punya keduanya, yang wajib adalah class yg bisa diinstansiasi supaya object bisa dibuat dan dimasukkan ke dalam array. 

2. Apa yang dilakukan oleh kode program berikut? 
```java 
Mahasiswa05[] arrayOfMahasiswa = new Mahasiswa05[3];
```

- Membuat array baru dengan index 3, dan diisi dengan objek bertipe Mahasiswa05.

3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
```java 
arrayOfMahasiswa[0] = new Mahasiswa05();
```


-  Class tersebut tidak memiliki konstruktor, tetapi java membuatkannya secara otomatis, jadi baris tersebut dapat dijalankan tanpa error. 

4. Apa yang dilakukan oleh kode program berikut?
```java
arrayOfMahasiswa[0] = new Mahasiswa05();
        arrayOfMahasiswa[0].nim = "224107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "224107060033";
        arrayOfMahasiswa[0].ipk = (float) 3.75;
```

- Baris pertama melakukan instansiasi untuk menciptakan object baru dari class Mahasiswa05() lalu menyimpannya di indeks ke-0 dalam array. Lalu baris ke 2 sampai 5 kode melakukan pengisian atribut nim, nama, kelas, dan ipk pada object tersebut. 

5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

- Karena fungsi mereka berbeda, class Mahasiswa05 digunakan untuk cetakan object, sedangkan class mahasiswaDemo05 digunakan untuk menjalankan program. Dipisah karena mengikuti prinsip OOP. 


## 3.1. Percobaan 2: Menerima Input Isian Array Menggunakan Looping

Hasil dari run:

```java
Masukkan Data Mahasiswa ke-1
NIM     : 1234567
Nama    : Athia
Kelas   : TI-1F
IPK     : 3.80
-------------------------------------
Masukkan Data Mahasiswa ke-2
NIM     : 2345678
Nama    : Alya
Kelas   : TI-1F
IPK     : 3.75
-------------------------------------
Masukkan Data Mahasiswa ke-3
NIM     : 3456789
Nama    : Cindy 
Kelas   : TI-1F
IPK     : 3.78
-------------------------------------
Data Mahasiswa ke-1
NIM     : 1234567
Nama    : Athia
Kelas   : TI-1F
IPK     : 3.8
-------------------------------------
Data Mahasiswa ke-2
NIM     : 2345678
Nama    : Alya
Kelas   : TI-1F
IPK     : 3.75
-------------------------------------
Data Mahasiswa ke-3
NIM     : 3456789
Nama    : Cindy 
Kelas   : TI-1F
IPK     : 3.78
-------------------------------------
```

### Pertanyaan Percobaan 1: 
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3.

```java
public void cetakInfo(){
    System.out.println("NIM     : "+nim);
    System.out.println("Nama    : " +nama);
    System.out.println("Kelas   : "+kelas);
    System.out.println("IPK     : "+ipk);
}

------
for (int i = 0; i < arrayOfMahasiswa.length; i++) {
    System.out.println("Data Mahasiswa ke-" + (i+1));            arrayOfMahasiswa[i].cetakInfo();
}

```

2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
- Karena instansiasi tersebut hanya membuat slot array sebanyak 3 saja, dan belum membuat 3 object Mahasiswa05 di dalamnya. Isi dari array tersebut masih null. 







