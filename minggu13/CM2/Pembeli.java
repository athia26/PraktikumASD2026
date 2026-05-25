package minggu13.CM2;

public class Pembeli {
    int noAntrian;
    String namaPembeli, noHP;

    public Pembeli(int noAntrian, String namaPembeli, String noHP){
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
    }

    public void tampil (){
        System.out.println(noAntrian + "\t\t" + namaPembeli + "\t" +noHP);
    }
}