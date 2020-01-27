
// Problem : https://practice.geeksforgeeks.org/problems/coin-change/0

import java.util.*;
import java.lang.*;
import java.io.*;

class CoinChange {
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		while(T != 0)
		{
		    int n = scan.nextInt();
		    int[] coins = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        coins[i] = scan.nextInt();
		    }
		    
		    int cent = scan.nextInt();
		    int[][] arr = new int[n+1][cent+1];
		    
		    for(int i=0;i<=n;i++)
		    {
		        for(int j=0;j<=cent;j++)
		        {
		            if(j == 0)
		            {
		                arr[i][j] = 1;
		            }
		            else if(i == 0)
		            {
		                arr[i][j] = 0;
		            }
		            else if(j < coins[i-1])
		            {
		                arr[i][j] = arr[i-1][j];
		            }
		            else
		            {
		                arr[i][j] = arr[i-1][j] + arr[i][j-coins[i-1]];
		            }
		        }
		    }
		    System.out.println(arr[n][cent]);
		    T--;
		}
	}
}