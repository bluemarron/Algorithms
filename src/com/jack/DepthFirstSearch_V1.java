package com.jack;

import java.util.Stack;

/**
 * Created by jack on 2016. 2. 1..
 */
public class DepthFirstSearch_V1 {
    public void DFS(StackNode root) {
        Stack<StackNode> s = new Stack<StackNode>();
        s.add(root);
        while (s.isEmpty() == false) {
            StackNode x = s.pop();
            if (x.right != null) s.add(x.right);
            if (x.left != null) s.add(x.left);
            System.out.print(" " + x.data);
        }
    }

    public static void main(String args[]) {
        StackNode root = new StackNode(1);
        root.left = new StackNode(2);
        root.left.left = new StackNode(4);
        root.left.right = new StackNode(5);
        root.right = new StackNode(3);
        root.right.left = new StackNode(6);
        root.right.right = new StackNode(7);

        DepthFirstSearch_V1 b = new DepthFirstSearch_V1();
        System.out.println("Depth-First-Search : ");
        b.DFS(root);
    }
}

class StackNode {
    int data;
    StackNode left;
    StackNode right;

    public StackNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}