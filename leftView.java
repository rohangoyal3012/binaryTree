package binaryTree;

import java.util.*;


public class leftView {
    static class  Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =  data;
            this.left = null;
            this.right =null;
        }  
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static void printLeftView(Node root , int levelsize){
        if(root == null){
            return ;
        }
        if(levelsize == list.size()){
            list.add(root.data);
        }
        printLeftView(root.left, levelsize+1);
        printLeftView(root.right, levelsize+1);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right= new Node(8);
        printLeftView(root,0);
        for(int i:list){
            System.out.print(i+" ");
        }
    }
}
