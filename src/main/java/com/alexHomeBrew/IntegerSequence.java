package main.java.com.alexHomeBrew;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Peter-Contesse on 9/25/16.
 */
public class IntegerSequence
{

    /**
     * Scans the given list for increasing sequences.  Returns a set of indecies of the start and end of each sequence.
     * Sequences of a single entry are ignored.
     * @param intList
     */
    public List<Pair> getSequence(int[] intList)
    {
        List<Pair> returnValue = new ArrayList<>();
        if (intList.length == 0)
        {
            return returnValue;
        }
        int startIndex = 0;
        int endIndex;
        int lastValue = intList[0];
        //walk through the list
        for (int index = 1; index < intList.length ; index++)
        {
            if (intList[index] > lastValue)
            {
                lastValue = intList[index];
                if (index == intList.length - 1)
                {
                    if (index > startIndex)
                    {
                        //Add a new index pair to the return
                        returnValue.add(new Pair(startIndex, index));
                    }
                }
            }
            else //End of sequence detected
            {
                endIndex = index - 1;
                if (endIndex > startIndex)
                {
                    //Add a new index pair to the return
                    returnValue.add(new Pair(startIndex, endIndex));
                }
                //Start a new pair
                startIndex = index;
                lastValue = intList[index];
            }
        }
        //return the pairs
        return returnValue;
    }
}
