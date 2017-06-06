/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.listUtilities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stan
 */
public final class ListDivider {

    private ListDivider() {
    }

    /**
     * Splits the array passed as parameter into several sublists with size
     * equals to the second parameter.
     *
     * @param sourceList The list to divide.
     * @param partsSize The wished size for each parts.
     * @return A list containing the sublists.
     */
    
    public static List<List> divide (List sourceList, int partsSize) {
       
       //first check if partsSize is valid        
        try {
            if (partsSize < 1) { // negative or zero values changed to 1
                partsSize = 1;
                throw new Exception("The size for the subLists must be at least 1: partsSize has been set to 1");
            } else if (partsSize > sourceList.size()) { // bigger than source size values changed to list size
                partsSize = sourceList.size();
                throw new Exception("The size for the subLists must be at most the list size: partsSize has been set to " + sourceList.size());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //ready
        
        //quick analysis:
        int completeParts = sourceList.size() / partsSize; //will be as many complete subLists
        int remainingElements = sourceList.size() % partsSize; // the remaining elements
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
