package minggu9;

public class StackSurat {
    Surat05[] stack;
    int top, size;

    public StackSurat(int size){
        this.size = size;
        stack = new Surat05[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size -1;
    }

    public void push (Surat05 s){
        if (!isFull()){
            top++;
            stack[top] = s;
            
        } else{
            System.out.println("Stack penuh");
            
        }
    }

    public Surat05 pop(){
        if (!isEmpty()){
            Surat05 s = stack[top];
            top--;
            return s; 
        } else{
            System.out.println("Tidak ada surat");
            return null;
        }
    }

    public Surat05 peek(){
        if (!isEmpty()){
            return stack[top];
        } else{
            System.out.println("Stack kosong");
            return null;
        }
    }

    public void cari(String nama){
        boolean ketemu = false;

        for (int i = top; i >= 0; i--){
            if (stack[i].namaMhs.equalsIgnoreCase(nama)){
                System.out.println("Surat ditemukan:");
                System.out.println("ID: " + stack[i].idSurat);
                System.out.println("Nama: " + stack[i].namaMhs);
                System.out.println("Kelas: " + stack[i].kelas);
                System.out.println("Jenis: " + stack[i].jenisIzin);
                System.out.println("Durasi: " + stack[i].durasi + " hari");
                ketemu = true;
                break;
            }
        }

        if (!ketemu){
            System.out.println("Surat tidak ditemukan");
        }
    }
}
