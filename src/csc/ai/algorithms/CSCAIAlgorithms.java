/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms;

import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
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
        
        testUCS();
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
        
        Dls dls = new Dls();
        String start = "A";
        String stop = "H";
        System.out.println(dls.find(stop, graph, start, 2));
    }
    
    public static void testIDS(){
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
        
        Dls dls = new Dls();
        String start = "A";
        String stop = "D";
        boolean terminate = false;
        int limit = 0;
        while(terminate == false){
            terminate = true;
            limit++;
            boolean result = dls.find(stop, graph, start, limit);
            System.out.println(result);
            if(result ==true){break;}
            for(Vertex vertex : graph.getVertices().values()){
                
                if(!vertex.isSeen()){
                    terminate = false;
                    break;
                }
                
            }
            
            for(Vertex vertex : graph.getVertices().values()){
                vertex.unsee();
            }
            System.out.println(limit);
        }
        
        
    }
    
    public static void testUCS(){
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
        
        Dls dls = new Dls();
        String start = "A";
        String stop = "H";
        System.out.println(dls.find(stop, graph, start, 2));
    }
    
}
