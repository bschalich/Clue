package com.outtatech.client.messaging;

import com.outtatech.common.ActionCard;
import com.outtatech.common.Card;
import com.outtatech.common.CardType;
import com.outtatech.common.*;
import java.util.List;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author bennettschalich
 */
public class ActionRequestTest
{
    
    /**
     *
     */
    public ActionRequestTest()
    {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    /**
     *
     */
    @Before
    public void setUp()
    {
    }
    
    /**
     *
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getActionCard method, of class ActionRequest.
     */
    @Test
    public void testGetActionCard()
    {
        System.out.println("getActionCard");
<<<<<<< HEAD
        
        Snoop s = new Snoop();
        
        ActionRequest instance = new ActionRequest(s, 2);
        ActionCard expResult = s;
        ActionCard result = instance.getActionCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCards method, of class ActionRequest.
     */
=======

        ActionCard card = new ActionCard(ActionCardType.ALL_SNOOP);
        
        ActionRequest instance = new ActionRequest(card, 2);
        ActionCard expResult = card;
        ActionCard result = instance.getActionCard();
        assertEquals(expResult, result);
    }
>>>>>>> FETCH_HEAD
    
    /**
     * Test of getPlayerId method, of class ActionRequest.
     */
    @Test
    public void testGetPlayerId()
    {
        System.out.println("getPlayerID");
        
<<<<<<< HEAD
        Snoop s = new Snoop();
        
        ActionRequest instance = new ActionRequest(s, 2);
=======
        ActionCard card = new ActionCard(ActionCardType.ALL_SNOOP);
        
        ActionRequest instance = new ActionRequest(card, 2);
>>>>>>> FETCH_HEAD
        Integer expResult = 2;
        Integer result = instance.getPlayerId();
        assertEquals(expResult, result);
    }
}
