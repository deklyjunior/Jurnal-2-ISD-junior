public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addNodeAtFront(ArrayList data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Buku ditambahkan di awal list.");
    } 

    public void addNodeAtEnd(ArrayList data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Buku ditambahkan di akhir list.");
    }

    public void deleteNodeAtFront() {
        if (head == null) {
            System.out.println("List kosong. Tidak ada buku untuk dihapus.");
        } else {
            head = head.next;
            System.out.println("Buku dihapus dari awal list.");
        }
    }

    public void deleteNodeAtEnd() {
        if (head == null) {
            System.out.println("List kosong. Tidak ada buku untuk dihapus.");
        } else if (head.next == null) {
            head = null;
            System.out.println("Buku dihapus dari akhir list.");
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            System.out.println("Buku dihapus dari akhir list.");
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List kosong. Tidak ada buku untuk ditampilkan.");
        } else {
            Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}
