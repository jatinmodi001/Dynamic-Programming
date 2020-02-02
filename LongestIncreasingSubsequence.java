/*package whatever //do not write package name here */

// Question : https://practice.geeksforgeeks.org/problems/longest-increasing-subsequence/0

import java.util.*;
import java.lang.*;
import java.io.*;

class LongestIncreasingSubsequence {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int T = scan.nextInt();
	    while(T != 0)
	    {
	        int N = scan.nextInt();
	        int[] arr = new int[N];
	        int[] length = new int[N];
	        int max_length = 1;
	        for(int i=0;i<N;i++)
	        {
	            arr[i] = scan.nextInt();
	            length[i] = 1;
	        }
	        
	        for(int i=1;i<N;i++)
	        {
	            for(int j=0;j<i;j++)
	            {
	                if(arr[i] > arr[j])
	                {
	                    length[i] = max(length[i],length[j]+1);
	                    max_length = length[i] > max_length ? length[i] : max_length;
	                }
	            }
	        }
	        System.out.println(max_length);
	        T--;
	    }
	}
	static int max(int a,int b)
	{
	    return a > b ? a : b;
	}
}