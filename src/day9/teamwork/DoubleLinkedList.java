package day9.teamwork;

//양방향 링크드 리스트
//문제 아래 코드를 분석하여 데이터를 임의 노드 앞에 노드를 추가하는 메서드 추가하세요
// method name : insertToFront(frontNode , insertNode);
public class DoubleLinkedList<T> {

    public static void main(String[] args) {
        DoubleLinkedList<Integer> MyLinkedList = new DoubleLinkedList<Integer>();

        MyLinkedList.addNode(1);
        MyLinkedList.addNode(2);
        MyLinkedList.addNode(3);
        MyLinkedList.addNode(4);
        MyLinkedList.addNode(5);
        MyLinkedList.printAll();
        System.out.println("----------------");

        //MyLinkedList.insertToFront(3, 2);
        MyLinkedList.printAll();
        System.out.println("----------------");

        // MyLinkedList.insertToFront(6, 2);
        // MyLinkedList.insertToFront(1, 0);
        MyLinkedList.printAll();
        System.out.println("----------------");

        MyLinkedList.addNode(6);
        MyLinkedList.printAll();
        System.out.println("----------------");
        MyLinkedList.addPreNode(4,0);
        MyLinkedList.printAll();
    }

    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T> { //노드의 앞뒤가 모두 null 이면 data 양방향 저장
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) {
        if (this.head == null) { //head가 null 이면 head와 tail에 data 저장
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {//head가 null 이 아니면
            Node<T> node = this.head; // Node 타입 변수 node에 head data 저장
            while (node.next != null) { //node(head)의 다음 node가 null이 아니면 다시 다음 node로 이동 -> null이면 검증 중단
                node = node.next;
            }
            node.next = new Node<T>(data); // 마지막 node의 다음 노드에 data를 가진 Node객체 생성하여 대입
            node.next.prev = node; // 새로운 노드의 이전 노드 = 마지막 노드 (연결)
            this.tail = node.next; // tail은 새로운 노드
        }
    }

    public void printAll() {
        if (this.head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    //head 로 부터 특정 노드를 찾는 메서드
    public T searchFromHead(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }

    //tail 로부터 특정 노드를 찾는 메서드
    public T searchFromTail(T isData) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.tail;
            while (node != null) {
                if (node.data == isData) {
                    return node.data;
                } else {
                    node = node.prev;
                }
            }
            return null;
        }
    }

    //데이터를 임의 노드 앞에 노드를 추가하는 메서드
    public void addPreNode(T isData, T addData){
        Node <T> node = this.head;
        while (node != null) {
            if (node.data==isData) { //일치하는 노드찾음
                Node <T> newNode = new Node<T>(addData);
                newNode.next = node; // 새노드의 next에 찾은 노드
                newNode.prev = node.prev; //새 노드의 prev에 찾은 노드의 prev
                if (node.prev != null) {
                    node.prev.next = newNode; // 찾은 노드의 prev 이전 노드의 next를 새 노드로 설정
                }
                node.prev = newNode;
                if (node == this.head) {  // 찾은 노드의 prev가 head이면 head를 새 노드로 업데이트
                    this.head = newNode;
                }
                return;
            }else node = node.next;
        }
    }


    public void deletNode(T data){
        Node <T> node = this.head;
        Node <T> predNode = null;
        while (node != null){
            if(node.data == data) node = predNode;
            else node = node.next;
        }
    }
}






