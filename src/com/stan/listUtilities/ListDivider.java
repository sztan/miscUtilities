/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.listUtilities;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author stan
 */

public final class ListDivider {
    
    private ListDivider () {
    }
    
    private static ListIterator it;
   
    public static List<List> divide (List sourceList, int partsSize) {
        //testing valid partsSize
        try {
            if (partsSize <1) throw new Exception ("blah blah");
        } catch (Exception e) {
            
        } ///////////////////////
        
        //go
        it = sourceList.listIterator();
        int i = 1;
        List<List> resultsList = new ArrayList<>();
        List intermediateList = new ArrayList();
        while (it.hasNext()) {
            intermediateList.add(it.next());
            //System.out.println(it.next());
        // System.out.println(intermediateList);
            if(i==partsSize) {
                resultsList.add(intermediateList);
                intermediateList = new ArrayList();
                i=0;
            } 
            i++;
        }
        return resultsList;
    }
}
