package day7.List.LinkedListEx;

public class SingleLinkedList <T> {
    public Node<T> head = null;

    public class Node<T> {
        public T data;
        public Node<T> next = null;
        public Node(T data) {
            this.data = data;
        }
    }
    public void addNode(T data){
        if(head == null){
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head;
            while(node.next != null){
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }
}
