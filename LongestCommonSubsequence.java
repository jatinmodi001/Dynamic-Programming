// Problem : https://practice.geeksforgeeks.org/problems/longest-common-subsequence/0

import java.util.*;
import java.lang.*;
import java.io.*;

class LongestCommonSubsequence {
	public static void main (String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int T = scan.nextInt();
	    while(T != 0)
	    {
	        int A = scan.nextInt();
	        int B = scan.nextInt();
    	    String str1 = scan.next();
    	    String str2 = scan.next();
    	    
    	    int arr[][] = new int[A+1][B+1];
    	    
    	    for(int i=0;i<=A;i++)
    	    {
    	        for(int j=0;j<=B;j++)
    	        {
    	            if(i==0 || j==0)
    	            {
    	                arr[i][j] = 0;
    	            }
    	            else if(str1.charAt(i-1) != str2.charAt(j-1))
    	            {
    	                arr[i][j] = max(arr[i-1][j],arr[i][j-1]);
    	            }
    	            else
    	            {
                        arr[i][j] = arr[i-1][j-1] + 1;    
    	            }
    	        }
    	    }
    	    System.out.println(arr[A][B]);
    	    T--;
	    }
	}
	static int max(int a,int b)
	{
	    return a > b ? a : b;
	}
}