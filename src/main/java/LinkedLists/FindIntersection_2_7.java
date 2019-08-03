package LinkedLists;

public class FindIntersection_2_7 {

    public static class Result {
        int length;
        Node<Integer> lastNode;
        Result(int length, Node<Integer> lastNode){
            this.length = length;
            this.lastNode = lastNode;
        }
    }

    public static Result getLastNode(Node<Integer> head){
        int length = 0;
        while (head.next != null){
            head = head.next;
            length ++;
        }
        return new Result(length, head);
    }

    public static Node<Integer> trimHead(Node<Integer> list, int diff){
        for (int i = 0; i < diff; i++) {
            list = list.next;
        }
        return list;
    }

    public static Node<Integer> getIntersection(Node<Integer> list1, Node<Integer> list2){

        if(list1 == null || list2 == null)
            return null;

        Result result1 = getLastNode(list1);
        Result result2 = getLastNode(list2);

        if(result1.lastNode != result2.lastNode)
            return null;

        Node<Integer> longer = result1.length > result2.length ? list1 : list2;
        Node<Integer> shorter = result2.length > result1.length ? list1 : list2;

        Node<Integer> newHead = trimHead(longer, Math.abs(result1.length - result2.length));

        while (newHead != null && shorter != null){
            if(newHead == shorter)
                return newHead;
            newHead = newHead.next;
            shorter = shorter.next;
        }
        return null;
    }

    public static void main(String[] args){
        Node<Integer> head1 = new Node<>(0);
        Node<Integer> node = head1;

        for (int i = 1; i <= 5; i++) {
            Node<Integer> newNode = new Node<>(i);
            node.next = newNode;
            node = newNode;
        }
        Node<Integer> head2 = new Node<>(0);
        node = head2;

        for (int i = 1; i <= 5; i++) {
            Node<Integer> newNode = new Node<>(i);
            node.next = newNode;
            node = newNode;
        }
        node.next = head1.next.next;
        System.out.println(getIntersection(head1, head2).data);
    }
}