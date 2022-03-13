package com.vipin.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class SummingDepth {

    public static void main(String[] args) {

        BST root = new SummingDepth.BST(13);
        root.left = new SummingDepth.BST(5);
        root.left.left = new SummingDepth.BST(2);
        root.left.left.left = new SummingDepth.BST(1);
        root.left.right = new SummingDepth.BST(5);
        root.right = new SummingDepth.BST(15);
        root.right.left = new SummingDepth.BST(10);
        root.right.left.right = new SummingDepth.BST(14);
        root.right.right = new SummingDepth.BST(22);

        depthSum(root);
    }

    private static void depthSum(BST root) {

        List<Level> stack=new ArrayList<>();

        int totalDepth=0;

        stack.add(new Level(root,0));

        while(stack.size()>0)
        {
            Level topNode=stack.remove(stack.size()-1);

            BST node=topNode.node;
            int depth=topNode.depth;

            if(node==null) continue;

            totalDepth+=depth;

            stack.add(new Level(node.left,depth+1));
            stack.add(new Level(node.right,depth+1));

        }
    }

    static class BST {
        public int value;
        public SummingDepth.BST left;
        public SummingDepth.BST right;

        public BST(int value) {
            this.value = value;
        }
    }

    static class Level
    {
        public BST node;

        public int depth;

        public Level(BST node,int depth)
        {
            this.node=node;
            this.depth=depth;
        }

    }
}
