public class ATK {

    private String kodeBarang, namaBarang, jenisBarang;
    private int stokBarang;
    
    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public ATK(String kodeBarang, String namaBarang, String jenisBarang, int stokBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.stokBarang = stokBarang;
    }

    @Override
    public String toString() {
        return "ATK [kodeBarang=" + kodeBarang + ", namaBarang=" + namaBarang + ", jenisBarang=" + jenisBarang
                + ", stokBarang=" + stokBarang + "] \n";
    }

    
}
