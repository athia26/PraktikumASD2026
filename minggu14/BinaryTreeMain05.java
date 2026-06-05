package minggu14;

public class BinaryTreeMain05 {
    public static void main(String[] args) {
        // BinaryTree05 bst = new BinaryTree05();

        // bst.add(new Mahasiswa05("12345", "Ali", "A", 3.57));
        // bst.add(new Mahasiswa05("12346", "Badar", "B", 3.85));
        // bst.add(new Mahasiswa05("12347", "Candra", "C", 3.21));
        // bst.add(new Mahasiswa05("12348", "Dewi", "B", 3.54));

        // System.out.println("\n----------------------");
        // System.out.println("Daftar semua mahasiswa (in order tranversal)");
        // bst.transverseInOrder(bst.root);


        // System.out.println("\n----------------------");
        // System.out.println("Pencarian data mahasiswa: ");
        // System.out.print("Cari mahasiswa dengan ipk: 3.54 ");
        // String hasilCari = bst.find(3.54) ? "Ditemukan" :"Tidak ditemukan";
        // System.out.println(hasilCari);

        // System.out.print("Cari mahasiswa dengan ipk: 3.22 ");
        // hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        // System.out.println(hasilCari);

        // bst.add(new Mahasiswa05("12349", "Devi", "A", 3.72));
        // bst.add(new Mahasiswa05("123410", "Ehsan", "D", 3.37));
        // bst.add(new Mahasiswa05("123411", "Fizi", "B", 3.46));

        // System.out.println("\n----------------------");
        // System.out.println("Daftar semua mahasiswa setelah penambahan 3 mahasiswa: ");
        // System.out.println("--------");
        // System.out.println("Inorder traversal: ");
        // bst.transverseInOrder(bst.root);
        // System.out.println("\n--------");
        // System.out.println("Preorder traversal: ");
        // bst.transversePreOrder(bst.root);
        // System.out.println("\n--------");
        // System.out.println("Postorder traversal: ");
        // bst.transversePostOrder(bst.root);
        
        // System.out.println("----------------------");
        // System.out.println("\nPenghapusan data mahasiswa: ");
        // bst.delete(3.57);
        // System.out.println("Daftar semua mahasiswa setelah penghapusan 1 mahasiswa: ");
        // bst.transverseInOrder(bst.root);

        BinaryTreeArray05 bta = new BinaryTreeArray05();
        Mahasiswa05 mhs1 = new Mahasiswa05("12345", "Ali", "A", 3.57);
        Mahasiswa05 mhs2 = new Mahasiswa05("12346", "Badar", "B", 3.41);
        Mahasiswa05 mhs3 = new Mahasiswa05("12347", "Candra", "C", 3.75);
        Mahasiswa05 mhs4 = new Mahasiswa05("12348", "Dewi", "B", 3.35);
        Mahasiswa05 mhs5 = new Mahasiswa05("12349", "Devi", "A", 3.48);
        Mahasiswa05 mhs6 = new Mahasiswa05("123410", "Ehsan", "D", 3.61);
        Mahasiswa05 mhs7 = new Mahasiswa05("123411", "Fizi", "B", 3.86);

        Mahasiswa05 [] dataMahasiswa05s = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7};

        int indexLast = 6;
        bta.populateData(dataMahasiswa05s, indexLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.transverseInOrder(0);
    
    
    }

}
