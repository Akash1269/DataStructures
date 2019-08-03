package LinkedLists;

public class DeleteGivenNode_2_3 {

    public static boolean deleteGivenNode(Node<Integer> node){
        if(node == null || node.next == null){
            return false;
        }
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }

    public static void main(String[] args){
        LinkedLists.LinkedList<Integer> integerLinkedList = new LinkedLists.LinkedList<>();
        integerLinkedList.insert(7);
        integerLinkedList.insert(6);
        integerLinkedList.insert(5);
        integerLinkedList.insert(4);
        integerLinkedList.insert(3);
        integerLinkedList.insert(2);
        integerLinkedList.insert(1);

        integerLinkedList.printAll();
        Node<Integer> node = integerLinkedList.head;
        for (int i = 1; i < 6; i++) {
            node = node.next;
            node.print();
        }
        System.out.println(deleteGivenNode(node));
        integerLinkedList.printAll();
    }
}
