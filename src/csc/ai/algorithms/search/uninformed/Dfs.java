/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search.uninformed;

import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
import csc.ai.algorithms.search.ISearch;
import java.util.Stack;

/**
 *
 * @author mayowa
 */
//Depth First Search
public class Dfs implements ISearch {

    @Override
    public boolean find(String stop, Graph graph, String start) {
        boolean success = false;
        Stack<Vertex> stack = new Stack();
        Vertex current;
        stack.push(graph.getVertex(start));
        while(!stack.empty()){
            current = stack.peek();
            System.out.println(current.getIdentidier());
            current.seen();
            
            
            for(int i = 0; i < current.getEdges().size(); i++){
                if(!current.getEdges().get(i).getTo().isSeen()){
                    if(current.getEdges().get(i).getTo().equals(graph.getVertex(stop))){
                        return true;
                    }else{
                        current.getEdges().get(i).getTo().seen();
                        stack.push(current.getEdges().get(i).getTo());
                        break;
                    }
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
