/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.datastructures;

/**
 *
 * @author mayowa
 */
public class Edge {
    
    final private Vertex from;
    final private Vertex to;
    
    public Edge(Vertex from, Vertex to){
        this.from = from;
        this.to = to;
    }
    
    public Vertex getTo(){
        return to;
    }
    
}
