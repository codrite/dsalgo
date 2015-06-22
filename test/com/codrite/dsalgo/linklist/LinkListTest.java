package com.codrite.dsalgo.linklist;

import org.junit.Assert;
import org.junit.Test;

/**
 * No Copyright - only for learning and exploring
 * <p>
 * arnab@codrite.com
 * <p>
 * Creation Date/Time - 6/17/2015 10:30 PM
 */
public class LinkListTest {

    protected LinkList createAListListWith(int element){
        LinkList linkList = new LinkList(element);
        return linkList;
    }

    protected LinkList createALinkListWithNRandomElement(int N){
        LinkList linkListWithNElements = new LinkList(0);
        for(int i = 1 ; i < N; i++){
            linkListWithNElements.addNext(i);
        }
        return linkListWithNElements;
    }

    @Test
    public void verifyLinkListCreatedWithValueOne(){
        Assert.assertEquals(1, createAListListWith(1).size());
    }

    @Test
    public void verifyLinkListCreatedWith10Elements(){
        Assert.assertEquals(10, createALinkListWithNRandomElement(10).size());
    }

}