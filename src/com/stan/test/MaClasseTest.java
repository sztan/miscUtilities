/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.test;

import com.stan.listUtilities.*;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author stan
 */
public class MaClasseTest extends TestCase {

    static List sourceIn = new ArrayList();
    static List expectedOut = new ArrayList();
    static List utilTemp = new ArrayList();
    static List utilTemp2 = new ArrayList();
    static List utilTemp3 = new ArrayList();

    public static void testListDivider() throws Exception {
        
        //sourceIn :
        //["string",'c',[1,Object],["lonelyString"]]
        Object obj = new Object();

        sourceIn.add("string");
        sourceIn.add('c');
        utilTemp.add(1);
        utilTemp.add(obj);
        sourceIn.add(utilTemp);
        utilTemp = new ArrayList();
        utilTemp.add("lonelyString");
        sourceIn.add(utilTemp);


        //expectedOut with 2 as value for partsSize parameter:
        //[["string",'c'],[[1,Object],["lonelyString"]]]
        utilTemp = new ArrayList();

        utilTemp.add("string");
        utilTemp.add('c');
        expectedOut.add(utilTemp);

        utilTemp = new ArrayList();
        utilTemp.add(1);
        utilTemp.add(obj);
        utilTemp2.add(utilTemp);
        utilTemp3.add("lonelyString");
        utilTemp2.add(utilTemp3);
        expectedOut.add(utilTemp2);

        assertEquals(expectedOut, ListDivider.divide(sourceIn, 2));
    }
}
