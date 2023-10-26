package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class IsPalindrome
{
    public boolean ispalindrome(int n)
    {
        int r,s=0,temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s*10+r;
        }
        if(temp!=s)
        {
            return false;
        }
        return true;
    }
}