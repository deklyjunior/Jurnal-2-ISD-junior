import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner siu = new Scanner(System.in);

        LinkedList<Tugas> listMatkul = new LinkedList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input Tugas");
            System.out.println("2. Delete Tugas");
            System.out.println("3. Lihat List Tugas");
            System.out.println("4. Keluar");

            System.out.print("Pilihan: ");
            int pilih = siu.nextInt();
            siu.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Mata Kuliah: ");
                    String matkul = siu.nextLine();
                    System.out.print("Tugas: ");
                    String task = siu.nextLine();
                    System.out.print("Deadline: ");
                    String dedlain = siu.nextLine();

                    listMatkul.addFirst(new Tugas(matkul, dedlain, task));
                    break;
                case 2:
                    System.out.println("1. Hapus Depan");
                    System.out.println("2. Hapus Belakang");
                    System.out.println("3. Hapus Berdasarkan Matkul dan Tugas");

                    System.out.print("Pilihan: ");
                    int pilihHapus = siu.nextInt();
                    siu.nextLine();

                    switch (pilihHapus) {
                        case 1:
                            listMatkul.removeFirst();
                            System.out.println("Tugas depan dihapus.");
                            break;

                        case 2:
                            listMatkul.removeLast();
                            System.out.println("Tugas belakang dihapus.");
                            break;

                        case 3:
                            System.out.println("Tugas yang ingin dihapus: ");
                            String hapusTugas = siu.next();

                            ListIterator<Tugas> iter = listMatkul.listIterator();
                            while (iter.hasNext()) {
                                Tugas ob = iter.next();
                                if (ob.getTugas().equals(hapusTugas)) {
                                    iter.remove();
                                }
                            }
                            break;
                        default:
                            System.out.println("Tidak valid.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1. Cetak Depan");
                    System.out.println("2. Cetak Belakang");
                    System.out.println("3. Tampilkan");

                    System.out.print("Pilihan: ");
                    int pilihCetak = siu.nextInt();
                    siu.nextLine();

                    ListIterator<Tugas> iterator = listMatkul.listIterator();

                    switch (pilihCetak) {
                        case 1:
                            while (iterator.hasNext()) {
                                System.out.println(iterator.next());
                            }
                            break;

                        case 2:
                            while (iterator.hasPrevious()) {
                                System.out.println(iterator.previous());
                            }
                        default:
                            break;
                    }
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