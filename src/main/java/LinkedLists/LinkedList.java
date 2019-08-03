package LinkedLists;

public class LinkedList<T>{
    public Node<T> head;
    public int length;
     LinkedList(){
         head = null;
         length = 0;
     }

     public void insert(T data){
         Node<T> newNode = new Node<>(data);
         if (head == null){
             head = newNode;
             return;
         }
         Node<T> node = head;
         while (node.next != null){
             node = node.next;
         }
         node.next = newNode;
     }

     public int size(){
         Node<T> node = head;
         int size = 0;
         while (node != null){
             size ++;
             node = node.next;
         }
         return size;
    }

     public void printAll(){
         Node<T> node = head;
         while (node != null){
             node.print();
             node = node.next;
         }
         System.out.print("null" + "\n");
     }
}
