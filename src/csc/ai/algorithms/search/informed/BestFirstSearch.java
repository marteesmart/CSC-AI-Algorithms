/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search.informed;

import csc.ai.algorithms.datastructures.Edge;
import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author mayowa
 */
public class BestFirstSearch {
    
    public boolean find(String stop, Graph graph, String start) {
        boolean success = false;
        Comparator<Vertex> comparator = new BestFirstSearch.VertexComparator();
        PriorityQueue<Vertex> queue = new PriorityQueue<>(comparator);
        Vertex current;
        queue.add(graph.getVertex(start));
        while(!queue.isEmpty()){
            current = queue.remove();
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
        
        return success;
    }
    
    public class VertexComparator implements Comparator<Vertex>{

        @Override
        public int compare(Vertex o1, Vertex o2) {
            if(o1.getH() > o2.getH()){
                return -1;
            }else if(o1.getPathToRoot() < o2.getPathToRoot()){
                return 1;
            }else{
                return 0;
            }
        }
    }
    
}
