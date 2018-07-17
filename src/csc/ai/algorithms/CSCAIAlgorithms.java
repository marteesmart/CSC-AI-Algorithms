/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms;

import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.search.uninformed.Bfs;

/**
 *
 * @author mayowa
 */
public class CSCAIAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
   
    public static void testBFS(){
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");
        graph.addVertex("I");
        graph.addVertex("J");
        
        graph.connect("A", "B");
        graph.connect("A", "C");
        graph.connect("B", "D");
        graph.connect("B", "E");
        graph.connect("B", "F");
        graph.connect("D", "I");
        graph.connect("C", "G");
        graph.connect("G", "H");
        
        Bfs bfs = new Bfs();
        String start = "A";
        String stop = "F";
        System.out.println(bfs.find(stop, graph, start));
    }
}
