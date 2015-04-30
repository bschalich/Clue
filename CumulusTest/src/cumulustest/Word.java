/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cumulustest;

/**
 *
 * @author bennettschalich
 */
public class Word 
{
   private String word;
   private Integer count;
   
   public Word(String word)
   {
      this.word = word;
      count = 1;
   }
   
   public String getWord()
   {
      return word;
   }
   
   public Integer getCount()
   {
      return count;
   }
   
   public void incrementCount()
   {
      count++;
   }
}
