/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search.uninformed;

import csc.ai.algorithms.datastructures.Edge;
import csc.ai.algorithms.datastructures.Graph;
import csc.ai.algorithms.datastructures.Vertex;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author mayowa
 */
public class BiDirectional {
    
    public boolean find(String stop, Graph graph, String start) {
        Queue<Vertex> start_queue = new LinkedList();
        Queue<Vertex> stop_queue = new LinkedList();
        ArrayList<Vertex> start_close = new ArrayList();
        ArrayList<Vertex> stop_close = new ArrayList();
        ArrayList<Vertex> check = new ArrayList();
        ArrayList<Vertex> close = new ArrayList();
        String s;
        Vertex current;
        
        Queue<Vertex> queue = new LinkedList();
        
        start_queue.add(graph.getVertex(start));
        stop_queue.add(graph.getVertex(stop));
        boolean i = true;
                queue = start_queue;
                check = stop_close;
                close = start_close;
                s = "top";
         
        while(!queue.isEmpty()){
            current = queue.remove();
            close.add(current);
            
            for(Edge edge : current.getEdges().values()){
                if(check.contains(edge.getTo())){
                Stack<Vertex> stack = new Stack();
                if("top".equals(s)){
                    System.out.println("Mid point " + edge.getTo().getIdentidier());
                boolean terminate = false;
                Vertex v = current;
                stack.push(current);
                while(terminate == false){
                    
                    stack.push(v.getParent());
                    v = v.getParent();
                    if(v.getParent() == null){
                        terminate = true;
                        System.out.print("\n");
                    }
                }
                                System.out.print("Path to goal: ");

                while(!stack.isEmpty()){
                    System.out.print(stack.pop().getIdentidier()  + " ");
                }
                System.out.print(edge.getTo().getIdentidier() + " ");
                terminate = false;
                v = edge.getTo().getParent();
                stack.push(v);
                while(terminate == false){
                    
                    
                    if(v.getParent() == null){
                        
                        terminate = true;
                    }else{
                        v = v.getParent();
                    stack.push(v);
                    }
                    
                }
                while(!stack.isEmpty()){
                    System.out.print(stack.pop().getIdentidier()  + " ");
                }
                }else{
                          System.out.println("Mid point " + edge.getTo().getIdentidier());
                
                boolean terminate = false;
                Vertex v = edge.getTo().getParent();
                stack.push(v);
                while(terminate == false){
                    
                    
                    if(v.getParent() == null){
                        
                        terminate = true;
                    }else{
                        v = v.getParent();
                        stack.push(v);
                    }
                }
                System.out.print("Path to goal: ");
                while(!stack.isEmpty()){
                    System.out.print(stack.pop().getIdentidier()  + " " + edge.getTo().getIdentidier() + " ");
                }
                    
                
                terminate = false;
                v = current;
                stack.push(current);
                while(terminate == false){
                    
                    
                    if(v.getParent() == null){
                        terminate = true;
                    }else{
                        stack.push(v.getParent());
                    v = v.getParent();
                    }
                }
                while(!stack.isEmpty()){
                    System.out.print(stack.pop().getIdentidier()  + " ");
                }
                    
                }
                
                return true;
            }
                if(!close.contains(edge.getTo())){
                close.add(edge.getTo());
                queue.add(edge.getTo());
                edge.getTo().setParent(current);
                }
            }
            i = !i;
            if(i){ //start
                queue = start_queue;
                check = stop_close;
                close = start_close;
                s = "top";
            }else{
                queue = stop_queue;
                check = start_close;
                close = stop_close;
                s = "bottom";
            }
            
        }

        
        
        return false;
    }
    
}
