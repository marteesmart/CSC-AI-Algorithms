/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search.uninformed;

import csc.ai.algorithms.datastructures.Edge;
import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
import csc.ai.algorithms.search.ISearch;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author mayowa
 */
//Breadth First Search
public class Bfs implements ISearch {

    @Override
    public boolean find(String stop, Graph graph, String start) {
        Queue<Vertex> queue;
        queue = new LinkedList();
        Vertex current;
        queue.add(graph.getVertex(start));
        while(!queue.isEmpty()){
            current = queue.remove();
            System.out.println(current.getIdentidier());
            for(Edge edge : current.getEdges()){
                if(!edge.getTo().isSeen()){
                    if(edge.getTo().equals(graph.getVertex(stop))){
                        return true;
                    }
                edge.getTo().seen();
                queue.add(edge.getTo());
                }
            }
        }
        
        return false;
    }
    
    
}
