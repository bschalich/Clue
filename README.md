# Clue
Virtual Clue Card Game

See the wiki [HERE](https://github.com/chpatton013/clue/wiki).

To get to the bulk of the source code go to src/com/outtatech/

Rules are explained in the wiki.

Readme Author: Bennett Schalich

Feel free to look at any of the source code. My particular piece of it is in src/com/outtatech/common
and unit tests for this code are in test/com/outtatech/common. I was in charge of making the virtual cards and did so while taking advantage of inheritance and typing systems. The heirarchy I have created serves as a easy method for identifying cards. There is a uml diagram with the source that describes the relationship of these classes.

Card:
  "Card" is the superclass of all cards. Each card in the deck has a unique id. Each card has
  a "CardType", which is an enum that identifies the card as either a "Hint" or "Action" card

ActionCard:
  "ActionCard" is a super class to all of the action cards. It sets in its constructor that it is of "ACTION" type.
  "ActionCard" also has a type of its own which identifies what action it is.
  
"Actions":
  There are five different actions that can be done in Clue: All Snoop, Private Tip, Snoop, Suggestion, Super 
  Sleuth. These are represented as classes. Depending upon the action of the card, instance variables (mostly
  enums) and methods have been made to identify the specific action of the card. The card behavior is determined
  elsewhere and the behavior is based on the cards identity. For instance, the AllSnoop class has a boolean "right"
  which determines whether or not the action occurs to the right or left. 

HintCard:
  "HintCard" follows the same pattern as "ActionCard" just for hint cards.

"Hints":
  There are three different types of hints that exist in Clue: Destination, Vehicle, Suspect. When players are able   to view hint cards it allows them to narrow down the possibilities of who committed the crime. 

SuspectCard:
  Each suspect card has a "SuspectID" and a "Gender". "SuspectID" is an enum that corresponds to names and "Gender"   is an enum corresponding to MALE or FEMALE.
  
VehicleCard:
  Each "VehicleCard" has a "VechicleID", an enum that specifies the type of vehicle, a boolean describing whether
  or not the vehicle is airborne, and a "CardColor", an enum that specifies the color of the card. "CardColor" and   the airborne boolean exist because certain action cards involve those attributes.

DestinationCard:
  Each "DestinationCard" has a "DestinationID", and enum that specifies the destination, a boolean determining 
  whether the destination is north or south, and a boolean determining whether the destination is east or
  west. The booleans exist because certain action cards involve those attributes.  

Behavior:
  The ServerController under com/outtatech/server controls the behavior for these cards. It identifies the card
  using the heirarchy and acts appropriately.
  
Alternative Strategies for cards:
  Another way to have done this, and in my opinion an inferior way, is to have a pool of cards directly from the
  "Card" class. This would necessitate there be many instance variables in the class to identify the type of card.
  The inheritance structure allows for a specific card to be traversed like a binary tree, with the leaves being a
  specific card like a particular All Snoop or Vehicle card.

Solution:
  A solution consists of three different enums: DestinationID, VehicleID, and SuspectID. A solution consists
  of a vehicle, a destination, and a suspect so these three enums together specify a solution.

Player:
  An interface outlining the base functionality for a player
  
Unit Tests:
  Most if not all of the classes have unit tests testing in depth each method. I wont go into detail on them, but    feel free to look through to see the coverage. My IED indicated 100% coverage for all methods.

The project as a whole was a major undertaking. We used the full software lifecycle (Waterfall) all of which is documented in the wiki. It was a fun project and a great experience to gain an understanding of real world software production.



