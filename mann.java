class Node {
    int data;         // Data stored in the node
    Node next;        // Reference to the next node in the linked list
    // Constructor
    public Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    // Constructor
    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class Linked{
    public static Node ConvertArr2LL(int[] arr)
    {
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover  = temp;
        }

        return head;

    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 7};
        Node head = ConvertArr2LL(arr);
        System.out.println(head);
        
    }
}