package linklist;

public class findinlinklist {
    static void find(node head, int value) {

    if (head == null) {
        return;
    }
   
    if (head.value == value) {
        System.out.println("Value " + value + " found in the linked list.");
        
        return;
    }
     
    find(head.next, value);
}

    public static void main(String[] args) {
        node head = null;
        node prev = null;
        for (int i = 10; i <= 50; i += 10) {
            node n = new node();
            n.value = i;
            if (head == null) {
                head = n;
            } else {
                prev.next = n;
            }
            prev = n;
        }
        find(head, 30);
    }
    
}
