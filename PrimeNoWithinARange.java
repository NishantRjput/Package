package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class PrimeNoWithinARange
{
    public ArrayList<Integer> primenowithinarange(int n)
    {
         ArrayList<Integer> al = new ArrayList<>();
       

        boolean isPrime[]= new boolean[n+1];
        Arrays.fill(isPrime,true);

        for(int i=2;i*i<=n;i++)
        {
            if(isPrime[i])
            {
                for(int j=2*i;j<=n;j=j+i)
                {
                    isPrime[j]=false;
                }
            }
        }
       

        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
            {
                al.add(i);
            }
        }
        return al;
    }
}
