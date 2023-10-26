package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Lcm
{

    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }

    public int lcm(int a,int b)
    {
        int prod=a*b;
        return prod/gcd(a, b);
    }
}