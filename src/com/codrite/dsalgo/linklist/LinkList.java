package com.codrite.dsalgo.linklist;

/**
 * No Copyright - only for learning and exploring
 * <p>
 * arnab@codrite.com
 * <p>
 * Creation Date/Time - 6/17/2015 10:25 PM
 */
public class LinkList {

    private int value;
    private LinkList next;

    public LinkList(int value) {
        this.value = value;
    }

    public void addNext(int nextValue){
        LinkList linkListReference = this;
        while(linkListReference.next != null) {
            linkListReference = linkListReference.next;
        }
        linkListReference.next = new LinkList(nextValue);
    }

    public LinkList removeElementAt(long position){
        int currentPosition = 0;
        LinkList linkListReference = this;
        while(linkListReference.next != null && (currentPosition < position - 1)) {
            currentPosition++;
            linkListReference = linkListReference.next;
        }
        LinkList nodeOfReferenceForRemoval = linkListReference.next;
        linkListReference.setNext(linkListReference.next.next);

        nodeOfReferenceForRemoval.setNext(null);
        return nodeOfReferenceForRemoval;
    }

    public void addElementAt(LinkList list, long position){
        int currentPosition = 0;
        LinkList linkListReference = this;
        while(linkListReference.next != null && (currentPosition < position - 1)) {
            currentPosition++;
            linkListReference = linkListReference.next;
        }
        LinkList nextNodeInList = linkListReference.next;
        list.setNext(nextNodeInList);
        linkListReference.setNext(list);
    }

    public long size(){
        LinkList linkListIterator = this;
        long count = 0;
        while(linkListIterator != null){
            linkListIterator = linkListIterator.next;
            count++;
        }
        return count;
    }

    public LinkList getNext() {
        return next;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }

    public void setNext(LinkList next) {
        this.next = next;
    }
}
