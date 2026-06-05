package minggu14;

public class BinaryTree05 {
    Node05 root;

    public BinaryTree05(){
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void add(Mahasiswa05 mahasiswa){
        Node05 newNode = new Node05(mahasiswa);

        if (isEmpty()){
            root = newNode;
        } else{
            Node05 current = root;
            Node05 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null){
                        parent.left = newNode;
                        return;
                    }
                } else{
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            } 
        }
    }

    boolean find (double ipk){
        boolean result = false;
        Node05 current = root;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk){
                current = current.right;
            } else{
                current = current.left;
            }
        }
        return result;
    }

    void transversePreOrder(Node05 node){
        if (node != null){
            node.mahasiswa.tampilInformasi();
            transversePreOrder(node.left);
            transversePreOrder(node.right);
        }
    }

    void transverseInOrder(Node05 node){
        if (node != null){
            transverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            transverseInOrder(node.right);
        }
    }

    void transversePostOrder(Node05 node){
        if (node != null){
            transversePostOrder(node.left);
            transversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node05 getSuccessor (Node05 del){ //node dg nilai terkecil di subtree kanan
        Node05 successor = del.right;
        Node05 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        } 
        if (successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()){
            System.out.println("Binary tree kosong");
            return;
        } 

        Node05 parent = root;
        Node05 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
            
        }

        if (current == null){
            System.out.println("Data tidak ditemukan");
            return;
        } else{
            //jika tdk ada anak(leaf), maka node dihapus
            if (current.left == null && current.right == null){
                if (current == root){
                    root = null;
                } else{
                    if (isLeftChild){
                        parent.left = null;
                    } else{
                        parent.right = null;
                        }
                    } 
                } else if (current.left == null){ //jika hanya punya 1 anak (kanan)
                    if (current == root){
                        root = current.right;
                    } else{
                        if (isLeftChild) {
                            parent.left = current.right;
                        } else{
                            parent.right = current.right;
                        }
                    }
                } else if (current.right == null){ //jika hanya punya 1 anak (kiri)
                    if (current == root){
                        root = current.left;
                    } else{
                        if (isLeftChild) {
                            parent.left = current.left;
                        } else{
                            parent.right = current.left;
                        }
                    }
                } else { //jika punya 2 anak
                    Node05 successor = getSuccessor(current);
                    System.out.println("Jika 2 anak, current = ");
                    successor.mahasiswa.tampilInformasi();
                    if (current == root){
                        root = successor;
                    } else{
                        if (isLeftChild) {
                            parent.left = successor;
                        } else{
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
        }
    }




}
