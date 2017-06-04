/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.test;

import com.stan.listUtilities.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author stan
 */
public class MaClasseTest extends TestCase {

    static boolean error;
    static List sourceIn = new ArrayList();
    static List<List> expectedOut;
    static Object obj = new Object();    

    public static void testListDivider() throws Exception {

        System.out.println("com.stan.test.MaClasseTest.testListDivider()\r\n");

        //sourceIn:
        //["cat",'c',[1,Object],["mouse"]]
        sourceIn
            = new ArrayList(
                Arrays.asList(
                    "cat",
                    'c',
                    Arrays.asList(
                        1,
                        obj
                    ),
                    Arrays.asList(
                        "mouse"
                    )
                )
            );
        
        //case when partsSize = 1
        expectedOut
            = new ArrayList<>(
                Arrays.asList(
                    Arrays.asList("cat"),
                    Arrays.asList('c'),
                    Arrays.asList(
                        Arrays.asList(
                            1,
                            obj
                        )
                    ),
                    Arrays.asList(
                        Arrays.asList("mouse")
                    )
                )
            );
        runTest(1, expectedOut, sourceIn, -1);
        runTest(2, expectedOut, sourceIn, 0);
        runTest(3, expectedOut, sourceIn, 1);

        //case when partsSize = 2
        expectedOut
            = new ArrayList<>(
                Arrays.asList(
                    Arrays.asList(
                        "cat",
                        'c'
                    ),
                    Arrays.asList(
                        Arrays.asList(
                            1,
                            obj
                        ),
                        Arrays.asList(
                            "mouse"
                        )
                    )
                )
            );
        runTest(4, expectedOut, sourceIn, 2);
        
        //case when partsSize = 3        
        expectedOut
            = new ArrayList(
                Arrays.asList(
                    Arrays.asList(
                        "cat",
                        'c',
                        Arrays.asList(
                            1,
                            obj
                        )
                    ),
                    Arrays.asList(
                        Arrays.asList(
                            "mouse"
                        )
                    )
                )
            );
        runTest(5, expectedOut, sourceIn, 3);
        
        //case when partsSize >= 4
        expectedOut
            = new ArrayList<>(
                Arrays.asList(sourceIn)
            );
        runTest(6, expectedOut, sourceIn, 4);        
        runTest(7, expectedOut, sourceIn, 5);
        
      }

    public static void runTest(int testNumber, List<List> expectedOut, List sourceIn, int partsSize) {
        System.out.println(" --- running test case #" + String.valueOf(testNumber) + " ---");
        System.out.println("source:\t\t" + sourceIn + "\r\npartsSize:\t" + partsSize + "\r\nexpectedOut:\t" + expectedOut);
        try {
            error = false;
            assertEquals(expectedOut, ListDivider.divide(sourceIn, partsSize));
        } catch (Exception e) {
            System.out.println("\r\n\t" + e.getMessage() + "\r\n");
            error = true;
        }
        if (!error) {
            System.out.println("\r\n\t" + String.valueOf(testNumber) + " passed\r\n");
        }
    }
}
