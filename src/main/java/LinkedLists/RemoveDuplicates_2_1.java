package LinkedLists;

import java.util.HashSet;

public class RemoveDuplicates_2_1 {

    public static void removeDuplicates(LinkedList<Integer> list){
        Node<Integer> head = list.head;
        Node<Integer> previous = head;
        HashSet<Integer> uniqueSet = new HashSet<>();
        while (head != null) {
            if (uniqueSet.contains(head.data)) {
                previous.next = head.next;
            } else {
                uniqueSet.add(head.data);
                previous = head;
            }
            head = head.next;
        }
    }

    public static void main(String[] args){

        System.out.println("Welcome");
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(6);
        list.insert(4);
        list.insert(7);
        list.insert(6);
        list.insert(3);
        list.insert(2);

        list.printAll();
        removeDuplicates(list);
        list.printAll();

        list = new LinkedList<>();

        list.insert(6);
        list.insert(4);
        list.insert(7);
        list.insert(6);
        list.insert(4);
        list.insert(6);

        list.printAll();
        removeDuplicates(list);
        list.printAll();
    }
}
