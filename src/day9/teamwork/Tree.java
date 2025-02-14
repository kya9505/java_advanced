package day9.teamwork;

public class Tree {
    Node head = null;

    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insertNode(10);
        myTree.insertNode(15);
        myTree.insertNode(13);
        myTree.insertNode(11);
        myTree.insertNode(14);
        myTree.insertNode(18);
        myTree.insertNode(16);
        myTree.insertNode(19);
        myTree.insertNode(17);
        myTree.insertNode(7);
        myTree.insertNode(8);
        myTree.insertNode(6);

        System.out.println(myTree.head.value);
        System.out.println(myTree.head.left.value);
        System.out.println(myTree.head.left.left.value);
        System.out.println(myTree.head.left.right.value);

        System.out.println("===================");
        System.out.println(myTree.head.right.value);
        System.out.println(myTree.head.right.left.value);
        System.out.println(myTree.head.right.left.right.value);

        System.out.println("========================");
        System.out.println(myTree.head.right.right.left.value);
        System.out.println(myTree.head.right.right.right.value);
        System.out.println("========================");
        System.out.println(myTree.delete(8));
        System.out.println(myTree.head.left.right.value);
    }


    public class Node {
        Node left;
        Node right;
        int value;
        ;

        public Node(int data) {
            this.value = data;

            this.left = null;
            this.right = null;
        }
    }

    public boolean insertNode(int data) {
        //CASE1 : Node가 하나도 없을때
        if (this.head == null) {
            this.head = new Node(data);
        } else { //CASE2 : Node가 하나 이상 들어가 있을때
            Node findNode = this.head;
            while (true) {
                //CASE2-1 :  현재 Node의 왼쪽에 노드가 들어가야 할때
                if (data < findNode.value) {
                    if (findNode.left != null) {
                        findNode = findNode.left;
                    } else {
                        findNode.left = new Node(data);
                        break;
                    }

                    //CASE2-2 :  현재 Node의 오른쪽에 Node가 들어가야 할때

                } else {
                    if (findNode.right != null) {
                        findNode = findNode.right;
                    } else {
                        findNode.right = new Node(data);
                        break;
                    }
                }
            }
        }
        return true;
    }

    public Node search(int data) {
        //CASE 1 : Node가 하나도 없을때
        if (this.head == null) {
            return null;
            //CASE 2 : Node가 하나 이상일때
        } else {
            Node findNode = this.head;
            while (findNode != null) {
                if (findNode.value == data) {
                    return findNode;
                } else if (data < findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
        }
        return null;
    }

    // 노드 삭제  boolean delete(int data);   추가 팀 과제
    boolean delete(int data) {
        if(this.head == null)return false;
       else{
            Node parentNode = null;
            Node findNode = this.head;
            while (findNode != null && findNode.value != data) {
                parentNode = findNode;
                if (data < findNode.value) {
                    findNode = findNode.left;
                } else findNode = findNode.right;  //해당 노드의 부모노드와 해당 노드 찾기
            }
            if(findNode.left == null && findNode.right == null){ //자식노드가 없을 떄
                if(findNode == this.head) //찾은 노드가 head였을때
                    this.head = null;
                else if (parentNode.left == findNode){
                    parentNode.left = null;
                }else {
                    parentNode.right = null;
                }
            }
            else if(findNode.right ==null || findNode.left == null){

            }

       }


        return true;
    }

}


