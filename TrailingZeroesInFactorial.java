package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class TrailingZeroesInFactorial
{
    public int trailingzeroesinfactorial(int n)
    {
        if(n<5)
        {
            return 0;
        }
        int res=0;
        for(int i=5;i<=n;i=i*5)
        {
            res=res+n/i;
        }
        return res;
    }
}
