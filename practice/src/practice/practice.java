package practice;

import java.io.BufferedReader;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.io.InputStream;
import java.io.InputStreamReader;

public class practice 
{
     public static void main(String args[])throws IOException
     {
	 int f3 = 0;
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter f1 and f2 values:");
     System.out.println("enter values");
     
     int f1=Integer.parseInt(br.readLine());
     int f2=Integer.parseInt(br.readLine());
     for(int i=0;i<5;i++)
     {
         f3 =f1+f2;
         f2=f3;
         f1=f2;
     }

       System.out.println("fibonacci upto 5 is:" + f3);
     }  
}
