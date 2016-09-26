package main.java.com.alexHomeBrew;

/**
 * Created by Alex on 9/25/16.
 */
public class Pair
{
    private int left = 0;
    private int right = 0;

    public Pair() {}

    public Pair(int left, int right)
    {
        this.left = left;
        this.right = right;
    }

    public int getLeft()
    {
        return left;
    }

    public void setLeft(int left)
    {
        this.left = left;
    }

    public int getRight()
    {
        return right;
    }

    public void setRight(int right)
    {
        this.right = right;
    }

    public String toString()
    {
        return "(" + left + "," + right + ")";
    }
}
