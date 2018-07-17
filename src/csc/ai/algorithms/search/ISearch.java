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
     * @param <T>
     * @param stop
     * @param graph
     * @param start
     * @return
     */
    public boolean find(String stop, Graph graph, String start);
}
