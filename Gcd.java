package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Gcd
{
    public int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b, a%b);
    }
}