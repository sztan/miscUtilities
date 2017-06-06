/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junits;

import com.stan.listUtilities.ListDivider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author stan
 */
public class testListDividerDivide {

    List<List> expectedOut;
    static Object obj = new Object();
    static List sourceIn;

    public testListDividerDivide() {
    }

    @BeforeClass
    public static void setUpClass() {
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
        System.out.println("entrée utilisée pour les tests: " + sourceIn + "\r\n");
    }

   /* @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }*/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testm1() { // less than 0
        System.out.println("case when partsSize = -1");
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
        assertEquals(expectedOut, ListDivider.divide(sourceIn, -1));
        System.out.println("test passed" + "\r\n");
    }

    @Test
    public void test0() { // 0
        System.out.println("case when partsSize = 0");
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
        assertEquals(expectedOut, ListDivider.divide(sourceIn, 0));
        System.out.println("test passed" + "\r\n");
    }

    @Test
    public void test1() { // 1
        System.out.println("case when partsSize = 1");
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
        assertEquals(expectedOut, ListDivider.divide(sourceIn, 1));
        System.out.println("test passed" + "\r\n");
    }

    @Test
    public void test2() {
        System.out.println("case when partsSize = 2");
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
        assertEquals(expectedOut, ListDivider.divide(sourceIn, 2));
        System.out.println("test passed" + "\r\n");
    }

    @Test
    public void test3() {
        System.out.println("case when partsSize = 3");
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
        assertEquals(expectedOut, ListDivider.divide(sourceIn, 3));
        System.out.println("test passed" + "\r\n");
    }

    @Test
    public void test4() {
        System.out.println("case when partsSize = 4");
        expectedOut
            = new ArrayList<>(
                Arrays.asList(sourceIn)
            );
        assertEquals(expectedOut, ListDivider.divide(sourceIn, 4));
        System.out.println("test passed" + "\r\n");
    }

    @Test
    public void test5() { // bigger than source size
        System.out.println("case when partsSize = 5");
        expectedOut
            = new ArrayList<>(
                Arrays.asList(sourceIn)
            );
        assertEquals(expectedOut, ListDivider.divide(sourceIn, 5));
        System.out.println("test passed" + "\r\n");
    }

}
