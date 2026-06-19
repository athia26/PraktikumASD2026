|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 15 Collection

## 15.1. Praktikum 1

- Code Program 
    - [ContohList.java](ContohList.java)

- Hasil Praktikum: 

    ```java
    Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
    Elemen 0: 2 total elemen: 4 elemen terakhir: 4
    Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
    Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
    Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
    ```

- Pertanyaan Praktikum: 

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

## 15.2. Praktikum 2

- Code Program 
    - [LoopCollection.java](LoopCollection.java)

- Hasil Praktikum: 
    
    ```java
    Banana Orange Watermelon Leci Salak 
    [Banana, Orange, Watermelon, Leci, Salak]
    Salak Leci Watermelon Orange Banana 
    Melon Durian 
    Melon Durian 
    Melon Durian %
    ```

- Pertanyaan Praktikum: 

1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
    
    - push merupakan method khusus untuk class stack, digunakan utuk menambahkan elemen ke bagian atas (top) stack, dan mengikuti konsep LIFO
    - sedangkan add merupakan method untuk class List, digunakan utuk menambahkan elemen di bagian akhir list


2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian? 
    ```java
    fruits.push("Melon");
    fruits.push("Durian");
    ```
- Baris tersebut diperlukan untuk menambahkan data baru setelah seluruh isi stack dihapus oleh method pop().


3. Jelaskan fungsi dari baris 46-49?
    ```java
    for(Iterator<String> it = fruits.iterator(); it.hasNext();){
                String fruit = it.next();
                System.out.printf("%s ", fruit);
            }
    ```

- Digunakan untuk melakukan traversal (menelurusi) seluruh elemen collection menggunakan objek iterator. 


4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?
    ```java
    Stack<String> fruits = new Stack<>();
    ```

- akan muncul error di beberapa baris karena variabel fruits sekarang bertipe list sehingga tidak ada method push, pop, empty


5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!

- menggunakan method set() -> fruits.set (fruits.sixe()-1, "Strawberry");


6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!

    ```java
    fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");
        
        Collections.sort(fruits);

        System.out.println();
        System.out.println(fruits);
    ```


## 15.2. Praktikum 2

- Code Program 
    - [Mahasiswa.java](Mahasiswa.java)
    - [ListMahasiswa.java](ListMahasiswa.java)

- Hasil Praktikum: 
    
    ```java
    Mahasiswa{nim = 201234, nama = Noureen, notelp = 021xx1 }
    Mahasiswa{nim = 201235, nama = Akhleema, notelp = 021xx2 }
    Mahasiswa{nim = 201236, nama = Shannum, notelp = 021xx3 }

    Mahasiswa{nim = 201234, nama = Noureen, notelp = 021xx1 }
    Mahasiswa{nim = 201235, nama = Akhleema Lela, notelp = 021xx2 }
    Mahasiswa{nim = 201236, nama = Shannum, notelp = 021xx3 }
    ```
   
- Pertanyaan Praktikum: 
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?

    - menggunakna konsep varags (variable arguments) yang ditunjukkan oleh tanda titik 3 (...). Memiliki kelebihan jumlah parameter lebih fleksibel dan tidak perlu membuat banyak overload method

2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!

    ```java
    public int binarySearch(String nim){
        Collections.sort(
            mahasiswas, 
            Comparator.comparing(m -> m.nim));

        return Collections.binarySearch(
            mahasiswas, 
            new Mahasiswa(nim, "", ""), 
            Comparator.comparing(m -> m.nim));
    }
    ```


3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!

    ```java
    public void sortAscending(){
        Collections.sort(
            mahasiswas,
            Comparator.comparing(m -> m.nim)
        );
    }

    public void sortDescending(){
        Collections.sort(
            mahasiswas,
            Comparator.comparing((Mahasiswa m) -> m.nim)
                      .reversed()
        );
    }
    ```
    
