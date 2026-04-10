package minggu6;

import minggu7.caseMethod.Mahasiswa;

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

    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
            mahasiswa05 temp = listMhs[idxMin];
            listMhs[idxMin] = listMhs [i];
            listMhs[i] = temp;
        }
    }

    
}