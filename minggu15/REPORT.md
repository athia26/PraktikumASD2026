|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 16 Collection

## 16.1. Praktikum 1

- Code Program 
    - [ContohList.java](ContohList.java)

- Hasil Praktikum 1: 

    ```java
    Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
    Elemen 0: 2 total elemen: 4 elemen terakhir: 4
    Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
    Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
    Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
    ```

- Pertanyaan Praktikum 1: 

1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist? 

    - ArrayList tersebut tidak memiliki Generic Type (<T>), sehingga Java menganggap bahwa ArrayList tersebut bertipe Object.

2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!

    - dengan menggunakan generic type seperti: 
    ```java
    List<Integer> l = new ArrayList<>();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add(4);
    ```

3. Ubah kode pada baris kode 38 menjadi seperti ini

    ```java
     LinkedList<String> names = new LinkedList<>();
    ```

4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya

    ```java
    names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: "+names.toString());
    ```
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
    
    -  LinkedList memungkinkan penambahan elemen di awal maupun akhir list dengan mudah. Method push() digunakan untuk menambahkan elemen pada posisi pertama (head)
    - setelah mei-mei dimasukkan, seluruh elemen yang ada bergeser satu posisi ke belakang, dan jumlah elemen bertambah menjadi 6. 
    - getfirst untuk mengambil elemen pertama(head), dan getlast untuk mengambil elemen terakhir (tail).


