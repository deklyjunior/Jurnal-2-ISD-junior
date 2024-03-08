import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);
        SinglyLinkedList linkedList = new SinglyLinkedList();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cetak Daftar Buku");
            System.out.println("4. Keluar");

            System.out.print("Pilihan: ");
            int pilih = siu.nextInt();
            siu.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = siu.nextLine();
                    System.out.print("Masukkan Penulis Buku: ");
                    String penulis = siu.next();
                    System.out.print("Masukkan Tahun Terbit Buku: ");
                    int tahunTerbit = siu.nextInt();
                    linkedList.addNodeAtEnd(new ArrayList(judul, penulis, tahunTerbit));
                    System.out.println("Buku ditambahkan.");
                    break;
                case 2:
                    linkedList.deleteNodeAtEnd();
                    System.out.println("Buku dihapus.");
                    break;
                case 3:
                    linkedList.printList();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    
                siu.close();
            }
        }
    }
}