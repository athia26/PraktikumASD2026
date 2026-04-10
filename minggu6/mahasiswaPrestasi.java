package minggu6;

public class mahasiswaPrestasi {
    mahasiswa05[] listMhs;
    int idx;

    // constructor → tentukan ukuran dari input
    mahasiswaPrestasi(int jumlah){
        listMhs = new mahasiswa05[jumlah];
    }

    void tambah(mahasiswa05 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++) {
            listMhs[i].tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    mahasiswa05 temp  = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
}