/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.datastructures;

import java.util.HashMap;

/**
 *
 * @author mayowa
 */
public class Graph {
    
    private HashMap<String, Vertex> vertices = new HashMap();
    
    public void connect(String from, String to){
        if(vertices.containsKey(from) && vertices.containsKey(to)){
            vertices.get(from).addEdge(vertices.get(to));
            vertices.get(to).addEdge(vertices.get(from));
        }
    }
    
    public void connect(String from, String to, int weight){
        if(vertices.containsKey(from) && vertices.containsKey(to)){
            vertices.get(from).addEdge(vertices.get(to));
            vertices.get(to).addEdge(vertices.get(from));
            vertices.get(from).getEdges().get(to).setWeight(weight);
            vertices.get(to).getEdges().get(from).setWeight(weight);
        }
    }
    
    public Vertex addVertex(String identifier){
        vertices.put(identifier, new Vertex(identifier));
        return vertices.get(identifier);
    }
    
    public void addVertex(String identifier, int level){
        vertices.put(identifier, new Vertex(identifier, level));
    }
    
    public Vertex getVertex(String identifier){
        if(vertices.containsKey(identifier)){
            return vertices.get(identifier);
        }
        return null;
    }
    
    public HashMap<String, Vertex> getVertices(){
        return this.vertices;
    }
}
