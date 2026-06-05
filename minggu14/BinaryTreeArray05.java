package minggu14;

public class BinaryTreeArray05 {
    Mahasiswa05 [] dataMhs;
    int indexLast;

    public BinaryTreeArray05(){
        this.dataMhs = new Mahasiswa05[10];
    }

    void populateData (Mahasiswa05 dataMahasiswa[], int indexLast){
        this.dataMhs = dataMahasiswa;
        this.indexLast = indexLast;
    }

    void transverseInOrder(int indexStart){
        if (indexStart <= indexLast){
            if (dataMhs[indexStart] != null) {
                transverseInOrder(2*indexStart+1);
                dataMhs[indexStart].tampilInformasi();
                transverseInOrder(2*indexStart+2);
            }
        }
    }
}
