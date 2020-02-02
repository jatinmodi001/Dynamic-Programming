// Problem : https://www.geeksforgeeks.org/count-number-of-ways-to-cover-a-distance/

import java.util.Scanner;

class CountNumberOfWaysToCoverDistance {
	public static void main (String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
	    int T = scan.nextInt();
	    while(T != 0)
	    {
	        int n = scan.nextInt();
	        int[] count = new int[n+1];
	        count[0] = 1;
	        count[1] = 1;
	        count[2] = 2;
	        for(int i=3;i<=n;i++)
	        {
	            count[i] = count[i-1] + count[i-2] + count[i-3];
	        }
	        System.out.println(count[n]);
	        T--;
	    }
	}
}