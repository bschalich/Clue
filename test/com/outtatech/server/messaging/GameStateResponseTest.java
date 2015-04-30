package com.outtatech.server.messaging;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.outtatech.common.*;

/**
 *
 * @author dmangin
 */
public class GameStateResponseTest {
    /**
     * Test of getDeckCardCount method, of class GameStateResponse.
     */
    @Test
    public void testGetDeckCardCount() {
        
<<<<<<< HEAD
        System.out.println("getDeckCardCount");
=======
        Integer deck = new Integer("10");
>>>>>>> FETCH_HEAD
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
        Integer activePlayer = new Integer("4");
        Map<Integer, String> players = new HashMap<Integer, String>();
<<<<<<< HEAD
        players.put(4, "Bob");
        
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new VehicleCard(VehicleID.AIRLINER, CardColor.BLUE));
        
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new PrivateTip(PrivateTipType.ALL_DESTINATIONS));
        
        Map<DestinationID, Integer> destToPlayerId = 
                new HashMap<DestinationID, Integer>();
        destToPlayerId.put(DestinationID.CONEY_ISLAND, 5);
        
        GameStateResponse instance = new GameStateResponse(32, temp, 2
                , players, hc, ac, destToPlayerId);
=======
        players.put(5, "player1");
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new HintCard(HintCardType.SUSPECT));
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new ActionCard(ActionCardType.ALL_SNOOP));
        Map<DestinationID, Integer> destToPlayer = new HashMap<DestinationID, Integer>();
        destToPlayer.put(DestinationID.NIAGRA_FALLS, 5);
        
        GameStateResponse instance = new GameStateResponse(deck, temp, activePlayer,
                players, hc, ac, destToPlayer);
>>>>>>> FETCH_HEAD
                
        Integer expResult = 10;
        Integer result = instance.getDeckCardCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayerTurnOrder method, of class GameStateResponse.
     */
    @Test
    public void testGetPlayerTurnOrder() {
<<<<<<< HEAD
        System.out.println("getPlayerTurnOrder");
=======
        
        Integer deck = new Integer("10");
>>>>>>> FETCH_HEAD
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
<<<<<<< HEAD
        System.out.println("getDeckCardCount");
        Map<Integer, String> players = new HashMap<Integer, String>();
     
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new VehicleCard(VehicleID.AIRLINER, CardColor.BLUE));
        
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new PrivateTip(PrivateTipType.ALL_DESTINATIONS));
        
        Map<DestinationID, Integer> destToPlayerId = 
                new HashMap<DestinationID, Integer>();
        destToPlayerId.put(DestinationID.CONEY_ISLAND, 5);
        
        GameStateResponse instance = new GameStateResponse(32, temp, 2
                , players, hc, ac, destToPlayerId);
=======
        Integer activePlayer = new Integer("4");
        Map<Integer, String> players = new HashMap<Integer, String>();
        players.put(5, "player1");
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new HintCard(HintCardType.SUSPECT));
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new ActionCard(ActionCardType.ALL_SNOOP));
        Map<DestinationID, Integer> destToPlayer = new HashMap<DestinationID, Integer>();
        destToPlayer.put(DestinationID.NIAGRA_FALLS, 5);
        
        GameStateResponse instance = new GameStateResponse(deck, temp, activePlayer,
                players, hc, ac, destToPlayer);
>>>>>>> FETCH_HEAD
        
        List<Integer> expResult = temp;
        List<Integer> result = instance.getPlayerTurnOrder();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentActivePlayer method, of class GameStateResponse.
     */
    @Test
    public void testGetCurrentActivePlayer() {
<<<<<<< HEAD
        System.out.println("getCurrentActivePlayer");
=======
        
        Integer deck = new Integer("10");
>>>>>>> FETCH_HEAD
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
<<<<<<< HEAD
        System.out.println("getDeckCardCount");
        Map<Integer, String> players = new HashMap<Integer, String>();
     
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new VehicleCard(VehicleID.AIRLINER, CardColor.BLUE));
        
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new PrivateTip(PrivateTipType.ALL_DESTINATIONS));
        
        Map<DestinationID, Integer> destToPlayerId = 
                new HashMap<DestinationID, Integer>();
        destToPlayerId.put(DestinationID.CONEY_ISLAND, 5);
        
        GameStateResponse instance = new GameStateResponse(32, temp, 2
                , players, hc, ac, destToPlayerId);
=======
        Integer activePlayer = new Integer("4");
        Map<Integer, String> players = new HashMap<Integer, String>();
        players.put(5, "player1");
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new HintCard(HintCardType.SUSPECT));
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new ActionCard(ActionCardType.ALL_SNOOP));
        Map<DestinationID, Integer> destToPlayer = new HashMap<DestinationID, Integer>();
        destToPlayer.put(DestinationID.NIAGRA_FALLS, 5);
>>>>>>> FETCH_HEAD
        
        GameStateResponse instance = new GameStateResponse(deck, temp, activePlayer,
                players, hc, ac, destToPlayer);
        
        Integer expResult = activePlayer;
        Integer result = instance.getCurrentActivePlayer();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getCurrentActivePlayer method, of class GameStateResponse.
     */
    @Test
    public void testGetPlayers() {
<<<<<<< HEAD
        System.out.println("getPlayers");
=======
        Integer deck = new Integer("10");
>>>>>>> FETCH_HEAD
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
<<<<<<< HEAD
        System.out.println("getDeckCardCount");
        Map<Integer, String> players = new HashMap<Integer, String>();
     
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new VehicleCard(VehicleID.AIRLINER, CardColor.BLUE));
        
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new PrivateTip(PrivateTipType.ALL_DESTINATIONS));
        
        Map<DestinationID, Integer> destToPlayerId = 
                new HashMap<DestinationID, Integer>();
        destToPlayerId.put(DestinationID.CONEY_ISLAND, 5);
        
        GameStateResponse instance = new GameStateResponse(32, temp, 2
                , players, hc, ac, destToPlayerId);
=======
        Integer activePlayer = new Integer("4");
        Map<Integer, String> players = new HashMap<Integer, String>();
        players.put(5, "player1");
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new HintCard(HintCardType.SUSPECT));
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new ActionCard(ActionCardType.ALL_SNOOP));
        Map<DestinationID, Integer> destToPlayer = new HashMap<DestinationID, Integer>();
        destToPlayer.put(DestinationID.NIAGRA_FALLS, 5);
        
        GameStateResponse instance = new GameStateResponse(deck, temp, activePlayer,
                players, hc, ac, destToPlayer);
>>>>>>> FETCH_HEAD
        
        Map<Integer, String> expResult = players;
        Map<Integer, String> result = instance.getPlayers();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getCurrentActivePlayer method, of class GameStateResponse.
     */
    @Test
    public void testGetHintCards() {
<<<<<<< HEAD
        System.out.println("getHintCards");
=======
        Integer deck = new Integer("10");
>>>>>>> FETCH_HEAD
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
<<<<<<< HEAD
        System.out.println("getDeckCardCount");
        Map<Integer, String> players = new HashMap<Integer, String>();
     
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new VehicleCard(VehicleID.AIRLINER, CardColor.BLUE));
        
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new PrivateTip(PrivateTipType.ALL_DESTINATIONS));
        
        Map<DestinationID, Integer> destToPlayerId = 
                new HashMap<DestinationID, Integer>();
        destToPlayerId.put(DestinationID.CONEY_ISLAND, 5);
        
        GameStateResponse instance = new GameStateResponse(32, temp, 2
                , players, hc, ac, destToPlayerId);
=======
        Integer activePlayer = new Integer("4");
        Map<Integer, String> players = new HashMap<Integer, String>();
        players.put(5, "player1");
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new HintCard(HintCardType.SUSPECT));
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new ActionCard(ActionCardType.ALL_SNOOP));
        Map<DestinationID, Integer> destToPlayer = new HashMap<DestinationID, Integer>();
        destToPlayer.put(DestinationID.NIAGRA_FALLS, 5);
        
        GameStateResponse instance = new GameStateResponse(deck, temp, activePlayer,
                players, hc, ac, destToPlayer);
>>>>>>> FETCH_HEAD
        
        List<HintCard> expResult = hc;
        List<HintCard> result = instance.getHintCards();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetActionCards()
    {
        System.out.println("getActionCards");
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
        System.out.println("getDeckCardCount");
        Map<Integer, String> players = new HashMap<Integer, String>();
     
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new VehicleCard(VehicleID.AIRLINER, CardColor.BLUE));
        
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new PrivateTip(PrivateTipType.ALL_DESTINATIONS));
        
        Map<DestinationID, Integer> destToPlayerId = 
                new HashMap<DestinationID, Integer>();
        destToPlayerId.put(DestinationID.CONEY_ISLAND, 5);
        
        GameStateResponse instance = new GameStateResponse(32, temp, 2
                , players, hc, ac, destToPlayerId);
        
        List<ActionCard> expResult = ac;
        List<ActionCard> result = instance.getActionCards();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetDestToPlayerID()
    {
        System.out.println("getDestToPlayerID");
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
        System.out.println("getDeckCardCount");
        Map<Integer, String> players = new HashMap<Integer, String>();
     
        List<HintCard> hc = new ArrayList<HintCard>();
        hc.add(new VehicleCard(VehicleID.AIRLINER, CardColor.BLUE));
        
        List<ActionCard> ac = new ArrayList<ActionCard>();
        ac.add(new PrivateTip(PrivateTipType.ALL_DESTINATIONS));
        
        Map<DestinationID, Integer> destToPlayerId = 
                new HashMap<DestinationID, Integer>();
        destToPlayerId.put(DestinationID.CONEY_ISLAND, 5);
        
        GameStateResponse instance = new GameStateResponse(32, temp, 2
                , players, hc, ac, destToPlayerId);
        
        Map<DestinationID, Integer> expResult = destToPlayerId;
        Map<DestinationID, Integer> result = instance.getDestToPlayerID();
        assertEquals(expResult, result);
    }
            
}
