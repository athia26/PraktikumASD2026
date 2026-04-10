package minggu6;

public class sorting05 {
    int [] dataDisini;
    int jumDataDisini;
    
    sorting05(int DatadrLuar[], int jmlDatDrluar){ //ambil data dari luar, Data[] : ambil array dari luar, jmlData ambil dari luar 
        jumDataDisini = jmlDatDrluar; //variabel yg di bikin di atas diisi dengan data dari luar 
        dataDisini = new int [jmlDatDrluar]; //bikin array baru dengan jumlah index yg diambil dari data dari luar
        for (int i = 0; i < jumDataDisini; i++) {
            dataDisini[i] = DatadrLuar[i]; //mengisi array baru
        }
    }

    void bubbleSort(){ //konsep: ditukar terus sampai selesai 
        int temp=0;
        //outer loop 
        for (int i = 0; i < jumDataDisini-1; i++) { //dikurangi 1 soalnya setelah data-1 pasti data sudah keurut semua
            //inner loop
            for (int j = 1; j < jumDataDisini-i; j++) {//dijadikan j=1 soalnya nanti akan dibandingkan dengan j-1
                if(dataDisini[j-1] > dataDisini[j]){ //misal: dataDisini [0] > datadisini[1], {5, 2} => 5 lebih besar dari 2 
                    //kalau if nya false, angkanya berarti benar di kiri. 
                    //kalau if nya true, masuk ke perkondisian di bawah: 
                    temp = dataDisini[j]; //disimpan sementara, nnt nya akan ditukar. yg disimpan j (2)
                    dataDisini[j]=dataDisini[j-1]; //2 diganti sama 5, data[1] diganti data [0]
                    dataDisini[j-1]=temp; //data [0] diganti temp, yaitu 2 
                }
            }
        }
    }

    void selectionSort(){; //konsep: cari angka lebih kecil, taruh di depan 
        for (int i = 0; i < jumDataDisini-1; i++) { //dikurangi 1 krn setelah data-1 pasti data sudah terurut semua
            int min=i; //anggap posisi paling kecil skrg i. 


            for (int j = i+1; j < jumDataDisini; j++) {
                
                if (dataDisini[j]< dataDisini[min]) {
                    min=j;
                    
                    //{4,2,3,1}
                    //i = 0, min = 0 (nilai = 4)

                    //j = i+1 => 1 < 4 
                    //data [1] < data[0] => 2 < 4 (true)
                    //masuk ke min = j => min = 1 

                    //update j = 2 < 4 
                    //data [2] < data [1] => 3 < 2 (false)
                    //min tetap, min = 1

                    //update j = 3 < 4 
                    //data [3] < data [1] => 1 < 2 (true)
                    //min = j. j = 3. min = 3
                }
            }


            //dilakukan setelah for i 
            int temp = dataDisini[i]; // temporary nya = data [0]
            dataDisini [i] = dataDisini[min]; //data [0] = data min 3. ditukar sama yang min sblmnya
            dataDisini[min]=temp; //data min yang tadi ditukar, dimasukkan nilai temp 
            
        }
    }

    void insertionSort(){ //konsep: ambil satu data taruh di tempat paling benar 
        for (int i = 1; i < dataDisini.length; i++) { //i = 1, index 0 dianggap sudah urut 
            int temp=dataDisini[i]; //disimpan dulu ke temp, data yg mau dipindah
            int j = i-1; //j = 0, karena i = 1. ambil angka dari kiri 
            while (j>=0 && dataDisini[j] > temp) {
                dataDisini[j+1] = dataDisini[j];
                j--;

                ///{4,3,2}
                ///j>= 0, jangan sampe keluar dari array, kalau index - ngga masuk
                ///data [j] > temp. 
                /// misal temp = 2, j = 1
                /// datadisini [j] > temp. 3 > 2 
                /// masuk ke while : 
                // dataDisini [j+1] = dataDisini [j]. ditukar, data j+1 (2) = data 1 (3). jadinya {4,3,3}
                
            }

            dataDisini[j+1]=temp;
        }
    }

    void tampil(){
        for (int i = 0; i < jumDataDisini; i++) {
            System.out.print(dataDisini[i]+" ");
        }
        System.out.println();
    }
    
}

