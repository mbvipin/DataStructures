package com.vipin.algoexpert;

public class ValidateBST {

    public static void main(String [] args)
    {
        BST root = new ValidateBST.BST(10);
        root.left = new ValidateBST.BST(5);
        root.left.left = new ValidateBST.BST(2);
        root.left.left.left = new ValidateBST.BST(1);
        root.left.right = new ValidateBST.BST(5);
        root.left.right.right = new ValidateBST.BST(11);

        root.right = new ValidateBST.BST(15);
        root.right.right = new ValidateBST.BST(22);




       validateBst(root);

    }



    public static boolean validateBst(BST tree) {


 boolean leftSide=true;
 boolean rightSide=true;

            if(tree.left!=null)
            {
                leftSide= tree.value >tree.left.value && validateBst(tree.left);
            }

        if(tree.right!=null)
        {
            rightSide=tree.value<= tree.left.value && validateBst(tree.right);
        }





        return leftSide && rightSide;
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
