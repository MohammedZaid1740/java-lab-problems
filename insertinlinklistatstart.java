
package linklist;
class node{
    int value;
    node next;
}


public class insertinlinklistatstart {

    public static void main(String[] args) {

        node head = null;
        node prev = null;

        // Creating linked list
        for (int i = 10; i <= 40; i += 10) {

            node n = new node();
            n.value = i;

            if (head == null) {
                head = n;
            } else {
                prev.next = n;
            }

            prev = n;
        }

        // Calling insert function
        head = insert(head, 50);

        // Printing linked list
        print(head);
    }

    static node insert(node head, int value) {

        node newNode = new node();
        newNode.value = value;

        // If linked list is empty
        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head = newNode;

        return head;
    }

    static void print(node temp) {

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
