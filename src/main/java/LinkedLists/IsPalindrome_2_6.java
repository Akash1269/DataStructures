package LinkedLists;

import java.util.Stack;

public class IsPalindrome_2_6 {
    static boolean isPalindrome(LinkedList<Integer> list){
        Stack<Integer> stack = new Stack<>();
        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;
        while (fast != null && fast.next != null){
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        while (slow != null){
            if(slow.data != stack.pop())
                return false;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedLists.LinkedList<Integer> list1 = new LinkedLists.LinkedList<>();
        list1.insert(2);
        list1.insert(6);
        list1.insert(4);
        list1.insert(4);
        list1.insert(6);
        list1.insert(2);
        list1.printAll();

        System.out.println(isPalindrome(list1));

        LinkedLists.LinkedList<Integer> list2 = new LinkedLists.LinkedList<>();
        list2.insert(9);
        list2.insert(1);
        list2.insert(4);
        list2.insert(5);
        list2.insert(4);
        list2.insert(1);
        list2.insert(9);
        list2.printAll();

        System.out.println(isPalindrome(list2));

        LinkedLists.LinkedList<Integer> list3 = new LinkedLists.LinkedList<>();
        list3.insert(9);
        list3.insert(1);
        list3.insert(4);
        list3.insert(5);
        list3.insert(6);
        list3.insert(1);
        list3.insert(9);
        list3.printAll();

        System.out.println(isPalindrome(list3));

        LinkedLists.LinkedList<Integer> list4 = new LinkedLists.LinkedList<>();
        list4.insert(9);
        list4.insert(1);
        list4.insert(4);
        list4.insert(6);
        list4.insert(1);
        list4.insert(9);
        list4.printAll();

        System.out.println(isPalindrome(list4));
    }
}
