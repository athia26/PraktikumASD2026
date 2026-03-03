package minggu3;

public class dataDosen05 {
    public void dataSemuaDosen(dosen05[] arrayofDosen){
        System.out.println("===== DATA SEMUA DOSEN =====");
        for (int i = 0; i < arrayofDosen.length; i++) {
            arrayofDosen[i].cetakInfo();
        }
    }

    public void jumlahDosenPerJenisKelamin(dosen05 [] arrayofDosen){
        int l = 0, p = 0;

        for (int i = 0; i < arrayofDosen.length; i++) {
            if (arrayofDosen[i].jenisKelamin) {
                l++;
                
            } else{
                p++;
            }
        }

        System.out.println("===== JUMLAH DOSEN =====");
        System.out.println("Dosen Laki      : "+ l);
        System.out.println("Dosen Perempuan : "+ p);

        System.out.println("-----------------------------------");
        
    }

    public void rerataUsiaDosenPerJenisKelamin(dosen05 [] arrayofDosen05){
        int totalL = 0, totalP = 0, l = 0, p=0;
        for (int i = 0; i < arrayofDosen05.length; i++) {
            if (arrayofDosen05[i].jenisKelamin){
                totalL += arrayofDosen05[i].usia;
                l++;
            } else{
                totalP += arrayofDosen05[i].usia;
                p++;
            }
        }

        
        System.out.println("===== RATA-RATA USIA =====");
        if(l > 0){
            System.out.println("Dosen Laki      : "+ (totalL/l));
        } 
        if(p > 0){
            System.out.println("Dosen Perempuan : "+ (totalP/p));
        } 

        System.out.println("-----------------------------------");


    }

    public void infoDosenPlgTua(dosen05 [] arrayOfDosen05){
        dosen05 tertua = arrayOfDosen05[0]; //menjadikan pembanding, ganti nama index 0 jadi tertua 
        //tertua merupakan variabel yg bertipe class dosen05, 
        // jadi tertua bisa ngambil semua atribut dan method yg ada di class dosen05

        for (int i = 1; i < arrayOfDosen05.length; i++) {
            if (arrayOfDosen05[i].usia > tertua.usia){
                tertua =  arrayOfDosen05[i]; //kalau ada index yang lebih tua usianya, tertua digantikan oleh index tersebut. 
            }
        }

        System.out.println("===== Dosen Paling Tua =====");
        tertua.cetakInfo();
    }

    public void infoDosenPlgMuda(dosen05 [] arrayOfDosen05){
        dosen05 termuda = arrayOfDosen05[0]; //menjadikan pembanding, ganti nama index 0 jadi tertua 
        //tertua merupakan variabel yg bertipe class dosen05, 
        // jadi tertua bisa ngambil semua atribut dan method yg ada di class dosen05

        for (int i = 1; i < arrayOfDosen05.length; i++) {
            if (arrayOfDosen05[i].usia < termuda.usia){
                termuda =  arrayOfDosen05[i]; //kalau ada index yang lebih tua usianya, tertua digantikan oleh index tersebut. 
            }
        }

        System.out.println("===== Dosen Paling Muda =====");
        termuda.cetakInfo();
    }




}
