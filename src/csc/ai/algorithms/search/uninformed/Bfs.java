/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search.uninformed;

import csc.ai.algorithms.datastructures.Edge;
import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author mayowa
 */
//Breadth First Search
public class Bfs {

    public boolean find(String stop, Graph graph, String start) {
        Queue<Vertex> queue;
        queue = new LinkedList();
        Vertex current;
        queue.add(graph.getVertex(start));
        while(!queue.isEmpty()){
            current = queue.remove();
            current.seen();
            System.out.println(current.getIdentidier());
            if(current.equals(graph.getVertex(stop))){
                return true;
            }
            for(Edge edge : current.getEdges().values()){
                if(!edge.getTo().isSeen()){
                edge.getTo().seen();
                queue.add(edge.getTo());
                }
            }
        }
        
        return false;
    }
    
    
}
