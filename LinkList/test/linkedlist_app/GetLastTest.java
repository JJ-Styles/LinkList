/** GetLastTest.java
 * program to unit-test the getLast method of class LinkedList
 * July 2015
 * @author Eudes Diemoz
 */
package linkedlist_app;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;


public class GetLastTest
{
    @BeforeClass
    public static void setUpClass()
    {
        System.out.println("\ntesting the getLast() method of class LinkedList\n");
    }
    
    
    /**
     * Test 1 of getLast method, of class LinkedList.
     */
    //@Ignore
    @Test
    public void test_emptyList_noDataReturned()
    {
        System.out.println("> Test1 - test_emptyList_noDataReturned(): should return sentinel value");
        int expResult = 999;
        System.out.print("creating an empty list...");
        LinkedList instance = new LinkedList();
        System.out.println("retrieving data value from last node of empty list...");
        int result = instance.getLast();
        // test value retrieved
        assertEquals(expResult, result);
        System.out.println("As expected, no data was retrieved");
    }
    
    
    /**
     * Test 2 of getLast method, of class LinkedList.
     */
    //@Ignore
    @Test
    public void test_nonEmptyList_correctDataReturned()
    {
        System.out.println("> Test2 - test_nonEmptyList_correctDataReturned(): should return value in last node of list");
        // create a non-empty list
        System.out.print("creating a non-empty list with an arbitrary number of nodes...");
        int[] a = {0, 0, 0, 0, 0};
        LinkedList instance = new LinkedList(a);
        // get to and mark end of list
        ListNode current = instance.getHead();
        int nodesInList = a.length;
        for (int i = 1; i < nodesInList; i++)
            current = current.getLink();
        int expResult = current.getData();
        System.out.println("retrieving data value from last node in non-empty list...");
        int result = instance.getLast();
        // test value retrieved
        assertEquals("mismatch between value found in last node and value retrieved", expResult, result);
        System.out.println("As expected, data from last node in list was successfully retrieved");
    }      
}
