/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc.ai.algorithms.search;

import csc.ai.algorithms.datastructures.Graph;

/**
 *
 * @author mayowa
 */
public interface ISearch {

    /**
     *
     * @param stop the identifier of the vertex we are searching for
     * @param graph the graph to be searched
     * @param start the identifier of the vertex to start the search from
     * @return a boolean that indicates whether the search was successful or not
     */
    public boolean find(String stop, Graph graph, String start);
}
