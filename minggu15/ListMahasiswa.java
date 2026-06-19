package minggu15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }

    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach(mhs ->{
            System.out.println(""+mhs.toString());
        });
    }

    int linearSearch(String nim){
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String nim){
        Collections.sort(
            mahasiswas, 
            Comparator.comparing(m -> m.nim));

        return Collections.binarySearch(
            mahasiswas, 
            new Mahasiswa(nim, "", ""), 
            Comparator.comparing(m -> m.nim));
    }

    public void sortAscending(){
        Collections.sort(
            mahasiswas,
            Comparator.comparing(m -> m.nim)
        );
    }

    public void sortDescending(){
        Collections.sort(
            mahasiswas,
            Comparator.comparing((Mahasiswa m) -> m.nim).reversed()
        );
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();

        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);

        lm.tampil();

        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhleema Lela", "021xx2"));
        System.out.println();
        lm.tampil();

        System.out.println("\nSorting Ascending");
        lm.sortAscending();
        lm.tampil();

        System.out.println("\nSorting Descending");
        lm.sortDescending();
        lm.tampil();

    }

}
