package com.vipin.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeBranchSum {

    public static void main(String[] args) {

        BST root = new BinaryTreeBranchSum.BST(13);
        root.left = new BinaryTreeBranchSum.BST(5);
        root.left.left = new BinaryTreeBranchSum.BST(2);
        root.left.left.left = new BinaryTreeBranchSum.BST(1);
        root.left.right = new BinaryTreeBranchSum.BST(5);
        root.right = new BinaryTreeBranchSum.BST(15);
        root.right.left = new BinaryTreeBranchSum.BST(10);
        root.right.left.right = new BinaryTreeBranchSum.BST(14);
        root.right.right = new BinaryTreeBranchSum.BST(22);

        branchSums(root);
    }

    public static List<Integer> branchSums(BST root) {

      List<Integer> sums=new ArrayList<>();

    calculateBranchSums(root,0,sums);

    return sums;

    }

    private static void calculateBranchSums(BST tree,int sum,List<Integer> sums)
    {
       if(tree==null)
       {
           return;

       }

       sum=sum+tree.value;
       if(tree.left==null && tree.right==null)
       {
           sums.add(sum);
          return;

       }

        calculateBranchSums(tree.left,sum,sums);
        calculateBranchSums(tree.right,sum,sums);



    }


    static class BST {
        public int value;
        public BinaryTreeBranchSum.BST left;
        public BinaryTreeBranchSum.BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
