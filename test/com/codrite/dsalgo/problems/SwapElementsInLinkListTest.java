package com.codrite.dsalgo.problems;

import com.codrite.dsalgo.linklist.LinkListTest;
import com.codrite.dsalgo.problems.SwapElementsInLinkList;
import org.junit.Test;

/**
 * No Copyright - only for learning and exploring
 * <p>
 * arnab@codrite.com
 * <p>
 * Creation Date/Time - 6/17/2015 11:28 PM
 */
public class SwapElementsInLinkListTest extends LinkListTest {

    @Test(expected = RuntimeException.class)
    public void whenLinkListOfSizeOneSwapOperationThrowsException() {
        SwapElementsInLinkList swapOperationInLinkList = new SwapElementsInLinkList(createAListListWith(1), 0);
        swapOperationInLinkList.verifyLinkList();
    }

    @Test(expected = RuntimeException.class)
    public void whenLinkListIsNullSwapOperationThrowsException() {
        SwapElementsInLinkList swapOperationInLinkList = new SwapElementsInLinkList(null, 0);
        swapOperationInLinkList.verifyLinkList();
    }

    @Test(expected = RuntimeException.class)
    public void linkListWith3ElementsAndSwapPositionAt2ndPosition(){
        SwapElementsInLinkList swapElementsInLinkList = new SwapElementsInLinkList(createALinkListWithNRandomElement(3), 2);
        swapElementsInLinkList.verifyLinkList();
    }

    @Test
    public void linkListWith10ElementsAndSwapPositionAt2ndPosition(){
        SwapElementsInLinkList swapElementsInLinkList = new SwapElementsInLinkList(createALinkListWithNRandomElement(10), 2);
        swapElementsInLinkList.print();
        swapElementsInLinkList.verifyLinkList();
        swapElementsInLinkList.execute();
        swapElementsInLinkList.print();
    }

    @Test
    public void linkListWith11ElementsAndSwapPositionAt5ndPosition(){
        SwapElementsInLinkList swapElementsInLinkList = new SwapElementsInLinkList(createALinkListWithNRandomElement(10001), 6);
        swapElementsInLinkList.print();
        swapElementsInLinkList.verifyLinkList();
        swapElementsInLinkList.execute();
        swapElementsInLinkList.print();
    }

}