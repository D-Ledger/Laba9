package Task5;

public class FromTheTail {
    public static void main(String[] args) {
        Nodes head = null;

        for (int i = 3; i >= 0; i--) {
            head = new Nodes(i, head);
        }

        Nodes ref = head;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
