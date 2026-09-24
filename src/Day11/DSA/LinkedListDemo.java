package Day11.DSA;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList1 li = new LinkedList1();

        li.addAtBeginning(4);
        li.addAtBeginning(5);
        li.addAtBeginning(10);

        li.deleteAtBeginning();

//        System.out.println(li.get(6));
        li.display();
    }
}

class LinkedList1 {
    Node head;
    int size = 0;

    public void addAtBeginning(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        size++;
    }
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("LINKED LIST IS EMPTY");
        }
        head = head.next;

    }

    public void display() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }

        System.out.print(head.data);
    }

    public int get(int index) {
        if (index< 0 || index>size-1) {
            System.out.println("INVALID INDEX");
            return -1;
        }
        Node temp = head;

            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }

        return temp.data;
    }
    private class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            next = null;
        }
    }

}

