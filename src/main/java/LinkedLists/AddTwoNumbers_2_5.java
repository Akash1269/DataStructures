package LinkedLists;

public class AddTwoNumbers_2_5 {

    static class ReturnValue{
        int carry;
        Node<Integer> returnNode;
        ReturnValue(int carry){
            this.carry = carry;
            this.returnNode = null;
        }
    }

    public static LinkedList<Integer> addNumbersInReverse(LinkedList<Integer> num1, LinkedList<Integer> num2){

        Node<Integer> node1 = num1.head;
        Node<Integer> node2 = num2.head;
        Node<Integer> tail = null;
        LinkedList<Integer> sumList = new LinkedList<>();
        Integer carry = 0;
        Integer sum;

        while (node1 != null || node2 != null){
            sum = 0;
            if(node1 != null){
                sum += node1.data;
                node1 = node1.next;
            }
            if (node2 != null){
                sum += node2.data;
                node2 = node2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node<Integer> newNode = new Node<>(sum % 10);
            if(tail != null){
                tail.next = newNode;
            } else{
                sumList.head = newNode;
            }
            tail = newNode;
        }
        if(carry != 0){
            tail.next = new Node<>(carry);
        }
        return sumList;
    }
    public static Node<Integer> addNumbersInReverseRecursively(Node<Integer> num1, Node<Integer> num2, Integer carry){
        if(num1 == null && num2 == null && carry ==0)
            return null;
        Node<Integer> nextNum1 = null;
        Node<Integer> nextNum2 = null;
        Integer sum = carry;
        if(num1 != null){
            sum += num1.data;
            nextNum1 = num1.next;
        }
        if(num2 != null){
            sum += num2.data;
            nextNum2 = num2.next;
        }
        Node<Integer> newNode = new Node<>(sum % 10);
        newNode.next = addNumbersInReverseRecursively(nextNum1, nextNum2, sum /10);
        return newNode;
    }
    public static Node<Integer> addNumbers(LinkedList<Integer> num1, LinkedList<Integer> num2){
        int lengthOfNum1 = num1.size();
        int lengthOfNum2 = num2.size();
        if (lengthOfNum1 > lengthOfNum2)
            appendZeros(num2, lengthOfNum1 - lengthOfNum2);
        else
            appendZeros(num1, lengthOfNum2 - lengthOfNum1);
        ReturnValue returnValue = addNumbersRecursively(num1.head,  num2.head);
        Node<Integer> head;
        if (returnValue.carry == 1){
            head = new Node<>(1);
            head.next = returnValue.returnNode;
        } else {
            head = returnValue.returnNode;
        }
        return head;
    }
    public static void appendZeros(LinkedList<Integer> shorterList, int diff){
        Node<Integer> head = shorterList.head;
        for (int i = 0; i < diff; i++) {
            Node<Integer> node = new Node<>(0);
            node.next = head;
            head = node;
        }
        shorterList.head = head;
    }

    public static ReturnValue addNumbersRecursively(Node<Integer> num1, Node<Integer> num2){
        if (num1 == null && num2 == null){
            return new ReturnValue(0);
        }
        ReturnValue value = addNumbersRecursively(num1.next, num2.next);
        int sum = value.carry + num1.data + num2.data;
        ReturnValue returnValue = new ReturnValue(sum / 10);
        Node<Integer> newNode = new Node<>(sum % 10);
        newNode.next = value.returnNode;
        returnValue.returnNode = newNode;
        return returnValue;
    }

    public static void main(String[] args){
        LinkedLists.LinkedList<Integer> num1 = new LinkedLists.LinkedList<>();
        num1.insert(2);
        num1.insert(8);
        num1.insert(7);
        num1.insert(9);
        num1.insert(3);
        num1.insert(8);
        num1.printAll();

        LinkedLists.LinkedList<Integer> num2 = new LinkedLists.LinkedList<>();
        num2.insert(9);
        num2.insert(1);
        num2.insert(4);
        num2.insert(5);
        num2.insert(4);
        num2.insert(5);
        num2.insert(2);
        num2.insert(3);

        num2.printAll();

        Node<Integer> output = addNumbers(num1, num2);
        LinkedList<Integer> outputList = new LinkedList<>();
        outputList.head = output;
        outputList.printAll();

//        addNumbersInReverse(num1,num2).printAll();


//        // Solve Recursively
//        Node<Integer> output = addNumbersInReverseRecursively(num1.head,num2.head,0);
//        LinkedList<Integer> outputList = new LinkedList<>();
//        outputList.head = output;
//        outputList.printAll();

    }
}
