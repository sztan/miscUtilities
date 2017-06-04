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

    public static void divide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ListDivider() {
    }

    /**
     * Splits the array passed as parameter into several sublists with size
     * equals to the second parameter.
     *
     * @param sourceList The list to divide.
     * @param partsSize The wished size for each parts.
     * @return A list containing the sublists.
     * @throws Exception if partsSize is incorrect.
     */
    
    public static List<List> divide (List sourceList, int partsSize) throws Exception {
       
       //first check if partsSize is valid        
        try {
            if (partsSize < 1) {
                partsSize = 1;
                throw new Exception("The size for the subLists must be at least 1: partsSize has been set to 1");
            } else if (partsSize > sourceList.size()) {
                partsSize = sourceList.size();
                throw new Exception("The size for the subLists must be at most the list size: partsSize has been set to " + sourceList.size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        int completeParts = sourceList.size() / partsSize; //will be as many subLists
        int remainingElements = sourceList.size() % partsSize; // the possibly more little last sublist
        List<List> resultList = new ArrayList<>();
        
        int turn = 1;
        while (completeParts>0) {
            resultList.add(sourceList.subList(0 + ((turn-1) * partsSize), partsSize + ((turn-1) * partsSize)));
            completeParts--;
            turn++;
        }
        if (remainingElements > 0) {
            resultList.add(sourceList.subList((turn-1) * partsSize, (turn-1) * partsSize + remainingElements));
        }
        return resultList;      
    }
    
}
