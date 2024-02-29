import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Daftar<ATK> daftarAtk = new Daftar<>(5);
        Daftar<Bag> daftarBag = new Daftar<>(5);

        daftarAtk.addData(new ATK("A002", "Pulpen Kenko", "Pulpen", 2));
        daftarAtk.addData(new ATK("A009", "Spidol Snowman", "Spidol", 5));
        daftarAtk.addData(new ATK("B002", "Buku Sidu", "Buku", 4));
        daftarAtk.addData(new ATK("B005", "Kertas HVS", "Kertas", 6));
        daftarAtk.addData(new ATK("B007", "Kertas Karton", "Kertas", 4));

        daftarBag.addData(new Bag("C004", "Pensil FaberCastel", "Pensil", 5));
        daftarBag.addData(new Bag("C006", "Tas Spiderman", "Tas", 2));
        daftarBag.addData(new Bag("C009", "Monitor LG", "Monitor", 5));
        daftarBag.addData(new Bag("C013", "Tempat Pensil Superman", "Tempat Pensil", 5));
        daftarBag.addData(new Bag("C019", "Tempat Pensil Barbie", "Tempat Pensil", 5));

        daftarAtk.display();
        System.out.println();       
        daftarBag.display();
        System.out.println();
        
        daftarAtk.removeData(0);
        daftarAtk.display();
    }
}