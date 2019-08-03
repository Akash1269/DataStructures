package LinkedLists;

public class FindLoop_2_8 {

    public static Node<Integer> getLoopNode(Node<Integer> head){
        if(head == null || head.next == null)
            return null;
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast == null || fast.next == null)
            return null;

        slow = head;

        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public static void main(String[] args){
        Node<Integer> head1 = new Node<>(0);
        Node<Integer> node = head1;

        for (int i = 1; i <= 5; i++) {
            Node<Integer> newNode = new Node<>(i);
            node.next = newNode;
            node = newNode;
        }

        node.next = head1.next.next;
        System.out.println(getLoopNode(head1).data);
    }
}
