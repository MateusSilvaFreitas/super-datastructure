package datastructure.challenges;

import datastructure.binaryTree.Node;

public class HeightOfBinaryTree {
    public static int heigth(Node head){
        int leftHeigth = 0;
        int rigthHeigth = 0;
        if(head.getLeft() != null) leftHeigth = heigth(head.getLeft());
        if(head.getRight() != null) rigthHeigth = heigth(head.getRight());

        if(leftHeigth > rigthHeigth) return leftHeigth + 1;
        return rigthHeigth + 1;
    }

    private static void postOrderrecursive(Node node){
        if(node.getLeft() != null) postOrderrecursive(node.getLeft());
        if(node.getRight() != null) postOrderrecursive(node.getRight());
        System.out.println(node.getData());
    }

    private static void inOrderrecursive(Node node){
        if(node.getLeft() != null) inOrderrecursive(node.getLeft());
        System.out.println(node.getData());
        if(node.getRight() != null) inOrderrecursive(node.getRight());
    }
    private static void preOrderrecursive(Node node){
        System.out.println(node.getData());
        if(node.getLeft() != null) preOrderrecursive(node.getLeft());
        if(node.getRight() != null) preOrderrecursive(node.getRight());
    }
}
