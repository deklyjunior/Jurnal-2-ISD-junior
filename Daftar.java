import java.util.ArrayList;

public class Daftar<E> {

 private final ArrayList<E> list;
    public Daftar(int penyimpanan){
        int initpenyimpanan = penyimpanan > 0? penyimpanan:0;
        list = new ArrayList<>(initpenyimpanan);
    }
    public void addData(E values){
        list.add(values);
    }
    public void display(){
        for (int i = 0; i<list.size();i++) {
        System.out.printf(list.get(i) + " ");
    }
    System.out.println();
    }
    public void removeData(E entry){
        list.remove(entry);
    }
    public void setData(E object1, E object2){
        int index = list.indexOf(object1);
        list.add(index, object2);
    }

}