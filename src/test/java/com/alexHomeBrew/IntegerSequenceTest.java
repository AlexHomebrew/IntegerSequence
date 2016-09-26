package test.java.com.alexHomeBrew;

import main.java.com.alexHomeBrew.IntegerSequence;
import main.java.com.alexHomeBrew.Pair;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Alex on 9/25/16.
 */
public class IntegerSequenceTest
{
    protected IntegerSequence is;
    List<Pair> reiResult;

    @Before
    public void setup()
    {
        is = new IntegerSequence();

        reiResult = new ArrayList<>();
        reiResult.add(new Pair(0,5));
        reiResult.add(new Pair(6,8));
        reiResult.add(new Pair(9,11));
        reiResult.add(new Pair(13,14));

    }

    @Test
    public void reiSequenceTest() throws Exception
    {
        int[] testArray = {1,2,3,4,5,6,3,6,8,5,8,9,4,3,5};

        List<Pair> result = is.getSequence(testArray);

        assertEquals(reiResult.toString(), result.toString());
    }

    @Test
    public void emptySequenceTest() throws Exception
    {
        int[] testArray = {};
        List<Pair> emptyResult = new ArrayList<>();

        List<Pair> result = is.getSequence(testArray);

        assertEquals(emptyResult.toString(), result.toString());
    }

    @Test
    public void noneSequenceTest() throws Exception
    {
        int[] testArray = {11,10,9,8,7,6,5,4,3,2,1,0};
        List<Pair> emptyResult = new ArrayList<>();

        List<Pair> result = is.getSequence(testArray);

        assertEquals(emptyResult.toString(), result.toString());
    }

    @Test
    public void singleSequenceTest() throws Exception
    {
        int[] testArray = {11};
        List<Pair> emptyResult = new ArrayList<>();

        List<Pair> result = is.getSequence(testArray);

        assertEquals(emptyResult.toString(), result.toString());
    }

    @Test
    public void allSequenceTest() throws Exception
    {
        int[] testArray = {-6,-2,3,4,5,6,7,8,9,10,13,15};
        List<Pair> allResult = new ArrayList<>();
        allResult.add(new Pair(0,11));

        List<Pair> result = is.getSequence(testArray);

        assertEquals(allResult.toString(), result.toString());
    }

    @Test
    public void startAndEndSequenceTest() throws Exception
    {
        int[] testArray = {44,2,3,4,5,6,7,8,9,10,13,15,3};
        List<Pair> allResult = new ArrayList<>();
        allResult.add(new Pair(1,11));

        List<Pair> result = is.getSequence(testArray);

        assertEquals(allResult.toString(), result.toString());
    }
}