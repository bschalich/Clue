/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cumulustest;

import java.util.Comparator;

/**
 *
 * @author bennettschalich
 */
public class MyWordComp implements Comparator<Word>
{
    @Override 
    public int compare (Word w1, Word w2)
    {
        if (w1.getCount() < w2.getCount())
            return 1;
        
        else
            return -1;
    }
}
