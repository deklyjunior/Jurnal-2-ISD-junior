public class ArrayList {
    String judul;
    String penulis;
    int tahunTerbit;

    public ArrayList(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Tahun Terbit: " + tahunTerbit;
    }
}
