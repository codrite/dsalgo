package com.codrite.dsalgo.problems;

import com.codrite.dsalgo.linklist.LinkList;

/**
 * No Copyright - only for learning and exploring
 * <p>
 * arnab@codrite.com
 * <p>
 * Creation Date/Time - 6/17/2015 7:01 PM
 */
public class SwapElementsInLinkList {

    private LinkList linkList;
    private Integer position;

    public SwapElementsInLinkList(LinkList linkList, Integer position) {
        this.linkList = linkList;
        this.position = position - 1;
    }

    public void verifyLinkList() {
        if (linkList == null)
            throw new RuntimeException("LinkList is null");

        long listSize = linkList.size();
        if (listIsEmpty(listSize) || positionExceedsListSize(listSize))
            throw new RuntimeException("Boundary conditions failed");

        if (listSize == 1)
            throw new RuntimeException("List size is 1, no swap possible");

        if (position == (listSize - position - 1)) {
            throw new RuntimeException("No swap needed");
        }

        if (listSize == 2)
            swapHeadAndTailElement(this.linkList);
    }

    public void execute() {
        LinkList linkListRemovedFromLeft = linkList.removeElementAt(position);
        linkList.addElementAt(linkListRemovedFromLeft, linkList.size() - position);

        LinkList linkListRemovedFromRight = linkList.removeElementAt(linkList.size() - position - 2);
        linkList.addElementAt(linkListRemovedFromRight, position);
    }

    private void swapHeadAndTailElement(LinkList linkList) {
        LinkList tailReference = linkList.getNext();

        linkList.setNext(null);
        tailReference.setNext(linkList);

        this.linkList = tailReference;
    }

    private boolean positionExceedsListSize(long listSize) {
        return position > listSize;
    }

    private boolean listIsEmpty(long listSize) {
        return listSize == 0;
    }

    public void print(){
        LinkList linkListIterator = this.linkList;
        while(linkListIterator != null) {
            if(linkListIterator.getNext() == null)
                System.out.print(linkListIterator);
            else
                System.out.print(linkListIterator + " - ");
            linkListIterator = linkListIterator.getNext();
        }
        System.out.println();
    }
}
