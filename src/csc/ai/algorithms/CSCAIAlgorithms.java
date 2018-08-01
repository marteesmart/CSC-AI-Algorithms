/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms;

import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.search.uninformed.Bfs;
import csc.ai.algorithms.search.uninformed.Dfs;
import csc.ai.algorithms.search.uninformed.Dls;

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
        
        testDLS();
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
        String stop = "I";
        System.out.println(bfs.find(stop, graph, start));
    }
    
    public static void testDFS(){
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
        
        Dfs bfs = new Dfs();
        String start = "A";
        String stop = "H";
        System.out.println(bfs.find(stop, graph, start));
    }
    
    public static void testDLS(){
        Graph graph = new Graph();
        graph.addVertex("A", 0);
        graph.addVertex("B", 1);
        graph.addVertex("C", 1);
        graph.addVertex("D", 2);
        graph.addVertex("E", 2);
        graph.addVertex("F", 2);
        graph.addVertex("G", 2);
        graph.addVertex("H", 3);
        graph.addVertex("I", 3);
        graph.addVertex("J");
        
        graph.connect("A", "B");
        graph.connect("A", "C");
        graph.connect("B", "D");
        graph.connect("B", "E");
        graph.connect("B", "F");
        graph.connect("D", "I");
        graph.connect("C", "G");
        graph.connect("G", "H");
        
        Dls dls = new Dls();
        String start = "A";
        String stop = "H";
        System.out.println(dls.find(stop, graph, start));
    }
}
