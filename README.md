# Clue
Virtual Clue Card Game

See the wiki [HERE](https://github.com/chpatton013/clue/wiki).

To get to the bulk of the source code go to src/com/outtatech/

Rules are explained in the wiki.

Readme Author: Bennett Schalich

Feel free to look at any of the source code. My particular piece of it is in src/com/outtatech/common
and src.
I was in charge of making the virtual cards and did so while taking advantage of inheritance. 

Card:
  "Card" is the superclass of all cards. Each card in the deck has a unique id. Each card has
  a "CardType", which is an enum that identifies the card as either a "Hint" or "Action" card

ActionCard:
  "ActionCard" is a super class to all of the action cards. It sets in its constructor that it is of "ACTION" type.
  "ActionCard" also has a type of its own which identifies what action it is.
  
"Actions":
There are five different actions that can be done in Clue: All Snoop, Private Tip, Snoop, Suggestion, Super Sleuth.
These are represented as classes. Depending upon the action of the card, instance variables and methods have been made to identify the specific action of the card. The card behavior is determined elsewhere and the behavior is based on the cards identity. For instance, the AllSnoop class has a boolean "right" which determines whether or not the action occurs to the right or left. 

"Hints" 



