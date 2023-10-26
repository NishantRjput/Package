package pack;
import java.util.*;
import java.io.*;
import java.lang.*;

public class IsArmstrong
{
    public boolean isarmstrong(int n)
    {
        String s1=String.valueOf(n);
        int length=s1.length();
        int r,s=0,temp=n;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            s=s+(int)(Math.pow(r,length));
        }
        if(temp!=s)
        {
            return false;
        }
        return true;
    }
}