|  | Praktikum Algoritma & Struktur Data |
|--|--|
| NIM |  254107020029 |
| Nama |  Athiarahima Muthmainnah |
| Kelas | TI - 1F |
| Absen | 05 |
| Repository | (https://github.com/athia26/PraktikumASD2026.git) |

# # 14 Tree

## 14.1. Praktikum 1

- Code Program 
    - [BinaryTree05.java](BinaryTree05.java)
    - [BinaryTreeMain05.java](BinaryTreeMain05.java)
    - [Mahasiswa05.java](Mahasiswa05.java)
    - [Node05.java](Node05.java)

- Hasil Praktikum 1: 

```java
----------------------
Daftar semua mahasiswa (in order tranversal)
NIM: 12347      Nama: Candra    Kelas: C        IPK: 3.21
NIM: 12348      Nama: Dewi      Kelas: B        IPK: 3.54
NIM: 12345      Nama: Ali       Kelas: A        IPK: 3.57
NIM: 12346      Nama: Badar     Kelas: B        IPK: 3.85

----------------------
Pencarian data mahasiswa: 
Cari mahasiswa dengan ipk: 3.54 Ditemukan
Cari mahasiswa dengan ipk: 3.22 Tidak ditemukan

----------------------
Daftar semua mahasiswa setelah penambahan 3 mahasiswa: 
--------
Inorder traversal: 
NIM: 12347      Nama: Candra    Kelas: C        IPK: 3.21
NIM: 123410     Nama: Ehsan     Kelas: D        IPK: 3.37
NIM: 123411     Nama: Fizi      Kelas: B        IPK: 3.46
NIM: 12348      Nama: Dewi      Kelas: B        IPK: 3.54
NIM: 12345      Nama: Ali       Kelas: A        IPK: 3.57
NIM: 12349      Nama: Devi      Kelas: A        IPK: 3.72
NIM: 12346      Nama: Badar     Kelas: B        IPK: 3.85

--------
Preorder traversal: 
NIM: 12345      Nama: Ali       Kelas: A        IPK: 3.57
NIM: 12347      Nama: Candra    Kelas: C        IPK: 3.21
NIM: 12348      Nama: Dewi      Kelas: B        IPK: 3.54
NIM: 123410     Nama: Ehsan     Kelas: D        IPK: 3.37
NIM: 123411     Nama: Fizi      Kelas: B        IPK: 3.46
NIM: 12346      Nama: Badar     Kelas: B        IPK: 3.85
NIM: 12349      Nama: Devi      Kelas: A        IPK: 3.72

--------
Postorder traversal: 
NIM: 123411     Nama: Fizi      Kelas: B        IPK: 3.46
NIM: 123410     Nama: Ehsan     Kelas: D        IPK: 3.37
NIM: 12348      Nama: Dewi      Kelas: B        IPK: 3.54
NIM: 12347      Nama: Candra    Kelas: C        IPK: 3.21
NIM: 12349      Nama: Devi      Kelas: A        IPK: 3.72
NIM: 12346      Nama: Badar     Kelas: B        IPK: 3.85
NIM: 12345      Nama: Ali       Kelas: A        IPK: 3.57
----------------------

Penghapusan data mahasiswa: 
Jika 2 anak, current = 
NIM: 12349      Nama: Devi      Kelas: A        IPK: 3.72
Daftar semua mahasiswa setelah penghapusan 1 mahasiswa: 
NIM: 12347      Nama: Candra    Kelas: C        IPK: 3.21
NIM: 123410     Nama: Ehsan     Kelas: D        IPK: 3.37
NIM: 123411     Nama: Fizi      Kelas: B        IPK: 3.46
NIM: 12348      Nama: Dewi      Kelas: B        IPK: 3.54
NIM: 12349      Nama: Devi      Kelas: A        IPK: 3.72
NIM: 12346      Nama: Badar     Kelas: B        IPK: 3.85
```
- Pertanyaan Praktikum 1: 

1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?

    - Pada Binary Search Tree (BST), setiap node memiliki aturan: Nilai pada subtree kiri lebih kecil dari node induk dan nilai pada subtree kanan lebih besar dari node induk.
    - Dengan aturan tersebut, proses pencarian dapat langsung menentukan apakah harus bergerak ke kiri atau ke kanan tanpa memeriksa semua node. Sedangkan pada Binary Tree biasa, tidak ada aturan pengurutan data sehingga pencarian harus dilakukan dengan menelusuri banyak node satu per satu.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
    
    - left menunjuk ke anak kiri dari suatu node.
    - right menunjuk ke anak kanan dari suatu node.
    - Kedua atribut tersebut memungkinkan node-node saling terhubung sehingga membentuk struktur pohon (tree).

3.  a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
    
    - Atribut root digunakan untuk menyimpan referensi node paling atas (akar) dari Binary Tree.

    b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

    - Saat objek BinaryTree pertama kali dibuat, nilai root adalah null karena belum ada node yg dimasukkan ke dalam tree

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?

    - Ketika tree kosong (root == null), node baru yang ditambahkan akan langsung dijadikan root. 

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?

    - parent = current; -> Menyimpan node saat ini sebagai parent sebelum berpindah ke node berikutnya.
    - if (mahasiswa.ipk < current.mahasiswa.ipk) -> Membandingkan IPK data baru dengan IPK node saat ini. Jika IPK baru lebih kecil, maka pencarian posisi dilanjutkan ke subtree kiri.
    - 

6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?