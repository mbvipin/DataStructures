package com.vipin.algoexpert;

public class ClosestValueBST {

    public static void main(String[] args) {

        BST root = new ClosestValueBST.BST(13);
        root.left = new ClosestValueBST.BST(5);
        root.left.left = new ClosestValueBST.BST(2);
        root.left.left.left = new ClosestValueBST.BST(1);
        root.left.right = new ClosestValueBST.BST(5);
        root.right = new ClosestValueBST.BST(15);
        root.right.left = new ClosestValueBST.BST(10);
        root.right.left.right = new ClosestValueBST.BST(14);
        root.right.right = new ClosestValueBST.BST(22);

        findClosestValueInBst(root, 12);
    }

    public static int findClosestValueInBst(BST tree, int target)
    {
        return findClosestValueInBstIteratively(tree,target,tree.value);

    }


    public static int findClosestValueInBst(BST tree, int target,int closest) {

        if(Math.abs(target-tree.value)<Math.abs(target-closest))
        {
            closest=tree.value;
        }

        if(target <tree.value && tree.left!=null)
        {
            return findClosestValueInBst(tree.left,target,closest);
        }

        if(target >tree.value && tree.right!=null)
        {
            return findClosestValueInBst(tree.right,target,closest);
        }
        else
        {
            return closest;
        }
    }

    public static int findClosestValueInBstIteratively(BST tree, int target,int closest) {

        BST currentNode=tree;

        while(currentNode!=null)
        {
            if(Math.abs(target-tree.value)< Math.abs(target-closest))
            {
                closest=tree.value;
            }

            if(target< currentNode.value && currentNode.left!=null)
            {
                currentNode=currentNode.left;
            }

            else    if(target> currentNode.value && currentNode.right!=null)
            {
                currentNode=currentNode.right;
            }
            else
            {
                break;
            }

        }

        return closest;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
