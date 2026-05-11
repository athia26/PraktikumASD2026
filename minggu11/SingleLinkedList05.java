package minggu11;


public class SingleLinkedList05 {
    NodeMahasiswa05 head;
    NodeMahasiswa05 tail;

    public boolean isEmpty(){
        return (head == null);
    }

    public void print(){
        if (!isEmpty()){
            NodeMahasiswa05 tmp = head;
            System.out.println("Isi Linked List: ");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;            
            }
            System.out.println("");
        } else{
            System.out.println("Linked List Kosong");
        }
        
    }

    public void addFirst (Mahasiswa05 input){
        NodeMahasiswa05 nodeInput = new NodeMahasiswa05(input, null);
        if (isEmpty()){
            head = nodeInput;
            tail = nodeInput;
        } else{
            nodeInput.next = head;
            head = nodeInput;
        }
    }

    public void addLast (Mahasiswa05 input){
        NodeMahasiswa05 nodeInput = new NodeMahasiswa05(input, null);
        if (isEmpty()){
            head = nodeInput;
            tail = nodeInput;
        } else{
            tail.next = nodeInput;
            tail = nodeInput;
        }
    }



    public void insertAfter (String key, Mahasiswa05 input){
        NodeMahasiswa05 nodeInput = new NodeMahasiswa05(input, null);
        NodeMahasiswa05 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                nodeInput.next = temp.next;
                temp.next = nodeInput;
                if(nodeInput.next == null){
                    tail = nodeInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt (int index, Mahasiswa05 input){
        if (index < 0){
            System.out.println("Indeks salah");
        } else if (index == 0){
            addFirst(input);
        } else{
            NodeMahasiswa05 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            } 
            temp.next = new NodeMahasiswa05(input, temp.next);

            if (temp.next.next == null) {
                tail = temp.next;
                
            }
        }
    }

    public void getData (int index) {
        NodeMahasiswa05 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            
        }

        tmp.data.tampilInformasi();
    }

    public int indexOf (String key){
        NodeMahasiswa05 tmp = head;

        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
            
        }

        if (tmp == null) {
            return -1;
            
        } else {
            return index;
            
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yg dihapus");
        } else if (head == tail){
            head = tail = null;
            
        } else{
            head = head.next;
        }
    }
    
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak ada yg dihapus");
        } else if (head == tail){
            head = tail = null;
            
        } else{
            NodeMahasiswa05 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove (String key){
        if (isEmpty()){
            System.out.println("Linked list masih kosong, tidak ada yg dihapus");
        } else{
            NodeMahasiswa05 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)){
                    this.removeFirst();
                    break;
                } else if(temp.data.nama.equalsIgnoreCase(key)){
                    temp.next = temp.next.next;
                    if (temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if (index == 0){
            removeFirst();
        } else{
            NodeMahasiswa05 temp = head;
            for (int i = 0; i < index -1; i++) {
                temp = temp.next;
                
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }

}
