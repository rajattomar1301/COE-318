/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab6;

/**
 *
 * @author s2french
 */
public class Node {
    //Instance variables
    private int nodeId;
    private static int node_count = 0; 
    
    // Contructor
    public Node(){
       this.nodeId = node_count;
       node_count++;
    }
    
    /* 
    Return the String representation of the node
    */
    @Override
    public String toString(){
        // return node id in string format
        return("" + this.nodeId);
    }
    
    } //end node class



