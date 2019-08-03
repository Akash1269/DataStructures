package LinkedLists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class ReturnKthNode_2_2 {
    public static Integer returnKthNode(LinkedList<Integer> list, int k){
        if(k > list.size())
            return -1;

        Iterator i = list.iterator();
        Iterator trail = list.iterator();
        for (int j = 0; j < k; j++) {
            if(i.hasNext()){
                i.next();
            }
        }
        while(i.hasNext()){
            trail.next();
            i.next();
        }
        return (Integer) trail.next();
    }

    public static int recursiveKthElement(Node<Integer> node, int k){
        if(node == null)
            return 0;

        int current =  recursiveKthElement(node.next, k) + 1;
        if(current == k){
            System.out.println(node.data);
        }
        return current;
    }


    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        int[] arry;
        System.out.println(returnKthNode(list, 4));

        LinkedLists.LinkedList<Integer> integerLinkedList = new LinkedLists.LinkedList<>();
        integerLinkedList.insert(7);
        integerLinkedList.insert(6);
        integerLinkedList.insert(5);
        integerLinkedList.insert(4);
        integerLinkedList.insert(3);
        integerLinkedList.insert(2);
        integerLinkedList.insert(1);
        //System.out.println(recursiveKthElement(integerLinkedList.head, 4));
    }
}