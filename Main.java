import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        Queuelist<String> queue = new Queuelist<String>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Tugas");
            System.out.println("2. Tampilkan Tugas Yang Harus Diselesaikan Terlebih Dahulu");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Tampilkan Semua Tugas");
            System.out.println("5. Keluar");

            System.out.print("Pilihan: ");
            int pilih = siu.nextInt();
            siu.nextLine();

            switch (pilih) {
                case 1:
                System.out.println("Masukkan Tugas");
                String tugas = siu.nextLine();

                queue.enqueue(tugas);
                    break;
                case 2:
                queue.lihatLah();
                    break;
                case 3:
                queue.dequeue();
                System.out.println("Tugas dihapus");
                    break;
                case 4:
                queue.printQueue();
                System.out.println();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");

                    siu.close();
            }
        }
    }
}