package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class NoOfDigitsInAGivenNo
{
    public int noofdigitsinagivenno(int n)
    {
        int count=0;
        while(n>0)
        {
            count=count+1;
            n=n/10;
        }
        return count;
    }
}
