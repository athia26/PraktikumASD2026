package minggu6;

public class DataDosen {
    Dosen05[] dataDosen = new Dosen05[10];
    int idx;

    void tambah(Dosen05 dsn){
        if(idx < dataDosen.length){
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil(){
        for(int i = 0; i < idx; i++){
            dataDosen[i].tampil();
        }
    }

    // 🔥 Bubble Sort ASC (termuda → tertua)
    void sortingASC(){
        for(int i = 0; i < idx-1; i++){
            for(int j = 1; j < idx-i; j++){
                if(dataDosen[j-1].usia > dataDosen[j].usia){
                    Dosen05 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = temp;
                }
            }
        }
    }

    // 🔥 Selection Sort DSC (tertua → termuda)
    void sortingDSC(){
        for(int i = 0; i < idx-1; i++){
            int max = i;
            for(int j = i+1; j < idx; j++){
                if(dataDosen[j].usia > dataDosen[max].usia){
                    max = j;
                }
            }
            Dosen05 temp = dataDosen[i];
            dataDosen[i] = dataDosen[max];
            dataDosen[max] = temp;
        }
    }
}