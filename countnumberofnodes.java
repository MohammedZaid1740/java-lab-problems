package linklist;

public class countnumberofnodes {
    public static void main(String[] args){
        node head = null;
        node prev = null;
        int i = 1;
        while (i <= 15){
            node n = new node();
            n.value = i;
            if (head == null){
                head = n;
            }
            else{
                prev.next = n;  
            }
            prev = n;
            i += 1;
        }
        int count = 0;
        node temp = head;
        while (temp != null){
            count += 1;
            System.out.println(temp.value);
            temp = temp.next;
           
    }
     System.out.println(count);
    
}
}
