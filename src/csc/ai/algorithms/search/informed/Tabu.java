/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search.informed;

import csc.ai.algorithms.datastructures.Edge;
import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
import java.util.ArrayList;

/**
 *
 * @author mayowa
 */
public class Tabu {
    
    public void find(Graph graph, String start){
        ArrayList<Vertex> tabu = new ArrayList();
        Vertex best = graph.getVertex(start);
        Vertex current = best;
        int t = 0;
        System.out.println("Best: " + best.getIdentidier() + ", Current: " + current.getIdentidier());
        while(t < 5){ //termination criteria = 5 iterations
            t++;
            Vertex best_child = null;
            for(Edge edge : current.getEdges().values()){
                if(!tabu.contains(edge)){
                    try{
                        if(edge.getTo().getH() > best_child.getH()){
                            best_child = edge.getTo();
                        }
                    }catch(NullPointerException npe){
                        best_child = edge.getTo();
                    }
                    
                }
            }
            current = best_child;
            if(best_child.getH() > best.getH()){
                best = best_child;
            }
            System.out.println("Best: " + best.getIdentidier() + ", Current: " + current.getIdentidier());
        }
        
    }
}
