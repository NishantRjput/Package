package pack;
import java.util.*;
import java.io.*;
import java.lang.*;


public class Factorial
{
    public long factorial(int n)
    {
        
        long fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=(fact*i)%1000000007;
        }
        return fact;
    }
}