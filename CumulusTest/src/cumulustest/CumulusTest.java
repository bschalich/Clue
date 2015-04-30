/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cumulustest;
import java.util.*;
/**
 *
 * @author bennettschalich
 */
public class CumulusTest
{
   private static ArrayList<String> badWords;
   private static ArrayList<Word> wordList = new ArrayList<Word>();
   
   private static void generateWordCloud(int n)
   {
      Collections.sort(wordList, new MyWordComp());
      
      if (n > wordList.size())
      {
         n = wordList.size();
      }
      
      for (int i = 0; i < n; i++)
      {
         System.out.println((i + 1) + ": " + wordList.get(i).getWord() + "    count: " + wordList.get(i).getCount());
      }
   }
   
   private static void initBadWords()
   {
      String[] arr = {"it", "its", "it's", "the", "and", "but", "is", "a", 
            "an", "i", "I", "A", "An", "It", "Its", "It's", "And", "Is", "The"};
      
      List<String> l = Arrays.asList(arr);
      badWords = new ArrayList<String>(l);
   }
   
   private static void filterBadWords()
   {
      for (int i = 0; i < badWords.size(); i++)
      {
         for (Iterator<Word> it = wordList.iterator(); it.hasNext();)
         {
            if (it.next().getWord().equals(badWords.get(i)))
            {
               it.remove();
            }
         }
      }
   }
    private static void printWordList()
   {
      for (int i = 0; i < wordList.size(); i++)
      {
         System.out.print(i + ": " + wordList.get(i).getWord() + "   count: ");
         System.out.println(wordList.get(i).getCount().toString());
      }
   }
    
   private static void generateWords(ArrayList <String> ar)
   {
      boolean found = false;
      for (int i = 0; i < ar.size(); i++)
      {
         for (int j = 0; j < wordList.size(); j++)
         {
            System.out.print("wordList: " + wordList.get(j).getWord() + " ");
            System.out.println("ar: " + ar.get(i));
            System.out.println(wordList.get(j).getWord().equals(ar.get(i)));
            if (wordList.get(j).getWord().equals(ar.get(i)))
            {
                wordList.get(j).incrementCount();
                found = true;
                break;
            }
         }
         
         if (!found)
         {
             Word word = new Word (ar.get(i));
             wordList.add(word);
         }
      }
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("it");
        stringList.add("its");
	stringList.add("no");
        stringList.add("yes");
        stringList.add("yes");
	generateWords(stringList);
	
        printWordList();
        
        initBadWords();
        filterBadWords();
        
        printWordList();
        
        System.out.println("generateWordCloud\n");
        generateWordCloud(10);
    }
    
}
