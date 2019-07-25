/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author martinhilary
 */
public interface Tree <D extends Comparable> {
    public boolean isEmpty();
    //size of tree
    public int cardinality();
    public boolean member (D elt);
    public NonEmptyBST<D> add(D elt);
    
    
    
}
