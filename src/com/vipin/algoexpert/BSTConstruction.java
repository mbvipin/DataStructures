package com.vipin.algoexpert;

public class BSTConstruction {

    public static void main(String [] args)
    {

        BST root = new BSTConstruction.BST(10);
        root.left = new BSTConstruction.BST(5);
        root.left.left = new BSTConstruction.BST(2);
        root.left.left.left = new BSTConstruction.BST(1);
        root.left.right = new BSTConstruction.BST(5);
        root.right = new BSTConstruction.BST(15);
        root.right.left = new BSTConstruction.BST(13);
        root.right.left.right = new BSTConstruction.BST(14);
        root.right.right = new BSTConstruction.BST(22);


        root.insert(12);

        root.remove(10);
        root.contains(10);
        root.contains(15);


    }



    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {



            if(value> this.value)
            {
                if(this.right!=null)
                {
                    this.right.insert(value);
                }

                else
                {

                    this.right=new BST(value);
                }
            }

            else
            {

                if(this.left!=null)
                {
                    this.left.insert(value);
                }

                else
                {

                    this.left=new BST(value);
                }

            }



            return this;
        }

        public boolean contains(int value) {


            if(value> this.value)
            {
                if(this.right!=null)
                {
                    return this.right.contains(value);
                }

                else
                {

                    return false;
                }
            }

            else
            if(value< this.value)
            {
                if(this.left!=null)
                {
                    return this.left.contains(value);
                }

                else
                {

                    return false;
                }
            }


            return true;
        }

        public BST remove(int value)
        {
            remove(value,null);

            return this;

        }

        public void remove(int value, BST parent)
        {

            BST currentNode=this;

            while(currentNode!=null)
            {

                if(value > currentNode.value)
                {
                    parent=currentNode;
                    currentNode=currentNode.right;
                }

                else if  (value < currentNode.value)
                {
                    parent=currentNode;
                    currentNode=currentNode.left;
                }

                else
                {
                    if(currentNode.left!=null && currentNode.right!=null)
                    {
                        currentNode.value=currentNode.right.getMinValue();
                        currentNode.right.remove(value,currentNode);
                    }

                    else if (parent==null)
                    {

                        if(currentNode.left!=null)
                        {
                            currentNode.value=currentNode.left.value;
                            currentNode.right=currentNode.left.right;
                            currentNode.left=currentNode.left.left;
                        }

                        else if(currentNode.right!=null)
                        {
                            currentNode.value=currentNode.right.value;
                            currentNode.left=currentNode.right.left;
                            currentNode.right=currentNode.right.right;
                        }

                        else
                        {


                        }


                    }

                    else if (currentNode==parent.left)
                    {

                        parent.left=currentNode.left!=null?currentNode.left:currentNode.right;

                    }

                    else if(currentNode==parent.right)
                    {
                        parent.right=currentNode.right!=null?currentNode.right:currentNode.right;

                    }

                    break;

                }


            }

        }
        private int getMinValue() {

            if(this.left==null)
            {
                return this.value;
            }
            else
            {
                return left.getMinValue();
            }

        }
    }

    }

