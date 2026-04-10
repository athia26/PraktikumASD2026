package minggu6;

public class mahasiswaPrestasi {
    mahasiswa05 [] listMhs = new mahasiswa05[5];
    int idx;

    void tambah(mahasiswa05 m){
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (mahasiswa05 m : listMhs) {
            m.tampilInformasi();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    mahasiswa05 temp  = listMhs[j];
                    listMhs [j] = listMhs[j-1];
                    listMhs[j-1] = temp;
                }
            }
        }
    }
}
