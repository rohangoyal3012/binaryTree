package binaryTree;


import java.util.*;


public class reverseLevelOrder {
    static class  Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }

    public static void printReverseLevel(Node root){
            Queue<Node> q = new LinkedList<>();
            Stack<Node> s = new Stack<>();
            q.add(root);
            while(!q.isEmpty()){
                Node curr = q.remove();
                s.push(curr);
                if(curr == null){
                    if(q.isEmpty()){
                        break;
                    }
                }
                else{
                    
                    if(curr.right != null){
                        q.add(curr.right);
                    }
                    if(curr.left != null){
                        q.add(curr.left);
                    }
                   
                }

            }
            while(!s.isEmpty()){
                System.out.print(s.pop().data+" ");
            }


    }


    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        // root.right.right.right= new Node(8);
        printReverseLevel(root);
    }
}
