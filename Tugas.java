public class Tugas {
    String mataKuliah, deadLine, tugas;

    public Tugas(String mataKuliah, String deadLine, String tugas) {
        this.mataKuliah = mataKuliah;
        this.deadLine = deadLine;
        this.tugas = tugas;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public String getTugas() {
        return tugas;
    }

    @Override
    public String toString() {
        return "Tugas Mata Kuliah:" + mataKuliah + " Deadline: " + deadLine + " Nama Tugas: " + tugas + " ";
    }
}
