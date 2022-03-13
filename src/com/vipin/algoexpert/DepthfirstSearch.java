package com.vipin.algoexpert;

import java.util.ArrayList;
import java.util.List;

public class DepthfirstSearch {

    public static void main(String [] args)
    {

        DepthfirstSearch.Node graph = new DepthfirstSearch.Node("A");
        graph.addChild("B").addChild("C").addChild("D");
        graph.children.get(0).addChild("E").addChild("F");
        graph.children.get(2).addChild("G").addChild("H");
        graph.children.get(0).children.get(1).addChild("I").addChild("J");
        graph.children.get(2).children.get(0).addChild("K");
        List<String> array=new ArrayList<>();
        for(String element: graph.depthFirstSearch(array))
        {
            System.out.println(element);
        }

    }


    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }


        public List<String> depthFirstSearch(List<String> array) {


            depthSearchHelper(this,array);

            return array;
        }

        private void depthSearchHelper(Node node,List<String> array)
        {

            array.add(node.name);

            for(int i=0;i<node.children.size() ;i++)
                depthSearchHelper(node.children.get(i), array);




        }


        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }

}



