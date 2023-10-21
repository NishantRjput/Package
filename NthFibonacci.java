package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class NthFibonacci
{
    public int nthfibonacci(int n)
    {
        if(n==0||n==1)
        {
            return n;
        }
        int l=0,m=1,k=0;
        for(int i=2;i<=n;i++)
        {
            k=l+m;
            l=m;
            m=k;
        }
        return k;
    }
}