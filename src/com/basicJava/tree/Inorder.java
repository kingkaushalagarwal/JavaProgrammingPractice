package com.basicJava.tree;
import java.util.Stack;

//inorder traversal without using recursion.

class Node
{
    int data;
    Node left,right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class Inorder
{
    Node root;
    void inorder()
    {
        if (root==null)
            return;
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        while (curr!=null || s.size()>0)
        {
            while(curr!=null)
            {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data+" ");
            curr = curr.right;
        }


    }

    public static void main(String args[]){
        Inorder tree = new Inorder();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }

}