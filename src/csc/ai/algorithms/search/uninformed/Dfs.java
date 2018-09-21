/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search.uninformed;

import csc.ai.algorithms.datastructures.Edge;
import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
import java.util.Stack;

/**
 *
 * @author mayowa
 */
//Depth First Search
public class Dfs{

    public boolean find(String stop, Graph graph, String start) {
        boolean success = false;
        Stack<Vertex> stack = new Stack();
        Vertex current;
        stack.push(graph.getVertex(start));
        while(!stack.empty()){
            current = stack.peek();
            System.out.println(current.getIdentidier());
            if(current.equals(graph.getVertex(stop))){
                return true;
            }
            current.seen();
            
            int i = -1;
            for(Edge edge : current.getEdges().values()){
                i++;
                if(!edge.getTo().isSeen()){
                    edge.getTo().seen();
                    stack.push(edge.getTo());
                    break;
                }else{
                    //incase it has gone through all the edges and all have beem seen already
                    if(i == (current.getEdges().size() - 1)){
                        stack.pop();
                    }
                }
            }
            
            //if the edge has no children it'll simple pop it
            if(current.getEdges().isEmpty()){
                stack.pop();
            }
        }
        return success;
    }
    
}
