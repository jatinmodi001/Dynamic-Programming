// Question : https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem/0

import java.util.*;
import java.lang.*;
import java.io.*;

class KnapSackProblem {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int T;
		T = scan.nextInt();
		while(T != 0)
		{
    		int N = scan.nextInt();
    		int W = scan.nextInt();
    		
    		int[] v = new int[N];
    		int[] wt = new int[N]; 
    		
    		for(int i=0 ; i<N ; i++)            // scanning prices
    		{
    		    v[i] = scan.nextInt();
    		}
    		
    		for(int i=0 ; i<N ; i++)            // scanning weights
    		{
    		    wt[i] = scan.nextInt();
    		}
    		
    		int arr[][] = new int[N+1][W+1];
    		
    		for(int i=0;i<=N;i++)
    		{
    		    for(int j=0;j<=W;j++)
    		    {
    		        if(i==0 || j==0)
    		        {
    		            arr[i][j] = 0;
    		        }
    		        else if(j < wt[i-1] )
    		        {
    		            arr[i][j] = arr[i-1][j];
    		        }
    		        else
    		        {
    		            arr[i][j] = max(v[i-1] + arr[i-1][j - wt[i-1]] , arr[i-1][j]);
    		        }
    		    }
    		}
    		System.out.println(arr[N][W]);
    		T--;
		}
	}
	static int max(int a,int b)
	{
	    return a > b ? a : b;
	}
}