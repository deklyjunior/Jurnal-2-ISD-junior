import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queuelist<E> {
    private LinkedList<E> queueLL;

    public Queuelist() {
        queueLL = new LinkedList<E>();
    }

    public void enqueue(E object) {
        queueLL.add(object);
    }

    public E dequeue() throws NoSuchElementException {
        return queueLL.remove();
    }

    public boolean isEmpty() {
        return queueLL.isEmpty();
    }

    public void printQueue() {
        Iterator<E> iterator = queueLL.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.print(value + " ");
        }
    }

    public void lihatLah() {
        System.out.println(queueLL.peek());
    }
}
