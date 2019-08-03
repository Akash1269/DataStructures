package LinkedLists;

public class PartitionOnValue_2_4 {

    public static void partitionOnValueMoveToStart(LinkedList<Integer> list, int value){
        Node<Integer> node = list.head;
        Node<Integer> prev = null;
        while (node != null){
            if(node.data < value && prev != null){
                prev.next = node.next;
                node.next = list.head;
                list.head = node;
            }else{
                prev = node;
            }
            node = prev.next;
        }
    }
    public static void partitionOnValueMoveToEnd(LinkedList<Integer> list, int value){
        Node<Integer> node = list.head;
        Node<Integer> last = node;
        Node<Integer> prev = null;
        int size = 0;
        while (last.next != null) {
            last = last.next;
            size++;
        }

        while (node != null && size >= 0){
            if(node.data >= value && prev != null){
                prev.next = node.next;
                node.next = null;
                last.next = node;
                last = node;
            }else{
                prev = node;
            }
            node = prev.next;
            size--;
        }
    }

    public static void main(String[] args){
        LinkedLists.LinkedList<Integer> integerLinkedList = new LinkedLists.LinkedList<>();
        integerLinkedList.insert(2);
        integerLinkedList.insert(6);
        integerLinkedList.insert(3);
        integerLinkedList.insert(1);
        integerLinkedList.insert(8);
        integerLinkedList.insert(9);
        integerLinkedList.insert(4);

        integerLinkedList.printAll();
        partitionOnValueMoveToStart(integerLinkedList,5);
        integerLinkedList.printAll();


        integerLinkedList = new LinkedLists.LinkedList<>();
        integerLinkedList.insert(2);
        integerLinkedList.insert(6);
        integerLinkedList.insert(3);
        integerLinkedList.insert(1);
        integerLinkedList.insert(8);
        integerLinkedList.insert(9);
        integerLinkedList.insert(4);

        integerLinkedList.printAll();
        partitionOnValueMoveToEnd(integerLinkedList,5);
        integerLinkedList.printAll();
    }
}
