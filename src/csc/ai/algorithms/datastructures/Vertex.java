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
public class Vertex {
    

    //private ArrayList<Edge> edges = new ArrayList();
    private HashMap<String, Edge> edges = new HashMap();
    private boolean complete = false;
    private boolean seen = false;
    private String identifier;
    private int level;
     
    public Vertex(String id){
        identifier = id;
    }
    
    public Vertex(String id, int level){
        identifier = id;
        this.level = level;
    }
    
    public void addEdge(Vertex to){
        edges.put(to.getIdentidier(), new Edge(this, to));
    }
    
    public boolean isComplete(){
        return complete;
    }
    
    public boolean isSeen(){
        return seen;
    }
    
    public void seen(){
        seen = true;
    }
    
    public void unsee(){
        seen = false;
    }
    
    public boolean complete(){
        if(seen == false){
            return false;
        }
        complete = true;
        return true;
    }
    
    public HashMap<String, Edge> getEdges(){
        return edges;
    }
    
    public String getIdentidier(){
        return identifier;
    };
    
    public int getDepth(){
        return this.level;
    }
    
    public void setDepth(int d){
        level = d;
    }
    
}
