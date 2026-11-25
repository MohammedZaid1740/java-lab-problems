package linklist;

public class removealloccuranceofavalue {
    static node remove(node head, int value) {
       if (head == null) {
        return null;
    }

    if (head.value == value) {
        return remove(head.next, value);
    }

    head.next = remove(head.next, value);

    return head;

    }
    static void print(node head) {
        while (head != null) {
            System.out.println(head.value);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        node head = null;
        node prev = null;
        for (int i = 1; i <= 10; i++) {
            node n = new node();
            n.value = i;
            if (head == null) {
                head = n;
            } else {
                prev.next = n;
            }
            prev = n;
        }
        remove(head, 5);
        print(head);
    }
    
}
