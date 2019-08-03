package LinkedLists;

public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }

    public void print(){
        System.out.print(data + " -> ");
    }

}

