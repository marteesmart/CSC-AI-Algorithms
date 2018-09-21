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
    private int depth;
    private int path_to_root = 100000000;
    private int h;
    private int g;
    Vertex parent = null;
     
    public Vertex(String id){
        identifier = id;
    }
    
    public Vertex(String id, int depth){
        identifier = id;
        this.depth = depth;
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
        return this.depth;
    }
    
    public void setDepth(int d){
        depth = d;
    }
    
    public int getPathToRoot(){
        return path_to_root;
    }
    
    public void setPathToRoot(int p){
        path_to_root = p;
    }
    
    public void setParent(Vertex v){
        parent = v;
    }
    
    public Vertex getParent(){
        return parent;
    }
    
    public int getH(){
        return h;
    }
    
    public void setH(int h){
        this.h = h;
    }
    
}
