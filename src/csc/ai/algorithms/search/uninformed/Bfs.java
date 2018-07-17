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
public class Bfs implements ISearch {

    @Override
    public boolean find(String stop, Graph graph, String start) {
        boolean success = false;
        Stack<Vertex> stack = new Stack();
        Vertex current;
        current = graph.getVertex(start);
        while(current != null){
            
        }
        
        return success;
    }
    
    
}
